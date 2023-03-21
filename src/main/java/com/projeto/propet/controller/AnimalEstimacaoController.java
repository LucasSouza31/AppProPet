package com.projeto.propet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.projeto.propet.model.AnimalEstimacao;
import com.projeto.propet.services.AnimalEstimacaoService;

@Controller
@RequestMapping("/pet")
public class AnimalEstimacaoController {
    
    @Autowired
    AnimalEstimacaoService animalEstimacaoService;

    @GetMapping("/novoPet")
    public ModelAndView cadastrarPet(){
        ModelAndView cadastrarPetMv = new ModelAndView("animalEstimacao/cadastrarPet");
        cadastrarPetMv.addObject("animalEstimacao", new AnimalEstimacao());
        return cadastrarPetMv;
    }

    @PostMapping("/novoPet")
    public ModelAndView salvarPet(AnimalEstimacao pet){
        ModelAndView salvarNovoPetMv = new ModelAndView("redirect:animalEstimacao/cadastrarPet");
        animalEstimacaoService.salvar(pet);
        return salvarNovoPetMv;
    }







}
