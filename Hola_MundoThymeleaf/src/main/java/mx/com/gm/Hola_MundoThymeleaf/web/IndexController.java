package mx.com.gm.Hola_MundoThymeleaf.web;/*
 * @created 13/01/2022
 * @project Hola_SpringBoot
 * @author Noktuos
 */

import lombok.extern.slf4j.Slf4j;

import mx.com.gm.Hola_MundoThymeleaf.domain.Persona;
import mx.com.gm.Hola_MundoThymeleaf.service.PersonaService;
import mx.com.gm.Hola_MundoThymeleaf.service.PersonaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;


@Controller
@Slf4j
public class IndexController {
    @Value("${index.greetings}")
    private String greetings;
    @Autowired
    private PersonaService personaService;
    @GetMapping("/")
    public String index(Model model){
        var personas=personaService.listaPersonas();
        log.info("Rest Controller execution");

        model.addAttribute("personas",personas);
        return "index";
    }
    @GetMapping("/agregar")
    public String agregar(Persona persona){
        return "mod";
    }

    @PostMapping("/guardar")
    public String guardar(@Valid Persona persona, Errors errors){
        if(errors.hasErrors()){
            return "mod";
        }
        personaService.guardar(persona);
        return "redirect:/";
    }

    @GetMapping("/editar/{idPersona}")
    public String editar(Persona persona, Model model){
        persona = personaService.encontrarPersona(persona);
        model.addAttribute("persona",persona);
        return "mod";
    }
    @GetMapping("/eliminar")
    public String eliminar(Persona persona){
        personaService.eliminar(persona);
        return "redirect:/";
    }


}
