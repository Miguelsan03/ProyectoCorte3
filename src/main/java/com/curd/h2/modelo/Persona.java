package com.curd.h2.modelo;

public class Persona {
	private int id;
	private String nombre;
	private String correo;
	private String password;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(int id, String nombre, String correo, String password) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.correo = correo;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
