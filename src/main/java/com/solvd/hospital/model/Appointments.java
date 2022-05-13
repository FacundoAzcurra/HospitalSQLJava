package com.solvd.hospital.model;

public class Appointments {
    int appointmentID;
    int medicId;
    int appointmentRoomID;
    int patientId;

    public Appointments() {
    }

    public Appointments(int appointmentID, int medicId, int appointmentRoomID, int patientId) {
        this.appointmentID = appointmentID;
        this.medicId = medicId;
        this.appointmentRoomID = appointmentRoomID;
        this.patientId = patientId;
    }

    public int getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(int appointmentID) {
        this.appointmentID = appointmentID;
    }

    public int getMedicId() {
        return medicId;
    }

    public void setMedicId(int medicId) {
        this.medicId = medicId;
    }

    public int getAppointmentRoomID() {
        return appointmentRoomID;
    }

    public void setAppointmentRoomID(int appointmentRoomID) {
        this.appointmentRoomID = appointmentRoomID;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
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

