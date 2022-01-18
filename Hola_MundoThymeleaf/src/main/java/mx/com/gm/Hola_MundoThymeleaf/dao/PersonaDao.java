package mx.com.gm.Hola_MundoThymeleaf.dao;/*
 * @created 17/01/2022
 * @project Hola_MundoThymeleaf
 * @author Noktuos
 */

import mx.com.gm.Hola_MundoThymeleaf.domain.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDao extends CrudRepository<Persona,Long>{

}
