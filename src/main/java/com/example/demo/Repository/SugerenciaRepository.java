package com.example.demo.Repository;

import com.example.demo.Entidad.tablas.Sugerencia;
import com.example.demo.Entidad.tablas.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface   SugerenciaRepository extends JpaRepository<Sugerencia,Long> {
    List<Sugerencia>findByDescription(String Description);
    List<Sugerencia>findByCreatedAtBetween(LocalDateTime Start, LocalDateTime End);
    List<Sugerencia>findByUsuarios(Usuario usuario);
}
