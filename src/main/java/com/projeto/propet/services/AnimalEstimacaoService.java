package com.projeto.propet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.propet.model.AnimalEstimacao;
import com.projeto.propet.model.Proprietario;
import com.projeto.propet.repository.AnimalEstimacaoRepository;
import com.projeto.propet.repository.ProprietarioRepository;

@Service
public class AnimalEstimacaoService {

    @Autowired
    AnimalEstimacaoRepository animalEstimacaoRepository;
    
    @Autowired
    private ProprietarioRepository proprietarioRepository;

    public void salvar(AnimalEstimacao pet, Long proprietarioId) {
        Proprietario proprietario = proprietarioRepository.getReferenceById(proprietarioId);
        pet.setProprietarioPet(proprietario);
        animalEstimacaoRepository.save(pet);
    }

    public AnimalEstimacao encontrarPetEspecifico(Long petId) {
        return animalEstimacaoRepository.getReferenceById(petId);
    }

    
}
