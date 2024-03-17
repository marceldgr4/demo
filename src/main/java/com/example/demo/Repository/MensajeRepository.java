package com.example.demo.Repository;

import com.example.demo.Entidad.tablas.Mensaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;

public interface MensajeRepository extends JpaRepository<Mensaje, Long> {
 List<Mensaje>findByCreatorMessenger(String CreatorMessenger);
 List<Mensaje>findByAddressed(String Addressed);
 @Query("select m from Mensaje m where m.CreatorMessenger=?1 and m.create_atMessenger =?2")
    List<Mensaje> findByCreatorMessengerAndCreate_atMessenger(String CreatorMessenger, LocalDateTime Create_atMessenger);
}
