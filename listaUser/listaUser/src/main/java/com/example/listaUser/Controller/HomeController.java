package com.example.listaUser.Controller;

import com.example.listaUser.Metodos.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @GetMapping("/")
    public String welcome(Model model) {
        List<unitario> todo = new ArrayList<>();
        todo.add(new unitario("David abraham","Masculino", "activo","/img/faceOne.jpg"));
        todo.add(new unitario("José Antonio","Masculino", "inactivo","/img/faceTwo.jpg"));
        todo.add(new unitario("Pedro Zamora","Masculino", "activo","/img/faceTree.jpg"));
        todo.add(new unitario("Florinda Blanca","Femenino", "fuera de sevicio","/img/faceFour.jpg"));
        model.addAttribute("todo",todo);
        return "Welcome";
    }

    @GetMapping("/home")
    public String home(){
        return "home";
    }
}
