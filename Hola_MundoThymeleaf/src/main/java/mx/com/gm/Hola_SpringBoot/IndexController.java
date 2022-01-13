package mx.com.gm.Hola_SpringBoot;/*
 * @created 13/01/2022
 * @project Hola_SpringBoot
 * @author Noktuos
 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class IndexController {
    @GetMapping("/")
    public String index(){
        log.info("Rest Controller excecution");
        log.debug("More details for the controller");
        return "Hello World with Spring 2 :D";
    }

}
