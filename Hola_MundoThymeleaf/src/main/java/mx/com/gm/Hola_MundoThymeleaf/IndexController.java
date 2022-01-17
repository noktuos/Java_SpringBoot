package mx.com.gm.Hola_MundoThymeleaf;/*
 * @created 13/01/2022
 * @project Hola_SpringBoot
 * @author Noktuos
 */

import lombok.extern.slf4j.Slf4j;
import mx.com.gm.Hola_MundoThymeleaf.domain.Persona;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@Slf4j
public class IndexController {
    @Value("${index.greetings}")
    private String greetings;

    @GetMapping("/")
    public String index(Model model){
        var greeting = "Hellos again! Now with Thymeleaf  MVC.";

        var persona = new Persona();
        persona.setNombre("josue");
        persona.setApellido("torres");
        persona.setEmail("josue.torres@gmail.com");
        persona.setTelefono("111-222-333");
        var persona2 = new Persona();
        persona2.setNombre("Karla");
        persona2.setTelefono("12315235");
        persona2.setEmail("karla@gmail.com");
        persona2.setApellido("Gomez");

        //List<Persona> personas = Arrays.asList(persona,persona2);
        var personas= new ArrayList<>();

        log.info("Rest Controller execution");
        model.addAttribute("greeting",greeting);
        model.addAttribute("greetings",greetings);
        model.addAttribute("personas",personas);
        return "index";
    }

}
