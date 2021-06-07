package com.deporte.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deporte.entity.Jugador;
import com.deporte.repository.JugadorRepository;

@Service
public class JugadorServiceImpl implements JugadorService {

	@Autowired
	private JugadorRepository repository;

	@Override
	public List<Jugador> listaJugador() {
		return repository.findAll();
	}

	@Override
	public Jugador insertaActualizaAlumno(Jugador obj) {
		return repository.save(obj);
	}

	@Override
	public void eliminaAlumno(int id) {
		repository.deleteById(id);
	}

	

	

}
