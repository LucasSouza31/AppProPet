package com.projeto.propet.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.propet.model.Vacina;
import com.projeto.propet.repository.VacinaRepository;

@Service
public class VacinaService {

    @Autowired
    private VacinaRepository vacinaRepository;

    public void salvar(Vacina vacina) {
        vacinaRepository.save(vacina);
    }

    public List<Vacina> buscarVacina() {
        return vacinaRepository.findAll();
        
    }
    
}
