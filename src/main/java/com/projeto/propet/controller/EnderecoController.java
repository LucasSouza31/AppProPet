package com.projeto.propet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.projeto.propet.model.Endereco;
import com.projeto.propet.model.Proprietario;
import com.projeto.propet.services.EnderecoService;

@Controller
@RequestMapping("/endereco")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;



    @GetMapping("/cadastrar")
    public ModelAndView cadastrarEndereco() {
        ModelAndView cadastrarEnderecoMv= new ModelAndView("endereco/cadastrarEndereco");
        cadastrarEnderecoMv.addObject("endereco", new Endereco());
       
        return cadastrarEnderecoMv;
    }

    @PostMapping("/cadastrar")
    public ModelAndView salvarEndereco( Endereco endereco) {
        ModelAndView salvarEnderecoMv= new ModelAndView("redirect:/endereco/cadastrarEndereco");
        Proprietario proprietarioEndereco = new Proprietario();
        
        enderecoService.salvar(endereco);
        return salvarEnderecoMv;
    }
    
}
