package ec.edu.espe.examen.Jaramillo.service;


import java.util.NoSuchElementException;
import java.util.Optional;

import ec.edu.espe.examen.Jaramillo.dao.AlumnoRepository;
import ec.edu.espe.examen.Jaramillo.dao.ColegioRepository;
import ec.edu.espe.examen.Jaramillo.domain.AlumnoAsignatura;

public class MatriculaService {
private final AlumnoRepository alumnoRepository;
    private final ColegioRepository colegioRepository;

    public MatriculaService(AlumnoRepository alumnoRepository, ColegioRepository colegioRepository) {
        this.alumnoRepository = alumnoRepository;
        this.colegioRepository = colegioRepository;
    }

}
