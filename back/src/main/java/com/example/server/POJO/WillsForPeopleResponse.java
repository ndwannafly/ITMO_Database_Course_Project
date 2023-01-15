package com.example.server.POJO;

public class WillsForPeopleResponse {
    private Integer willArmament;
    private Integer willObservation;
    private Integer willRoyal;

    public WillsForPeopleResponse(Integer willArmament, Integer willObservation, Integer willRoyal) {
        this.willArmament = willArmament;
        this.willObservation = willObservation;
        this.willRoyal = willRoyal;
    }

    public WillsForPeopleResponse() {
    }

    public Integer getWillArmament() {
        return willArmament;
    }

    public Integer getWillObservation() {
        return willObservation;
    }

    public Integer getWillRoyal() {
        return willRoyal;
    }

    public void setWillArmament(Integer willArmament) {
        this.willArmament = willArmament;
    }

    public void setWillObservation(Integer willObservation) {
        this.willObservation = willObservation;
    }

    public void setWillRoyal(Integer willRoyal) {
        this.willRoyal = willRoyal;
    }
}
