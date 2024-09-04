package com.example.genschool.repository;

import com.example.genschool.model.Estudante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudanteRepository extends JpaRepository<Estudante, Long> {
    // Custom query methods (se necessário)
}
