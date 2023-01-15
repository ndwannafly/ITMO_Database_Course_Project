package com.example.server.entities.PK;

import java.io.Serializable;

public class DevilFruitsOwnerEntityPK implements Serializable {
    private Long personId;
    private Long fruitId;

    public DevilFruitsOwnerEntityPK(){}

    public DevilFruitsOwnerEntityPK(Long personId, Long fruitId) {
        this.personId = personId;
        this.fruitId = fruitId;
    }
}
