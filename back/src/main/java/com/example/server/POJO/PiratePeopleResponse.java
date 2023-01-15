package com.example.server.POJO;
import org.springframework.security.core.parameters.P;

import java.lang.invoke.LambdaConversionException;
import java.time.LocalDate;
import java.time.Period;
import java.sql.Date;
import java.time.ZoneId;

public class PiratePeopleResponse {
    private Long id;
    private Long personId;
    private Integer captureReward;
    private String name;
    private Integer age;
    private Integer height;


    private String devilFruitsName;
    private Integer devilFruitsOwner;

    private String weaponName;
    private Integer weaponOwner;

    private Integer willArmament;
    private Integer willObservation;
    private Integer willRoyal;

    private Long numberTeam;
    private String nameTeam;
    private String img;
    private String title;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getImg() {
        return img;
    }

    public Long getNumberTeam() {
        return numberTeam;
    }

    public String getNameTeam() {
        return nameTeam;
    }

    public void setNumberTeam(Long numberTeam) {
        this.numberTeam = numberTeam;
    }

    public void setNameTeam(String nameTeam) {
        this.nameTeam = nameTeam;
    }

    public PiratePeopleResponse(Long id, Long personId, Integer captureReward, String name, Integer age, Integer height, String devilFruitsName, Integer devilFruitsOwner, String weaponName, Integer weaponOwner, Integer willArmament, Integer willObservation, Integer willRoyal, Long numberTeam, String nameTeam, String img) {
        this.id = id;
        this.personId = personId;
        this.captureReward = captureReward;
        this.name = name;
        this.age = age;
        this.height = height;
        this.devilFruitsName = devilFruitsName;
        this.devilFruitsOwner = devilFruitsOwner;
        this.weaponName = weaponName;
        this.weaponOwner = weaponOwner;
        this.willArmament = willArmament;
        this.willObservation = willObservation;
        this.willRoyal = willRoyal;
        this.numberTeam = numberTeam;
        this.nameTeam = nameTeam;
        this.img = img;
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

    public Integer getWillArmament() {
        return willArmament;
    }

    public Integer getWillObservation() {
        return willObservation;
    }

    public Integer getWillRoyal() {
        return willRoyal;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public void setWeaponOwner(Integer weaponOwner) {
        this.weaponOwner = weaponOwner;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public Integer getWeaponOwner() {
        return weaponOwner;
    }

    public PiratePeopleResponse(){}


    public void setId(Long id) {
        this.id = id;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public void setCaptureReward(Integer captureReward) {
        this.captureReward = captureReward;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(LocalDate date) {

        LocalDate currentDate = LocalDate.now(ZoneId.systemDefault());
        Period period = Period.between(date, currentDate);

        this.age = period.getYears();
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Long getId() {
        return id;
    }

    public Long getPersonId() {
        return personId;
    }

    public Integer getCaptureReward() {
        return captureReward;
    }

    public String getName() {
        return name;
    }

    public Integer getDate() {
        return age;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getAge() {
        return age;
    }

    public String getDevilFruitsName() {
        return devilFruitsName;
    }

    public Integer getDevilFruitsOwner() {
        return devilFruitsOwner;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setDevilFruitsName(String devilFruitsName) {
        this.devilFruitsName = devilFruitsName;
    }



    public void setDevilFruitsOwner(Integer devilFruitsOwner) {
        this.devilFruitsOwner = devilFruitsOwner;
    }



}
