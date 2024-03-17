package com.example.demo.Entidad.tablas;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "sugerencias")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Sugerencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String Description;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime createdAt;
    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
   private Usuario usuarios;
}
