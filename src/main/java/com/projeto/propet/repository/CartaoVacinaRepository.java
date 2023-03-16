package com.projeto.propet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.propet.model.CartaoVacinaPet;

public interface CartaoVacinaRepository extends JpaRepository<CartaoVacinaPet, Long>{
    
}
