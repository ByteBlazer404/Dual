package com.Desafio.Controller;

import java.awt.*;

public class user {
    private String name;
    private String apellido;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public user (String name , String apellido){
        this.name = name;
        this.apellido = apellido;
    }
    public String toString() {
        return "user{" +
                "name='" + name + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
