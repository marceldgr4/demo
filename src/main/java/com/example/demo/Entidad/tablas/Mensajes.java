package com.example.demo.Entidad.tablas;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor

public class Mensajes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ID;
    private String CreatorMessenger;
    private  String Addressen;
    private  String Comment;
    private LocalDateTime create_atMessenger;


}
