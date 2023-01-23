package com.example.server.POJO;

public class DevilFruitRequest {
    private String fruitDesc;

    private String fruitName;

    private Integer fruitTypeId;

    public Integer getFruitTypeId() {
        return fruitTypeId;
    }

    public String getFruitDesc() {
        return fruitDesc;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitDesc(String fruitDesc) {
        this.fruitDesc = fruitDesc;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public void setFruitTypeId(Integer fruitTypeId) {
        this.fruitTypeId = fruitTypeId;
    }
}