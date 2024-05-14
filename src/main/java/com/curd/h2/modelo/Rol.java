package com.curd.h2.modelo;

public class Rol {
	private int id_rol;
	private String nombre;
	private String estado;
	
	public Rol() {
		// TODO Auto-generated constructor stub
	}

	public Rol(int id_rol, String nombre, String estado) {
		super();
		this.id_rol = id_rol;
		this.nombre = nombre;
		this.estado = estado;
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


	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}

