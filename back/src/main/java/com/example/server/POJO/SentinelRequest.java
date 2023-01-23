package com.example.server.POJO;

public class SentinelRequest {
    private String name;

    private Integer height;

    private String birthDate;

    private Long rankingId;

    private Long baseId;

    private Integer fruitId;

    private Integer fruitOwnerLevel;

    private Integer weaponID;

    private Integer weaponOwnerLevel;

    private Integer willOfArmsLevel;

    private Integer willOfObservation;

    private Integer willOfKing;

    public void setWeaponOwnerLevel(Integer weaponOwnerLevel) {
        this.weaponOwnerLevel = weaponOwnerLevel;
    }

    public void setWeaponID(Integer weaponID) {
        this.weaponID = weaponID;
    }

    public void setFruitOwnerLevel(Integer fruitOwnerLevel) {
        this.fruitOwnerLevel = fruitOwnerLevel;
    }

    public Integer getWeaponID() {
        return weaponID;
    }

    public Integer getFruitOwnerLevel() {
        return fruitOwnerLevel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public Integer getWeaponOwnerLevel() {
        return weaponOwnerLevel;
    }

    public Integer getHeight() {
        return height;
    }

    public Long getBaseId() {
        return baseId;
    }

    public void setWillOfObservation(Integer willOfObservation) {
        this.willOfObservation = willOfObservation;
    }

    public void setWillOfKing(Integer willOfKing) {
        this.willOfKing = willOfKing;
    }

    public void setWillOfArmsLevel(Integer willOfArmsLevel) {
        this.willOfArmsLevel = willOfArmsLevel;
    }

    public Integer getWillOfObservation() {
        return willOfObservation;
    }

    public Integer getWillOfKing() {
        return willOfKing;
    }

    public Integer getWillOfArmsLevel() {
        return willOfArmsLevel;
    }

    public Integer getFruitId() {
        return fruitId;
    }

    public Long getRankingId() {
        return rankingId;
    }

    public void setBaseId(Long baseId) {
        this.baseId = baseId;
    }

    public void setFruitId(Integer fruitId) {
        this.fruitId = fruitId;
    }

    public void setRankingId(Long rankingId) {
        this.rankingId = rankingId;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}
