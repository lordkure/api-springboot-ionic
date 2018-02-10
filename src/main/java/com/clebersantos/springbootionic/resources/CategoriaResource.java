package com.clebersantos.springbootionic.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Cleber Santos <santos.cleber@gmail.com>
 */
@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
    
    @RequestMapping(method = RequestMethod.GET)
    public String listar(){
        return "Rest está funcionando!";
    }
    
}
