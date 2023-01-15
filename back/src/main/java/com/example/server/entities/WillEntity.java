package com.example.server.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "will", schema = "public")
public class WillEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "will_id_seq")
    @Column(name = "id", columnDefinition = "serial primary key")
    private Long Id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    public WillEntity(Long id, String name, String description) {
        Id = id;
        this.name = name;
        this.description = description;
    }

    public WillEntity() {
    }
}
