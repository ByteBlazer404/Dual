package com.example.listaUser.Metodos;

public class unitario {
    private String nombre;
    private String genero;
    private String estado;
    private String imagen;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public unitario(String nombre, String genero, String estado, String imagen) {
        this.nombre = nombre;
        this.genero = genero;
        this.estado = estado;
        this.imagen = imagen;
    }

}
