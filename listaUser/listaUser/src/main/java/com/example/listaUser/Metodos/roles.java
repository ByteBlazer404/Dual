package com.example.listaUser.Metodos;

public class roles {
    private String nombre;
    private String description;

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

    public roles(String nombre, String description) {
        this.nombre = nombre;
        this.description = description;
    }
}
