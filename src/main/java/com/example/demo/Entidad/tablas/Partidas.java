package com.example.demo.Entidad.tablas;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Partidas {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long IdParty;
    private String Creator;
    private String City;
    private  String Deport;
    private  String Province;
    private LocalDateTime Date;
    private LocalTime StarTime;
    private Integer Competitor;
    private  Integer Alternate;
    private String MatchComment;



}
