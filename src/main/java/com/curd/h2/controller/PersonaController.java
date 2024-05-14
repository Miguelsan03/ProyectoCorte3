package com.curd.h2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.curd.h2.modelo.Persona;
import com.curd.h2.service.IPersonaService;

import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;

@Controller
public class PersonaController {
	
	@Autowired
	private IPersonaService service;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("personas", service.listar());
		return "index";
	}
	
	@GetMapping("/nuevo")
	public String nuevo() {
		return "agregar";
	}
	@PostMapping("/agregar")
	public String agregar(@Validated Persona p) {
		service.agregar(p);
		return "redirect:/listar";
	}
}
