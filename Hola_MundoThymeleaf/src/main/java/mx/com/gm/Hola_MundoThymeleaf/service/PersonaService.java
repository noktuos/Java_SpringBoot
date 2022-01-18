package mx.com.gm.Hola_MundoThymeleaf.service;/*
 * @created 17/01/2022
 * @project Hola_MundoThymeleaf
 * @author Noktuos
 */

import mx.com.gm.Hola_MundoThymeleaf.domain.Persona;

import java.util.List;

public interface PersonaService {
    public List<Persona> listaPersonas();
    public void guardar (Persona persona);
    public void eliminar(Persona persona);
    public Persona encontrarPersona(Persona persona);

}
