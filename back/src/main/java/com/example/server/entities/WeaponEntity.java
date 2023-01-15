package com.example.server.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "weapon", schema = "public")
public class WeaponEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "weapon_id_seq")
    @Column(name = "id", columnDefinition = "serial primary key")
    private Long id;

    @Column(name = "name", columnDefinition = "REAL")
    private String name;

    @Column(name = "description", columnDefinition = "REAL")
    private String description;

    public WeaponEntity() {
    }

    public WeaponEntity(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
}
