package com.informaticonfig.spring.app1.springboot_app1.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.informaticonfig.spring.app1.springboot_app1.models.Empleados;

@Controller
public class EjemploController {

    @GetMapping("/detalles_info")
    public String info(Model model){

        Empleados empleado1 = new Empleados("Juan", "Rodriguez", "Calle 1 No 2", "Gerente",
            35, 1234567889, 001
        );

        model.addAttribute("Empleado", empleado1);


        return "detalles_info";
    }

    @ModelAttribute("Empleados")
    public List<Empleados> ListaEmpleados(){

        return Arrays.asList(
            new Empleados("Maria", "Perez", "Calle segunda mano 2", 
            "Secretaria", 27, 212313131, 002)
        );

    }

}
