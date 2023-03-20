package com.projeto.propet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.propet.model.Proprietario;
import com.projeto.propet.repository.ProprietarioRepository;

@Service
public class ProprietarioService {
    
    @Autowired
    private ProprietarioRepository proprietarioRepository;


    public void salvar( Proprietario proprietario) {        
        proprietarioRepository.save(proprietario);
    }


}
