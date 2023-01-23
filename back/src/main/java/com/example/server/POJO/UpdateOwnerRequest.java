package com.example.server.POJO;

import java.awt.peer.LabelPeer;

public class UpdateOwnerRequest {
    private Integer peopleId;
    private Integer fruitId;
    private Integer weaponId;
    private Integer fruitOwnerLevel;
    private Integer weaponOwnerLevel;
    private Integer willOfArmsLevel;
    private Integer willOfObservation;
    private Integer willOfKing;

    public UpdateOwnerRequest(Integer peopleId, Integer fruitId, Integer weaponId, Integer fruitOwnerLevel, Integer weaponOwnerLevel, Integer willOfArmsLevel, Integer willOfObservation, Integer willOfKing) {
        this.peopleId = peopleId;
        this.fruitId = fruitId;
        this.weaponId = weaponId;
        this.fruitOwnerLevel = fruitOwnerLevel;
        this.weaponOwnerLevel = weaponOwnerLevel;
        this.willOfArmsLevel = willOfArmsLevel;
        this.willOfObservation = willOfObservation;
        this.willOfKing = willOfKing;
    }

    public UpdateOwnerRequest() {
    }

    public Integer getPeopleId() {
        return peopleId;
    }

    public Integer getFruitId() {
        return fruitId;
    }

    public Integer getWeaponId() {
        return weaponId;
    }

    public Integer getFruitOwnerLevel() {
        return fruitOwnerLevel;
    }

    public Integer getWeaponOwnerLevel() {
        return weaponOwnerLevel;
    }

    public Integer getWillOfArmsLevel() {
        return willOfArmsLevel;
    }

    public Integer getWillOfObservation() {
        return willOfObservation;
    }

    public Integer getWillOfKing() {
        return willOfKing;
    }

    public void setPeopleId(Integer peopleId) {

        this.peopleId = peopleId;
    }

    public void setFruitId(Integer fruitId) {
        this.fruitId = fruitId;
    }

    public void setWeaponId(Integer weaponId) {
        this.weaponId = weaponId;
    }

    public void setFruitOwnerLevel(Integer fruitOwnerLevel) {
        this.fruitOwnerLevel = fruitOwnerLevel;
    }

    public void setWeaponOwnerLevel(Integer weaponOwnerLevel) {
        this.weaponOwnerLevel = weaponOwnerLevel;
    }

    public void setWillOfArmsLevel(Integer willOfArmsLevel) {
        this.willOfArmsLevel = willOfArmsLevel;
    }

    public void setWillOfObservation(Integer willOfObservation) {
        this.willOfObservation = willOfObservation;
    }

    public void setWillOfKing(Integer willOfKing) {
        this.willOfKing = willOfKing;
    }
}
