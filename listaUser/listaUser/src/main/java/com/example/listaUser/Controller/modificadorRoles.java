package com.example.listaUser.Controller;

import com.example.listaUser.Metodos.roles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.StreamSupport;

@Controller
public class modificadorRoles  {
    @GetMapping("/nuevo-rol")
    public String newRol() {
        return "nuevo-rol";
    }
    @PostMapping("/nuevo-rol")
    public String newRolSubmit(@RequestParam String nombre, @RequestParam String descripcion) {
        System.out.println("Nombre: " + nombre + ", Descripción: " + descripcion);

        return "redirect:/home";
    }
}
