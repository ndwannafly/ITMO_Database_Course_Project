package com.example.server.POJO;

public class PirateRequest {
    private Integer id;
    private Integer personId;
    private Integer captureReward;


    public void setCaptureReward(Integer captureReward) {
        this.captureReward = captureReward;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public Integer getId() {
        return id;
    }

    public Integer getPersonId() {
        return personId;
    }

    public Integer getCaptureReward() {
        return captureReward;
    }
}
