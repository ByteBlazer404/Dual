package com.example.listaUser.Metodos;

import org.springframework.stereotype.Service;

public class roles {
    private String nombre;
    private String description;
    private long id;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public roles(String nombre, String description , long id) {
        super();
        this.nombre = nombre;
        this.description = description;
        this.id = id;
    }
}
