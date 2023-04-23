package com.projeto.propet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.propet.model.Vacina;

public interface VacinaRepository extends JpaRepository<Vacina,Long> {
    
}
