package com.example.server.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "base", schema = "public")
public class BaseEntity {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    public BaseEntity(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public BaseEntity() {
    }
}
