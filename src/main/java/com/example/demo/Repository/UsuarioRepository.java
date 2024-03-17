package com.example.demo.Repository;
import com.example.demo.Entidad.tablas.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
public interface UsuarioRepository extends  JpaRepository<Usuarios, Long> {
List<Usuarios> findByNameAndFirstName(String Name, String FirstName);
@Query("select  u from Usuarios u where u.Name=?1 and u.FirstName=?2 ")
    List<Usuarios>searchByNameAndFirstName(String name, String FirstName);
    List<Usuarios>BuscarPorNombreYApellido(String Nombre,String Apellido);
    List<Usuarios> findByNameLike(String Name);

    @Query("select u from Usuarios u WHERE u.Name like %?1")
    default List<Usuarios> searchByName(String criterio) {
        return null;
    }

}
