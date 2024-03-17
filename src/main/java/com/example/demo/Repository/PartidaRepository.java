package com.example.demo.Repository;
import com.example.demo.Entidad.tablas.Partidas;
import com.example.demo.Entidad.tablas.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public interface PartidaRepository extends JpaRepository<Partidas,Long> {
    List<Partidas>findByCreatorAndCity(String Creator, String City);
    @Query("select p from Partidas p where p.Creator=?1 and p.City=?2")
    List<Partidas>SearchByCreatorAndCity(String Creator, String City);
    List<Partidas>findByDeportOrProvince(String Deport, String Province);
    List<Partidas>findByDate(LocalDateTime Date);
    List<Partidas>findByStarTimeBetween(LocalTime StarTime, LocalTime EndOfTime);
    List<Partidas>findByCompetitorGreaterThanEqualAndAlternateLessThanEqual(Integer Competitor,Integer Alternate);
    List<Partidas>findByMatchCommentLike(String MatchComment);
    @Query("select p from Partidas p where p.MatchComment like %?1")
    List<Partidas>findByMatchComment(String criterio);

    default List<Partidas> findByUsuariosIn(List<Usuarios> usuarios) {
        return null;
    }

}
