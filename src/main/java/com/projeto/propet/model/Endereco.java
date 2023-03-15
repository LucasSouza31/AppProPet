package com.projeto.propet.model;

import java.util.List;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

public class Endereco {

    private String nomeRua;

    private String numeroCasa;

    private String nomeCidade;

    private String nomeEstado;

    private String nomePais;

    private String cepRua;

    @OneToMany (mappedBy ="endereco") //autorrelacionamento?    
    private List<Proprietario> proprietarios;
    
}
