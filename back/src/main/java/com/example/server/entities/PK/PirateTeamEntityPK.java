package com.example.server.entities.PK;

import java.io.Serializable;

public class PirateTeamEntityPK implements Serializable {
    private Long pirateId;
    private Long teamId;

    public PirateTeamEntityPK(Long pirateId, Long teamId) {
        this.pirateId = pirateId;
        this.teamId = teamId;
    }

    public PirateTeamEntityPK() {
    }
}
