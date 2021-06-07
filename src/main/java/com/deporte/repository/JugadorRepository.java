package com.deporte.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.deporte.entity.Jugador;

public interface JugadorRepository extends JpaRepository<Jugador, Integer> {

	
	/*@Query("Select a from Alumno a where nombre like :fil")
	public abstract List<Jugador> listaAlumnoPorNombreLike(@Param("fil") String filtro);

	public abstract List<Jugador> findByDni(String dni);
	public abstract List<Jugador> findByDniAndIdAlumnoNot(String dni, int idAlumno);*/
}
