package com.example.server.POJO;

import javax.persistence.criteria.CriteriaBuilder;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

public class SentinelResponce {
    private String Name;
    private Integer height;
    private Integer age;
    private Long id;
    private String ranking;
    private String base;

    private Long devilFruitId;
    private String devilFruitsName;
    private Integer devilFruitsOwner;

    private Long weaponId;
    private String weaponName;
    private Integer weaponOwner;

    private Integer willArmament;
    private Integer willObservation;
    private Integer willRoyal;

    public void setDevilFruitId(Long devilFruitId) {
        this.devilFruitId = devilFruitId;
    }

    public void setWeaponId(Long weaponId) {
        this.weaponId = weaponId;
    }

    public Long getDevilFruitId() {
        return devilFruitId;
    }

    public Long getWeaponId() {
        return weaponId;
    }

    public void setDevilFruitsName(String devilFruitsName) {
        this.devilFruitsName = devilFruitsName;
    }

    public void setDevilFruitsOwner(Integer devilFruitsOwner) {
        this.devilFruitsOwner = devilFruitsOwner;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public void setWeaponOwner(Integer weaponOwner) {
        this.weaponOwner = weaponOwner;
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

    public String getDevilFruitsName() {
        return devilFruitsName;
    }

    public Integer getDevilFruitsOwner() {
        return devilFruitsOwner;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public Integer getWeaponOwner() {
        return weaponOwner;
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

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getRanking() {
        return ranking;
    }

    public String getBase() {
        return base;
    }

    public SentinelResponce(Long id, String name, Integer height, Integer age) {
        Name = name;
        this.id= id;
        this.height = height;
        this.age = age;
    }

    public SentinelResponce() {
    }

    public Integer getAge() {
        return age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
