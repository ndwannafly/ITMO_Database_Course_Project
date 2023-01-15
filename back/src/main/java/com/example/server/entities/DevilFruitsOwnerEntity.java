package com.example.server.entities;

import com.example.server.entities.PK.DevilFruitsOwnerEntityPK;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity

@Table(name = "devil_fruits_owner", schema = "public")
@IdClass(DevilFruitsOwnerEntityPK.class)
public class DevilFruitsOwnerEntity {
    @Id
    @Column(name = "person_id")
    private Long personId ;

    @Id
    @Column(name = "fruit_id")
    private Long fruitId;

    @Column(name = "owner_level")
    private Integer ownerLevel;

    public DevilFruitsOwnerEntity(Long personID, Long fruitID, Integer ownerLevel) {
        this.personId = personID;
        this.fruitId = fruitID;
        this.ownerLevel = ownerLevel;
    }

    public DevilFruitsOwnerEntity() {
    }
}
