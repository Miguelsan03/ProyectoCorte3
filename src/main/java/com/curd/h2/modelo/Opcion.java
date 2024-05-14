package com.curd.h2.modelo;

public class Opcion {
	private int id_opcion;
	private String nombre;
	private String estado;
	private String ruta;
	private int tipo;
	
	public Opcion() {
		// TODO Auto-generated constructor stub
	}

	public Opcion(int id_opcion, String nombre, String estado, String ruta, String tipo) {
		super();
		this.id_opcion = id_opcion;
		this.nombre = nombre;
		this.estado = estado;
		this.ruta = ruta;
		this.tipo = tipo;
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
	
	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}

