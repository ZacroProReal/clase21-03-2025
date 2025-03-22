package co.ucentral.bkedgame.persistencia.repositorios;

import co.ucentral.bkedgame.persistencia.entidades.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EquipoRepositorio extends JpaRepository<Equipo, Long> {
    @Query(value = """
        SELCT e FROM Equipos e"
        WHERE UPPER(e.nombre) = UPPER(?1)""")
   Equipo findByNombre(String nomre);
   Equipo findByNombreAndNombreCorto(String nomre,String nombreCorto);
}
