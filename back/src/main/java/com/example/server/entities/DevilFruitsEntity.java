package com.example.server.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "devil_fruits", schema = "public")
public class DevilFruitsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "devil_fruits_id_seq")
    @Column(name = "id", columnDefinition = "serial primary key")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "fruit_type_id")
    private Integer fruitTypeId;

    public DevilFruitsEntity() {
    }

    public DevilFruitsEntity(Long id, String name, String description, Integer fruitTypeId) {

        this.id = id;
        this.name = name;
        this.description = description;
        this.fruitTypeId = fruitTypeId;
    }
}
