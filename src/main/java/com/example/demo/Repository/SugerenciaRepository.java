package com.example.demo.Repository;

import com.example.demo.Entidad.tablas.Sugerencias;
import com.example.demo.Entidad.tablas.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface   SugerenciaRepository extends JpaRepository<Sugerencias,Long> {
    List<Sugerencias>findByDescription(String Description);
    List<Sugerencias>findByCreatedAtBetween(LocalDateTime Start,LocalDateTime End);
    List<Sugerencias>findByUsuarios(Usuarios usuarios);
}
