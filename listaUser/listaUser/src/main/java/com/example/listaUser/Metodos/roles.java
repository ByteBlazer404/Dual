package com.example.listaUser.Metodos;

public class roles {
    private String nombre;
    private String description;
    private int id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public roles(String nombre, String description , int id) {
        this.nombre = nombre;
        this.description = description;
        this.id = id;
    }
}
