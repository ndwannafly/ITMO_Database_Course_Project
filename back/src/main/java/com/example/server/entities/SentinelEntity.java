package com.example.server.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "sentinel", schema = "public")
public class SentinelEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "sentinel_id_seq")
    @Column(name = "id", columnDefinition = "serial primary key")
    private Long id;

    @Column(name = "person_id")
    private Long personId;

    @Column(name = "ranking_id")
    private  Integer rankingId;

    @Column(name = "base_id")
    private Integer baseId;

    public SentinelEntity(Long id, Long personId, Integer rankingId, Integer baseId) {
        this.id = id;
        this.personId = personId;
        this.rankingId = rankingId;
        this.baseId = baseId;
    }

    public SentinelEntity() {
    }
}
