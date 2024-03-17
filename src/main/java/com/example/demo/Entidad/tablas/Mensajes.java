package com.example.demo.Entidad.tablas;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Mensajes")
@Getter
@Setter

public class Mensajes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ID;
    private String CreatorMessenger;
    private  String Addressed;
    private  String CommentMessenger;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime create_atMessenger;
    @ManyToOne
    @JoinColumn(name = "IdUser", nullable = false)
    private Usuarios usuarios;


}
