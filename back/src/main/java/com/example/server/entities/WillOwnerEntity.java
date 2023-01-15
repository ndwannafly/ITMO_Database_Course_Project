package com.example.server.entities;

import com.example.server.entities.PK.WeaponOwnerEntityPK;
import com.example.server.entities.PK.WillOwnerEntityPK;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "will_owner", schema = "public")

@IdClass(WillOwnerEntityPK.class)
public class WillOwnerEntity {
    @Id
    @Column(name = "person_id")
    private Long personId;

    @Id
    @Column(name = "will_id")
    private Integer willId;

    @Column(name = "owner_level")
    private Integer ownerLevel;

    public WillOwnerEntity(Long personId, Integer willId, Integer ownerLevel) {
        this.personId = personId;
        this.willId = willId;
        this.ownerLevel = ownerLevel;
    }

    public WillOwnerEntity() {
    }

    ;
}
