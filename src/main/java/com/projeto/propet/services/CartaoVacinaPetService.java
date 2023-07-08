package com.projeto.propet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.propet.model.AnimalEstimacao;
import com.projeto.propet.model.CartaoVacinaPet;
import com.projeto.propet.model.Vacina;
import com.projeto.propet.repository.AnimalEstimacaoRepository;
import com.projeto.propet.repository.CartaoVacinaRepository;
import com.projeto.propet.repository.VacinaRepository;

@Service
public class CartaoVacinaPetService {
    
    @Autowired
    private CartaoVacinaRepository cartaoVacinaRepository;

    @Autowired
    private AnimalEstimacaoRepository animalEstimacaoRepository;

    @Autowired
    private VacinaRepository vacinaRepository;


    public void salvar(CartaoVacinaPet cartao, Long petId, Long vacinaId) {
        AnimalEstimacao pet = animalEstimacaoRepository.getReferenceById(petId);
        Vacina vacina = vacinaRepository.getReferenceById(vacinaId);       
        vacina.setCartaoVacina(cartao);
        cartao.setAnimalEstimacao(pet);
        cartaoVacinaRepository.save(cartao);
    }

  
    public CartaoVacinaPet buscarCartaoVacinaPetPorId(Long petId){
     return animalEstimacaoRepository.getReferenceById(petId).getCartaoVacina();          
    }
    
    // public CartaoVacinaPet buscarCartaoVacinaPetPorId(Long petId) {
    //     return cartaoVacinaRepository.findPetById(petId);
    // }

}
