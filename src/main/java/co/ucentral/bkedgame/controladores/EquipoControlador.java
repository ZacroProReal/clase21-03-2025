package co.ucentral.bkedgame.controladores;

import co.ucentral.bkedgame.persistencia.entidades.Equipo;
import co.ucentral.bkedgame.servicios.EquipoServicio;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/equipos")
@CrossOrigin(origins = "*")
public class EquipoControlador {
    EquipoServicio equipoServicio;

    @GetMapping("/")
    public List<Equipo> obtenerTodos(){
        return equipoServicio.obtenerTodos();
    }
    @GetMapping("/")
    public Equipo crear(@RequestBody Equipo equipo){
        return equipoServicio.crear(equipo);
    }
    @GetMapping("/nombre/{nombre}")
    public Equipo obtenerXNombre(@PathVariable String nombre){
        return equipoServicio.obtenerXNombre(nombre);
    }
    @GetMapping("/pk/{id}")
    public Equipo obtenerXPK(@PathVariable Long id){
        return equipoServicio.obtenerXPK(id);
    }

}
