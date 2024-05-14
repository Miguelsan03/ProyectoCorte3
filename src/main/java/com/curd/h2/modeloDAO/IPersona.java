package com.curd.h2.modeloDAO;

import java.util.List;

import com.curd.h2.modelo.Persona;

public interface IPersona {
public List<Persona>listar();
public Persona listPesonaId(int id);
public int agregar(Persona p);
public int editar(Persona p);
public void delete(int id);
}
