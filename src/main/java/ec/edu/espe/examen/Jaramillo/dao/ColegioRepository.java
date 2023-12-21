package ec.edu.espe.examen.Jaramillo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import ec.edu.espe.examen.Jaramillo.domain.Colegio;

public interface ColegioRepository extends CrudRepository<Colegio, Long> {

    Colegio findByNombre(String nombre);

    List<Colegio> findByNombreLike(String nombre);
}
