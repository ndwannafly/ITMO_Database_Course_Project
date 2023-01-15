package com.example.server.POJO;

import javax.persistence.criteria.CriteriaBuilder;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

public class SentinelResponce {
    private String Name;
    private Integer height;
    private Integer age;

    public SentinelResponce(String name, Integer height, Integer age) {
        Name = name;
        this.height = height;
        this.age = age;
    }

    public SentinelResponce() {
    }

    public String getName() {
        return Name;
    }

    public Integer getHeight() {
        return height;
    }

    public void setAge(LocalDate date) {

        LocalDate currentDate = LocalDate.now(ZoneId.systemDefault());
        Period period = Period.between(date, currentDate);

        this.age = period.getYears();
    }



    public void setName(String name) {
        Name = name;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
