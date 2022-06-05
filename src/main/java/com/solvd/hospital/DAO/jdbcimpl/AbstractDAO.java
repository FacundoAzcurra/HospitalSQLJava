package com.solvd.hospital.DAO.jdbcimpl;

import com.solvd.hospital.util.ConnectionPool;

import java.net.ConnectException;
import java.sql.Connection;

public  class AbstractDAO {

    public synchronized Connection getConnection() throws ConnectException {
        return ConnectionPool.getInstance().getConnection();
    }


    public synchronized void returnConnection(Connection connection){
        ConnectionPool.getInstance().returnConnection(connection);
    }

}
