package com.projeto.propet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.projeto.propet.model.Endereco;
import com.projeto.propet.model.Proprietario;
import com.projeto.propet.services.EnderecoService;
import com.projeto.propet.services.ProprietarioService;

@Controller
@RequestMapping("/endereco")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @Autowired
    private ProprietarioService proprietarioService;
 
    @GetMapping("/{id}/cadastrar-endereco")
    public ModelAndView cadastrarEndereco(@PathVariable Long id) {
        ModelAndView cadastrarEnderecoMv= new ModelAndView("endereco/cadastrarEndereco");
        cadastrarEnderecoMv.addObject("endereco", new Endereco());
        Proprietario proprietario = proprietarioService.retornarProprietario(id);        
        cadastrarEnderecoMv.addObject("nomeProprietario",proprietario.getNomeProprietario());
        return cadastrarEnderecoMv;
    }

    @PostMapping("/{id}/cadastrar-endereco")
    public ModelAndView salvarEndereco( Endereco endereco, @PathVariable Long id) {
        ModelAndView salvarEnderecoMv= new ModelAndView("redirect:proprietarios/listar");             
        enderecoService.salvar(endereco, id);
        return salvarEnderecoMv;
    }
    
}
