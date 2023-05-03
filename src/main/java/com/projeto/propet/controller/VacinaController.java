package com.projeto.propet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.projeto.propet.model.Vacina;
import com.projeto.propet.services.VacinaService;

@Controller
@RequestMapping("/vacina")
public class VacinaController {
    
    @Autowired
    private VacinaService vacinaService;
    
    @GetMapping("/cadastrar")
    public ModelAndView home() {
        ModelAndView mv= new ModelAndView("vacina/cadastrar");
        mv.addObject("vacina",new Vacina());
        return mv;
    }

    @PostMapping("/cadastrar")
    public ModelAndView salvar(Vacina vacina) {
        ModelAndView mv= new ModelAndView("vacina/cadastrar");
        vacinaService.salvar(vacina);
        return mv;
    }

    




}
