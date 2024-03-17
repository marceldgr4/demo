package com.example.demo.Repository;
import com.example.demo.Entidad.tablas.Partida;
import com.example.demo.Entidad.tablas.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public interface PartidaRepository extends JpaRepository<Partida,Long> {
    List<Partida>findByCreatorAndCity(String Creator, String City);
    @Query("select p from Partida p where p.Creator=?1 and p.City=?2")
    List<Partida>SearchByCreatorAndCity(String Creator, String City);
    List<Partida>findByDeportOrProvince(String Deport, String Province);
    List<Partida>findByDate(LocalDateTime Date);
    List<Partida>findByStarTimeBetween(LocalTime StarTime, LocalTime EndOfTime);
    List<Partida>findByCompetitorGreaterThanEqualAndAlternateLessThanEqual(Integer Competitor, Integer Alternate);
    List<Partida>findByMatchCommentLike(String MatchComment);
    @Query("select p from Partida p where p.MatchComment like %?1")
    List<Partida>findByMatchComment(String criterio);

    default List<Partida> findByUsuariosIn(List<Usuario> usuarios) {
        return null;
    }

}
