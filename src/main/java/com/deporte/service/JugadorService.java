package com.deporte.service;

import java.util.List;
import java.util.Optional;

import com.deporte.entity.Jugador;

public interface JugadorService {

	public abstract List<Jugador> listaJugador();
	public abstract Jugador insertaActualizaAlumno(Jugador obj);
	public abstract void eliminaAlumno(int id);

	
}
