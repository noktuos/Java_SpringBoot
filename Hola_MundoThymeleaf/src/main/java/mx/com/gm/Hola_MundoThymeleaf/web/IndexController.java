package mx.com.gm.Hola_MundoThymeleaf.web;/*
 * @created 13/01/2022
 * @project Hola_SpringBoot
 * @author Noktuos
 */

import lombok.extern.slf4j.Slf4j;

import mx.com.gm.Hola_MundoThymeleaf.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


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

}
