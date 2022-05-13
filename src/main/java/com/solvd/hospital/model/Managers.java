package com.solvd.hospital.model;

public class Managers {
    int managersId;
    boolean economicManager;
    boolean directorManager;

    public Managers() {
    }

    public Managers(int managersId, boolean economicManager, boolean directorManager) {
        this.managersId = managersId;
        this.economicManager = economicManager;
        this.directorManager = directorManager;
    }

    public int getManagersId() {
        return managersId;
    }

    public void setManagersId(int managersId) {
        this.managersId = managersId;
    }

    public boolean isEconomicManager() {
        return economicManager;
    }

    public void setEconomicManager(boolean economicManager) {
        this.economicManager = economicManager;
    }

    public boolean isDirectorManager() {
        return directorManager;
    }

    public void setDirectorManager(boolean directorManager) {
        this.directorManager = directorManager;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
