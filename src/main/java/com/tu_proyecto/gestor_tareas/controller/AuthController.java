package com.tu_proyecto.gestor_tareas.controller;

import com.tu_proyecto.gestor_tareas.model.User;
import com.tu_proyecto.gestor_tareas.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {


    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        userService.register(user);
        return "Usuario registrado con éxito";
    }

    @PostMapping("/login")
    public String login() {
        return "Inicio de sesión exitoso";
    }
}