package com.informaticonfig.spring.app1.springboot_app1.controllers;

import com.informaticonfig.spring.app1.springboot_app1.models.dto.ParametroDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/variable")
public class PathVariableController {

    @GetMapping("/pagina1")
    public ParametroDTO pagina1() {
        ParametroDTO parametro1 = new ParametroDTO();
        return parametro1;
    }


}
