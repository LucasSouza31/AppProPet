package com.projeto.propet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.projeto.propet.services.AnimalEstimacaoService;
import com.projeto.propet.services.CartaoVacinaPetService;
import com.projeto.propet.services.VacinaService;

@Controller
@RequestMapping("/cartao-vacina")
public class CartaoVacinaPetController {
    //fazer um controlador para inserir vacina, vamos precisar receber o nome do pet
    
    @Autowired
    private CartaoVacinaPetService cartaoVacinaPetService;

    @Autowired
    private AnimalEstimacaoService animalEstimacaoService;

    @Autowired
    private VacinaService vacinaService;

    @GetMapping
    public ModelAndView inserirVacina() {
        ModelAndView mv = new ModelAndView("cartaopet/inserirVacina");
        mv.addObject("vacina", vacinaService.buscarVacina());
        return mv;  
    }
}
