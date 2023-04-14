package com.projeto.propet.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.propet.model.Endereco;
import com.projeto.propet.model.Proprietario;
import com.projeto.propet.repository.EnderecoRepository;
import com.projeto.propet.repository.ProprietarioRepository;

@Service
public class EnderecoService {
    
    @Autowired
    private EnderecoRepository enderecoRepository;
    
    @Autowired
    private ProprietarioRepository proprietarioRepository;


    public void salvar(Endereco endereco, Long id){
        Proprietario proprietario= proprietarioRepository.getReferenceById(id);

        if(proprietario.getEnderecoProprietario()!= null){
            throw new IllegalArgumentException("Já possui endereço cadastrado s");
        }

        proprietario.setEnderecoProprietario(endereco);        
        enderecoRepository.save(endereco);
    }

}
