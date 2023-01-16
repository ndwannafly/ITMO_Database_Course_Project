package com.example.server.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "ranking", schema = "public")
public class RankingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "ranking_id_seq")
    @Column(name = "id", columnDefinition = "serial primary key")
    private Long id;

    @Column(name = "title")
    private String title;

    public RankingEntity(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public RankingEntity() {
    }
}
