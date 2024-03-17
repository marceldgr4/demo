package com.example.demo.Entidad.tablas;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Partidas")
@Builder

public class Partidas {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long IdParty;
    private String Creator;
    private String City;
    private  String Deport;
    private  String Province;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime Date;
    @Temporal(TemporalType.TIME)
    private LocalTime StarTime;
    private Integer Competitor;
    private  Integer Alternate;
    private String MatchComment;
   @ManyToMany(mappedBy = "Partidas")
   private List<Usuarios> usuarios;



}
