package com.example.server.entities.PK;

import java.io.Serializable;

public class WeaponOwnerEntityPK implements Serializable {
    private Long personId;
    private Long weaponId;

    public WeaponOwnerEntityPK() {
    }

    public WeaponOwnerEntityPK(Long personId, Long weaponId) {
        this.personId = personId;
        this.weaponId = weaponId;
    }
}
