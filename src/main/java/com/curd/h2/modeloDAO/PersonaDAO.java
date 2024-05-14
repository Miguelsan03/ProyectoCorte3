package com.curd.h2.modeloDAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.curd.h2.modelo.Persona;

@Repository
public class PersonaDAO implements IPersona{

	@Autowired
	private JdbcTemplate template;
	
	@Override
	public List<Persona> listar() {
		String sql="select * from persona";
		List<Persona>personas=template.query(sql, new BeanPropertyRowMapper<Persona>(Persona.class));
		return personas;
	}

	@Override
	public Persona listPesonaId(int id) {
		String sql="select * from persona where id=?";
		Persona persona = template.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<Persona>(Persona.class));
		return persona;
	}

	@Override
	public int agregar(Persona p) {
		String sql="insert into persona(nombre, correo, password)values(?)";
		int res=template.update(sql,p.getNombre(),p.getCorreo(),p.getPassword());		
		return res;
	}

	@Override
	public int editar(Persona p) {
		String sql="update persona set nombre=?, correo=?, password=? where id=?";
		int res = template.update(sql, p.getNombre(), p.getCorreo(), p.getPassword(), p.getId());
		return res;
	}

	@Override
	public void delete(int id) {
		String sql="delete from persona where id=?";
		template.update(sql, id);
	}
}



