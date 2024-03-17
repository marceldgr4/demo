package com.example.demo.Entidad.tablas;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "Sugerencias")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Sugerencias {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ID;
    private String Description;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime createdAt;
    @ManyToOne
    @JoinColumn(name = "idUser", nullable = false)
   private Usuarios usuarios;
}
