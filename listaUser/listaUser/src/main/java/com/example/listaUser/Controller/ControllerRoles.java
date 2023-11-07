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
    public String getLista(Model model){
        List<roles> rol = new ArrayList<>();
        rol.add(new roles("Juan", "Diseñador remoto ",43));
        rol.add(new roles("Daniel","Programador FullStack",2));
        rol.add(new roles("Moises","Jefe de proyecto",53));
        model.addAttribute("rol", rol);
        return "lista";
    }
    @RequestMapping(value = "/roles/lista/{id}" , method = RequestMethod.POST)
    public String editarRol(@PathVariable Long id , @RequestBody roles rol) {
        return "redirect:/roles/lista";
    }
}