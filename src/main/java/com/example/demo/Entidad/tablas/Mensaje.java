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
@Table(name = "mensajes")
@Getter
@Setter

public class Mensaje {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String CreatorMessenger;
    private  String Addressed;
    private  String CommentMessenger;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime create_atMessenger;
    @ManyToOne
    @JoinColumn(name = "id_Usuario", nullable = false)
    private Usuario usuarios;


}
