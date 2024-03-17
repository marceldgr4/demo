package com.example.demo.Repository;

import com.example.demo.Entidad.tablas.Mensajes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;

public interface MensajeRepository extends JpaRepository<Mensajes, Long> {
 List<Mensajes>findByCreatorMessenger(String CreatorMessenger);
 List<Mensajes>findByAddressed(String Addressed);
 @Query("select m from Mensajes m where m.CreatorMessenger=?1 and m.create_atMessenger =?2")
    List<Mensajes> findByCreatorMessengerAndCreate_atMessenger(String CreatorMessenger, LocalDateTime Create_atMessenger);
}
