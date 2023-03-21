package com.projeto.propet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.propet.model.AnimalEstimacao;
import com.projeto.propet.repository.AnimalEstimacaoRepository;

@Service
public class AnimalEstimacaoService {

    @Autowired
    AnimalEstimacaoRepository animalEstimacaoRepository;

    public void salvar(AnimalEstimacao pet) {
        animalEstimacaoRepository.save(pet);
    }
    
}
