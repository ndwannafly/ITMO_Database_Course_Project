package com.example.server.POJO;

public class TeamRequest {
    private String teamName;

    private String shipName;

    private String imgLink;

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getImgLink() {
        return imgLink;
    }

    public String getShipName() {
        return shipName;
    }

    public void setImg(String img) {
        this.imgLink = img;
    }

    public void setShip(String ship) {
        this.shipName = ship;
    }
}