package com.projeto.propet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.propet.model.Proprietario;

public interface ProprietarioRepository extends JpaRepository<Proprietario, Long> {
    
}
