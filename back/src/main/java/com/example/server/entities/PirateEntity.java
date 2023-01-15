package com.example.server.entities;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@Entity
@Table(name = "pirate", schema = "public")
public class PirateEntity {
    @Id
    @Column(name = "id", columnDefinition = "primary key")
    private Long id;

    @Column(name = "person_id", columnDefinition = "REAL")
    private Long personId;

    @Column(name = "capture_reward", columnDefinition = "REAL")
    private Integer captureReward;

    public  PirateEntity(){}

    public PirateEntity(Long personId, Integer captureReward){
        this.captureReward = captureReward;
        this.personId = personId;
    }
}
