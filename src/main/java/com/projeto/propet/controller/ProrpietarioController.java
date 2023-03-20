package com.projeto.propet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.projeto.propet.model.Proprietario;
import com.projeto.propet.services.ProprietarioService;

@Controller
@RequestMapping("/proprietarios")
public class ProrpietarioController {
    
    @Autowired
   private ProprietarioService proprietarioService;

   

    @GetMapping("/cadastrar")
    public ModelAndView cadastrar() {
        ModelAndView cadastrarMv= new ModelAndView("proprietario/cadastrar"); // view que será retornada
        cadastrarMv.addObject("proprietario",new Proprietario());
        return cadastrarMv;
    }

    @PostMapping("/cadastrar")
    public ModelAndView salvarProprietario( Proprietario proprietario) {
        ModelAndView proprietarioMv= new ModelAndView("redirect:/cadastrar");
        proprietarioService.salvar(proprietario);
     
        return proprietarioMv;
    }
    

}
