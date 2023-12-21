package ec.edu.espe.examen.Jaramillo.service;

import java.util.List;

import ec.edu.espe.examen.Jaramillo.dao.AlumnoRepository;
import ec.edu.espe.examen.Jaramillo.dao.ColegioRepository;
import ec.edu.espe.examen.Jaramillo.domain.Alumno;
import ec.edu.espe.examen.Jaramillo.domain.Colegio;
import jakarta.transaction.Transactional;

public class AlumnoService {
    private final AlumnoRepository alumnoRepository;

    public AlumnoService(AlumnoRepository alumnoRepository) {
        this.alumnoRepository = alumnoRepository;
    }

    @Transactional
    public Alumno crearAlumno(Alumno alumno) {
        try {
            Colegio optionalColegio = colegioRepository.findByNombre(colegio.getNombre());

            if (optionalColegio == null) {
                return colegioRepository.save(colegio);
            } else {
                throw new RuntimeException("Colegio: " + colegio.getNombre() + " ya existe.");
            }
        } catch (Exception e) {
            throw new CreacionExeption("No se pudo crear colegio: " + colegio + ", error: " + e);
        }
    }

    public List<Colegio> findByNombreLike(String nombre) {
        return this.colegioRepository.findByNombreLike(nombre);
    }

    public class CreacionExeption extends RuntimeException {
        public CreacionExeption(String message) {
            super(message);
        }
    }
}
