package com.informaticonfig.spring.app1.springboot_app1.controllers;

import com.informaticonfig.spring.app1.springboot_app1.models.dto.ParametroDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/parametros")
public class RequestParamController {

    @GetMapping("/detalle")
    public ParametroDTO detalle(@RequestParam String informacion) {
        ParametroDTO parametro1 = new ParametroDTO();
        parametro1.setInformacion(informacion);
        return parametro1;
    }

}
