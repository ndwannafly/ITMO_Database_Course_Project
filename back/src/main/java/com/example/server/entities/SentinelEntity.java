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
    private  Long rankingId;

    @Column(name = "base_id")
    private Long baseId;

    public SentinelEntity(Long id, Long personId, Long rankingId, Long baseId) {
        this.id = id;
        this.personId = personId;
        this.rankingId = rankingId;
        this.baseId = baseId;
    }

    public SentinelEntity() {
    }
}
