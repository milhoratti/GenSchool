
package com.example.genschool.service;

import com.example.genschool.model.Estudante;
import com.example.genschool.repository.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudanteService {

    //injeção com @Autowired
    @Autowired
    private EstudanteRepository estudanteRepository;

    //findAll Estudantes
    public List<Estudante> findAll() {
        return estudanteRepository.findAll();
    }
    //findById
    public Estudante findById(Long id) {
        return estudanteRepository.findById(id).orElse(null);
    }
    //salva o estudante
    public Estudante save(Estudante estudante) {
        return estudanteRepository.save(estudante);
    }
    //deletebyId
    public void deleteById(Long id) {
        estudanteRepository.deleteById(id);
    }
}
