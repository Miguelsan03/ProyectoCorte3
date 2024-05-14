package com.curd.h2;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class CrudApplication implements CommandLineRunner {

	@Autowired
	private JdbcTemplate template;
	
	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	    template.execute("DROP TABLE IF EXISTS PERSONA");
	    template.execute("CREATE TABLE PERSONA (id INTEGER PRIMARY KEY AUTO_INCREMENT, nombre VARCHAR(255), correo VARCHAR(255), password VARCHAR(255))");
	    
	    for (int i = 0; i < 5; i++) {
	        template.update("INSERT INTO PERSONA (nombre, correo, password) VALUES ('Persona 000" + i + "', 'Persona" + i + "', 'prueba123')");
	    }
	}


}
