package com.example.demo.Repository;
import com.example.demo.Entidad.tablas.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
public interface UsuarioRepository extends  JpaRepository<Usuario, Long> {
List<Usuario> findByNameAndFirstName(String Name, String FirstName);
@Query("select  u from Usuario u where u.Name=?1 and u.FirstName=?2 ")
    List<Usuario>searchByNameAndFirstName(String name, String FirstName);
    List<Usuario>BuscarPorNombreYApellido(String Nombre, String Apellido);
    List<Usuario> findByNameLike(String Name);

    @Query("select u from Usuario u WHERE u.Name like %?1")
    default List<Usuario> searchByName(String criterio) {
        return null;
    }

}
