package com.projeto.propet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.propet.model.CartaoVacinaPet;
import com.projeto.propet.repository.CartaoVacinaRepository;

@Service
public class CartaoVacinaPetService {
    
    @Autowired
    private CartaoVacinaRepository cartaoVacinaRepository;


    public void salvar(CartaoVacinaPet cartao) {
        cartaoVacinaRepository.save(cartao);
    }


}
