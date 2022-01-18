package mx.com.gm.Hola_MundoThymeleaf.domain;/*
 * @created 17/01/2022
 * @project Hola_MundoThymeleaf
 * @author Noktuos
 */

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "persona")
public class Persona implements Serializable {
    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersona;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;

}
