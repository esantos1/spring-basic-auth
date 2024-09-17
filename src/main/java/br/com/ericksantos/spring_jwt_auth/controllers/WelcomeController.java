package br.com.ericksantos.spring_jwt_auth.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping
    public String welcome() {
        return "Bem vindo à minha API Spring Boot Web.";
    }

    @GetMapping("/users")
    public String users() {
        return "Usuário autorizado.";
    }

    @GetMapping("/managers")
    public String managers() {
        return "Administrador autorizado.";
    }
}
