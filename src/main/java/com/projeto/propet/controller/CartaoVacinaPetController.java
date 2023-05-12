package com.projeto.propet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.projeto.propet.model.CartaoVacinaPet;
import com.projeto.propet.model.Vacina;
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

    @GetMapping("/{id}")
    public ModelAndView aplicarVacina(@PathVariable("id") Long petId) {
        ModelAndView mv = new ModelAndView("cartaopet/inserirVacina");
        mv.addObject("cartaoVacina", new CartaoVacinaPet());          
        mv.addObject("vacina", vacinaService.buscarVacina()); // escolher vacina
        mv.addObject("nomeDoPet", animalEstimacaoService.encontrarPetEspecifico(petId).getNomePet()); // mostrar o pet e que vacina vai receber
        return mv;  
    }

    @PostMapping("/{id}")
    public ModelAndView salvarVacinaNoCartao(CartaoVacinaPet cartao, @PathVariable("id") Long petId) {
        ModelAndView mv = new ModelAndView("redirect:proprietario/listarProprietario"); 
        
        cartaoVacinaPetService.salvar(cartao);
        return mv;
    }






}
