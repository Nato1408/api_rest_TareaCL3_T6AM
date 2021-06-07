package com.deporte.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.deporte.entity.Jugador;
import com.deporte.service.JugadorService;


@RestController
@RequestMapping("/rest/jugador")
public class JugadorController {
	
	@Autowired
	private JugadorService service;
	
	@GetMapping
	@ResponseBody
	public ResponseEntity<List<Jugador>> listaJugador(){
		List<Jugador> lista =service.listaJugador();
		return ResponseEntity.ok(lista);
	}
}
