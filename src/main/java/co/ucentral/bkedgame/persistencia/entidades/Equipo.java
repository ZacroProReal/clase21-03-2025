package co.ucentral.bkedgame.persistencia.entidades;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table (name = "equipos")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Equipo {
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private Long id;

    @Column(unique = true)
    private String nombre;

    private String nombreCorto;
    //private LocalDateTime fechaCreacion;
}
