package com.example.server.entities;


import com.example.server.entities.PK.WeaponOwnerEntityPK;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity

@Table(name = "weapon_owner", schema = "public")
@IdClass(WeaponOwnerEntityPK.class)
public class WeaponOwnerEntity {
    @Id
    @Column(name = "person_id")
    private Long personId;

    @Id
    @Column(name = "weapon_id")
    private Long weaponId;

    @Column(name = "owner_level")
    private Integer ownerLavel;

    public WeaponOwnerEntity(Long personId, Long weaponId, Integer ownerLavel) {
        this.personId = personId;
        this.weaponId = weaponId;
        this.ownerLavel = ownerLavel;
    }

    public WeaponOwnerEntity() {
    }
}
