package com.informaticonfig.spring.app1.springboot_app1.controllers;


//import java.util.HashMap;
//import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.informaticonfig.spring.app1.springboot_app1.models.Empleados;
import com.informaticonfig.spring.app1.springboot_app1.models.dto.ClaseDTO;

@RestController
@RequestMapping("/api")
public class EjemploRestController {

    @GetMapping("/detalles_info2")
    //public Map<String, Object> detalles_info2(){
    public ClaseDTO detalles_info2(){

        //Empleados empleado1 = new Empleados("Juan", "Rodriguez", "Calle 1 No 2", "Gerente",
        //    35, 1234567889, 001
        //);

        //Map<String, Object> respuesta = new HashMap<>();
        //respuesta.put("Empleado", "Datos empleado");
        //respuesta.put("Informacion", empleado1);

        ClaseDTO usuario1 = new ClaseDTO();
        usuario1.setTitulo("Administrador");
        usuario1.setUsuario("Informaticonfig");

        return usuario1;
    }

}
