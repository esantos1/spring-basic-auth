package br.com.ericksantos.spring_jwt_auth.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping
    public String welcome() {
        return "Bem vindo à minha API Spring Boot Web.";
    }

    @GetMapping("/users")
    @PreAuthorize("hasAnyRole('MANAGERS','USERS')")
    public String users() {
        return "Usuário autorizado.";
    }

    @GetMapping("/managers")
    @PreAuthorize("hasAnyRole('MANAGERS')")
    public String managers() {
        return "Administrador autorizado.";
    }
}
