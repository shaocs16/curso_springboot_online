package com.shao.curso.springboot.webapp.springboot_web.controllers;


// import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shao.curso.springboot.webapp.springboot_web.models.User;
import com.shao.curso.springboot.webapp.springboot_web.models.dto.UserDto;

// @Controller
@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/detailsDto")
    // @ResponseBody
    public UserDto detailsDto() {

        UserDto userDto = new UserDto();

        User user = new User("Shao", "Capilla");

        userDto.setUser(user);
        
        userDto.setTitle("Hola mundo spring boot");
        
        return userDto;
    }

    @GetMapping("/list")
    public List<User> list(){

        User user = new User("Shao", "Capilla");
        User user2 = new User("Pepe", "Doe");
        User user3 = new User("John", "Doe");

        List<User> users = Arrays.asList(user, user2, user3);

        // List<User> users = new ArrayList<>();
        // users.add(user);
        // users.add(user2);
        // users.add(user3);

        return users;
    }

    @GetMapping("/detailsMap")
    // @ResponseBody
    public Map<String, Object> detailsMap() {

        User user = new User("Shao", "Capilla");
        Map<String, Object> body = new HashMap<>();
        
        body.put("title", "Hola mundo spring boot");
        body.put("user", user);
        return body;
    }

}
