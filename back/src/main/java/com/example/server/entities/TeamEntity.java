package com.example.server.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity

@Table(name = "team", schema = "public")
public class TeamEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "team_id_seq")
    @Column(name = "id", columnDefinition = "serial primary key")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "ship")
    private String shipName;

    @Column(name = "value")
    private Integer value;

    @Column(name = "img")
    private String img;

    public TeamEntity(Long id, String name, String shipName, Integer value, String img) {
        this.id = id;
        this.name = name;
        this.shipName = shipName;
        this.value = value;
        this.img = img;
    }

    public TeamEntity() {
    }
}
