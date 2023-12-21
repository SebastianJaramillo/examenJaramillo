package ec.edu.espe.examen.Jaramillo.dao;

import org.springframework.data.repository.CrudRepository;

import ec.edu.espe.examen.Jaramillo.domain.Alumno;

public interface AlumnoRepository extends CrudRepository<Alumno, Long> {
    
    Alumno findByCedula(String cedula);
}
