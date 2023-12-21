package ec.edu.espe.examen.Jaramillo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.espe.examen.Jaramillo.domain.Colegio;
import ec.edu.espe.examen.Jaramillo.service.ColegioService;

@RestController
@RequestMapping("/colegio")
public class ColegioController {

    private ColegioService colegioService;
    
    @GetMapping("/listar/{nombre}")
    public ResponseEntity<List<Colegio>> findByNombreL(@PathVariable String nombre) {
        return ResponseEntity.ok().body(colegioService.findByNombreLike(nombre));
    }

    @PostMapping("/crear")
    public ResponseEntity<Colegio> save(@RequestBody Colegio colegio) {
        return ResponseEntity.ok().body(colegioService.crearColegio(colegio));
    }
}
