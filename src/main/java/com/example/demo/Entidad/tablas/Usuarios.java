package com.example.demo.Entidad.tablas;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Usuarios {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)

    private long ID;
    private String Name;
    private  String FirstName;
    @Column(unique = true , nullable = false)
    private  String Username;
    private  String Password;
    @Column(unique = true)
    private String email;

    @OneToMany(mappedBy = "Usuarios")
    private List<Sugerencias>sugerencias;
    @OneToMany
    @JoinTable(name = "UserParty", joinColumns = @JoinColumn(name ="idUser", referencedColumnName = "ID"),inverseJoinColumns = @JoinColumn(name = "IdParty", referencedColumnName = "id"))
    private  List<Partidas> partidas;
            @OneToMany(mappedBy = "Usuarios")
        private List<Mensajes> mensajes;
}
