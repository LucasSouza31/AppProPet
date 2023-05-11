package com.projeto.propet.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.propet.model.AnimalEstimacao;
import com.projeto.propet.model.Proprietario;
import com.projeto.propet.repository.ProprietarioRepository;

@Service
public class ProprietarioService {
    
    @Autowired
    private ProprietarioRepository proprietarioRepository;

  

    public void salvar( Proprietario proprietario) {        
        proprietarioRepository.save(proprietario);
    }

    public List<Proprietario> listar() {        
       return proprietarioRepository.findAll();        
    }

    public Proprietario retornarProprietario(Long id) {
       return  proprietarioRepository.getReferenceById(id);       
    }

    public List<AnimalEstimacao> listarPets(Long id) {
        Proprietario proprietario= retornarProprietario(id);
        return proprietario.getPetsProprietario();
    }

}
