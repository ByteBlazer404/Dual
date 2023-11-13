package com.example.listaUser.Controller;

import com.example.listaUser.Metodos.roles;
import org.springframework.beans.factory.annotation.Autowired;
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
    @RequestMapping(value = "/detalle-rol/{id}" , method = RequestMethod.GET)
    public String modificar( @PathVariable long id){
        long Id = id;
        return "detalle-rol";
    }
    @RequestMapping(value = "/eliminar?{id}" , method = RequestMethod.GET)
    public String liminar( @PathVariable long id) {
        long Id = id;
        return "redirect:/eliminar?"+ Id;
    }
}