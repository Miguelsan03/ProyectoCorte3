package com.curd.h2.service;

import java.util.List;

import com.curd.h2.modelo.Persona;

public interface IPersonaService {
	public List<Persona>listar();
	public Persona listPesonaId(int id);
	public int agregar(Persona p);
	public int editar(Persona p);
	public void delete(int id);
}
