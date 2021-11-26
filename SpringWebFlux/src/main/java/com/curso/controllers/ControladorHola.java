package com.curso.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
public class ControladorHola {
	@Autowired
	com.curso.services.HolaService servicio;

	@RequestMapping("/")
	public Flux<String> hola() {
		return servicio.hola();
	}
}