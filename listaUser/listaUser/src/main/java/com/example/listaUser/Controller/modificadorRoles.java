package com.example.listaUser.Controller;

import com.example.listaUser.Metodos.roles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.stream.StreamSupport;

@Controller
public class modificadorRoles  {
    @GetMapping("/nuevo-rol")
    public String newRol() {
        return "nuevo-rol";
    }
}
