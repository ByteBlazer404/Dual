package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;

public class User {

	private String nombre;
	private String apellido;
	public User(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	@Override
	@GetMapping("/people")
	public String toString() {
		return "User [nombre=" + nombre + ", apellido=" + apellido + "]";
	}
}
