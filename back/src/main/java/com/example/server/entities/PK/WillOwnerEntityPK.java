package com.example.server.entities.PK;

import java.io.Serializable;

public class WillOwnerEntityPK implements Serializable {
    private Long personId;
    private Integer willId;

    public WillOwnerEntityPK(Long personId, Integer willId) {
        this.personId = personId;
        this.willId = willId;
    }

    public WillOwnerEntityPK() {
    }
}
