package com.example.genschool.controller;

import com.example.genschool.model.Estudante;
import com.example.genschool.service.EstudanteService;

import jakarta.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/estudantes")
public class EstudanteController {

    //injeção por contrutor, sem @Autowired 
    private final EstudanteService estudanteService;

    public EstudanteController(EstudanteService estudanteService) {
        this.estudanteService = estudanteService;
    }

    @GetMapping
    public ResponseEntity<Iterable<Estudante>> getAllEstudantes() {
        Iterable<Estudante> estudantes = estudanteService.findAll();
        return new ResponseEntity<>(estudantes, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estudante> getEstudanteById(@PathVariable Long id) {
        Estudante estudante = estudanteService.findById(id);
        if (estudante != null) {
            return new ResponseEntity<>(estudante, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Estudante> createEstudante(@Valid @RequestBody Estudante estudante) {
        Estudante savedEstudante = estudanteService.save(estudante);
        return new ResponseEntity<>(savedEstudante, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Estudante> updateEstudante(@PathVariable Long id, @Valid @RequestBody Estudante estudante) {
        Estudante existingEstudante = estudanteService.findById(id);
        if (existingEstudante != null) {
            estudante.setId(id);
            Estudante updatedEstudante = estudanteService.save(estudante);
            return new ResponseEntity<>(updatedEstudante, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

/*@PutMapping("/{id}")   
    public ResponseEntity<Estudante> updateEstudante(@PathVariable Long id, @RequestBody Estudante estudanteDetails) {
        Estudante estudante = estudanteService.findById(id);
        if (estudante != null) {
            estudante.setNome(estudanteDetails.getNome());
            estudante.setIdade(estudanteDetails.getIdade());
            estudante.setNotaPrimeiroSemestre(estudanteDetails.getNotaPrimeiroSemestre());
            estudante.setNotaSegundoSemestre(estudanteDetails.getNotaSegundoSemestre());
            estudante.setNomeProfessor(estudanteDetails.getNomeProfessor());
            estudante.setNumeroSala(estudanteDetails.getNumeroSala());
            return ResponseEntity.ok(estudanteService.save(estudante));
        } else {
            return ResponseEntity.notFound().build();
        }
    }*/

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEstudante(@PathVariable Long id) {
        if (estudanteService.findById(id) != null) {
            estudanteService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    /*@DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEstudante(@PathVariable Long id) {
        Estudante estudante = estudanteService.findById(id);
        if (estudante != null) {
            estudanteService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }*/
}
