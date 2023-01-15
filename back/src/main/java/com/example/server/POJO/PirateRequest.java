package com.example.server.POJO;

import java.time.LocalDate;

public class PirateRequest {
    private Integer id;
    private Integer personId;
    private Integer captureReward;

    private String name;

    private Integer height;

    private String birthDate;

    private Integer teamID;

    private String teamTitle;

    private Integer fruitID;

    private Integer fruitOwnerLevel;

    private Integer weaponID;

    private Integer weaponOwnerLevel;

    private Integer willOfArmsLevel;

    private Integer willOfObservation;

    private Integer willOfKing;

    public Integer getFruitID() {
        return fruitID;
    }

    public Integer getFruitOwnerLevel() {
        return fruitOwnerLevel;
    }

    public Integer getTeamID() {
        return teamID;
    }

    public Integer getWeaponID() {
        return weaponID;
    }

    public Integer getWeaponOwnerLevel() {
        return weaponOwnerLevel;
    }

    public Integer getWillOfArmsLevel() {
        return willOfArmsLevel;
    }

    public Integer getWillOfKing() {
        return willOfKing;
    }

    public Integer getWillOfObservation() {
        return willOfObservation;
    }

    public String getTeamTitle() {
        return teamTitle;
    }

    public void setFruitID(Integer fruitID) {
        this.fruitID = fruitID;
    }

    public void setFruitOwnerLevel(Integer fruitOwnerLevel) {
        this.fruitOwnerLevel = fruitOwnerLevel;
    }

    public void setTeamID(Integer teamID) {
        this.teamID = teamID;
    }

    public void setTeamTitle(String teamTitle) {
        this.teamTitle = teamTitle;
    }

    public void setWeaponID(Integer weaponID) {
        this.weaponID = weaponID;
    }

    public void setWeaponOwnerLevel(Integer weaponOwnerLevel) {
        this.weaponOwnerLevel = weaponOwnerLevel;
    }

    public void setWillOfArmsLevel(Integer willOfArmsLevel) {
        this.willOfArmsLevel = willOfArmsLevel;
    }

    public void setWillOfKing(Integer willOfKing) {
        this.willOfKing = willOfKing;
    }

    public void setWillOfObservation(Integer willOfObservation) {
        this.willOfObservation = willOfObservation;
    }

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

    public Integer getHeight() {
        return height;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getName() {
        return name;
    }

    public void setBirthDate(String date) {
        this.birthDate = date;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCaptureReward() {
        return captureReward;
    }
}
