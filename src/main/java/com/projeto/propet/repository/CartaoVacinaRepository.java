package com.projeto.propet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.propet.model.CartaoVacinaPet;
import com.projeto.propet.model.Vacina;

public interface CartaoVacinaRepository extends JpaRepository<CartaoVacinaPet, Long>{

    void save(Vacina vacina);
    
}
