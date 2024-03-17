package com.example.demo.Entidad.tablas;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "usuarios")
@Getter
@Setter
@Builder

public class Usuario {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String Name;
    private  String FirstName;
    @Column(unique = true , nullable = false)
    private  String Username;
    private  String Password;
    //@Column(unique = true)
    private String email;

    @OneToMany(mappedBy = "usuarios")
   private List<Sugerencia> sugerencias;
    @ManyToMany
   @JoinTable(name = "usuarios_partidas", joinColumns = @JoinColumn(name ="idUsuario",
           referencedColumnName = "id"),inverseJoinColumns = @JoinColumn(name = "idPartida",
           referencedColumnName = "id"))
   private  List<Partida> partidas;
         @OneToMany(mappedBy = "usuarios")
    private List<Mensaje> mensajes;
}
