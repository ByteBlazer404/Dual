package com.example.listaUser.Controller;

import com.example.listaUser.Metodos.roles;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/roles")
public class ControllerRoles {
    @RequestMapping("/lista")
    public String lista(){
        return "lista";
    }

}