package com.solvd.hospital.model;

public class IntensiveCare {
    int intensiveCareId;
    int intensiveCareRoomId;
    int intensiveCareMedic;

    public IntensiveCare() {
    }

    public IntensiveCare(int intensiveCareId, int intensiveCareRoomId, int intensiveCareMedic) {
        this.intensiveCareId = intensiveCareId;
        this.intensiveCareRoomId = intensiveCareRoomId;
        this.intensiveCareMedic = intensiveCareMedic;
    }

    public int getIntensiveCareId() {
        return intensiveCareId;
    }

    public void setIntensiveCareId(int intensiveCareId) {
        this.intensiveCareId = intensiveCareId;
    }

    public int getIntensiveCareRoomId() {
        return intensiveCareRoomId;
    }

    public void setIntensiveCareRoomId(int intensiveCareRoomId) {
        this.intensiveCareRoomId = intensiveCareRoomId;
    }

    public int getIntensiveCareMedic() {
        return intensiveCareMedic;
    }

    public void setIntensiveCareMedic(int intensiveCareMedic) {
        this.intensiveCareMedic = intensiveCareMedic;
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
