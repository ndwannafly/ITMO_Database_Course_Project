package com.example.server.entities;

import com.example.server.entities.PK.PirateTeamEntityPK;
import com.example.server.entities.PK.WeaponOwnerEntityPK;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity

@Table(name = "pirate_team", schema = "public")
@IdClass(PirateTeamEntityPK.class)
public class PirateTeamEntity {
    @Id
    @Column(name = "pirate_id")
    private Long pirateId;

    @Id
    @Column(name = "team_id")
    private Long teamId;

    @Column(name = "title")
    private String title;

    public PirateTeamEntity(Long pirateId, Long teamId, String title) {
        this.pirateId = pirateId;
        this.teamId = teamId;
        this.title = title;
    }

    public PirateTeamEntity() {
    }
}
