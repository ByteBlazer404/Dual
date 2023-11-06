package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import java.util.List;
@Controller
public class alumno {

    @GetMapping("/listaUsuarios")
    public List<User> listaUsuarios() {
        List<User> usuarios = new ArrayList<>();
        usuarios.add(new User("Nombre1", "Apellido1"));
        usuarios.add(new User("Nombre2", "Apellido2"));

        return usuarios;
    }
}
