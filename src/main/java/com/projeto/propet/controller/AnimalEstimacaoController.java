package com.projeto.propet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.projeto.propet.model.AnimalEstimacao;
import com.projeto.propet.model.TipoAnimal;
import com.projeto.propet.services.AnimalEstimacaoService;
import com.projeto.propet.services.ProprietarioService;

@Controller
@RequestMapping("/pet")
public class AnimalEstimacaoController {
    
    @Autowired
    private AnimalEstimacaoService animalEstimacaoService;
    
    @Autowired
    private ProprietarioService proprietarioService;
 

    @GetMapping("/{id}/cadastrar-novoPet")
    public ModelAndView cadastrarPet(@PathVariable Long id){
        ModelAndView cadastrarPetMv = new ModelAndView("animalEstimacao/cadastrarPet");    
        cadastrarPetMv.addObject("animalEstimacao", new AnimalEstimacao());
        cadastrarPetMv.addObject("petProprietario", TipoAnimal.values());
        proprietarioService.retornarProprietario(id);    
        return cadastrarPetMv;
    }
   
    @PostMapping("/{id}/cadastrar-novoPet")
    public ModelAndView salvarPet(AnimalEstimacao animalEstimacao, @PathVariable Long id){
       ModelAndView savarNovoPetMv= new ModelAndView("redirect:/proprietarios/listar");
       animalEstimacaoService.salvar(animalEstimacao, id);       
        return savarNovoPetMv;
    }

}
