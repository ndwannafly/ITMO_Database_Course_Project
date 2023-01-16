package com.example.server.entities;

import lombok.Getter;
import lombok.Setter;



import java.sql.Date;
import java.time.LocalDate;
import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "people", schema = "public")
public class PeopleEntity {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO, generator = "people_id_seq")
    @Column(name = "id", columnDefinition = "serial primary key")
    private Long id;

    @Column(name = "name", columnDefinition = "REAL")
    private String name;

    @Column(name = "height", columnDefinition = "REAL")
    private Integer height;

    @Column(name = "birth_date", columnDefinition = "REAL")
    private LocalDate date;

    public PeopleEntity(){

    }

    public PeopleEntity(Long id, String name, Integer height, LocalDate date) {
        this.id = id;
        this.name = name;
        this.height = height;
        this.date = date;
    }
}
