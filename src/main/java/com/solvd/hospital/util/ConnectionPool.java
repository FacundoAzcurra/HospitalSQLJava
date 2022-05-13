package com.solvd.hospital.util;


import org.apache.commons.dbcp2.BasicDataSource;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConnectionPool{

    private final String URL = Constants.URL;

    private final String USER = Constants.USER;

    private final String PASS = Constants.PASS;

    private static ConnectionPool datasource;

    private BasicDataSource dataSource;

    private final static int MAX_CONNECTIONS = DBPropertiesUtil.getInt(Constants.MAX_CONNECTIONS);

    private int createdConnectionsAmount = 0;

    private final List<Connection> connectionList = new ArrayList<>(MAX_CONNECTIONS);
    private ConnectionPool() {
        dataSource = new BasicDataSource();
        dataSource.setUsername(USER);
        dataSource.setPassword(PASS);
        dataSource.setUrl(URL);
        dataSource.setInitialSize(2);
        dataSource.setMinIdle(3);
        dataSource.setMaxIdle(20);
        dataSource.setMaxTotal(40);
        dataSource.setMaxWaitMillis(10000);
    }

    public static ConnectionPool getInstance() {
        if (datasource == null) {
            datasource = new ConnectionPool();
            return datasource;
        } else {
            return datasource;
        }
    }

    public Connection getConnection() throws ConnectException {
        if(!connectionList.isEmpty()){
            return connectionList.remove(0);
        }else if(createdConnectionsAmount < MAX_CONNECTIONS){
            return createConnection();
        } else {
            throw new ConnectException("There are no available connections.");
        }
    }

    private Connection createConnection(){
        Connection conn = null;
        try{
            conn = this.dataSource.getConnection();
            createdConnectionsAmount ++;
        } catch (SQLException ex){
            ex.printStackTrace();
        } return conn;
    }

    public void returnConnection(Connection connection){
        connectionList.add(connection);
    }


}
