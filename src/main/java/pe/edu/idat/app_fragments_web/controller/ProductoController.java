package pe.edu.idat.app_fragments_web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class ProductoController {
    @GetMapping("/producto")
    public String producto(){
        return "producto";
    }

}
