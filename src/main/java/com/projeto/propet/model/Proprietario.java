package com.projeto.propet.model;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.List;

public class Proprietario {

    private String nomeProprietario;

    private String sobrenomeProrpietario;

    private String DDDTelefoneProprietario;

    private String telefoneProprietario;

    @ManyToOne
    @JoinColumn(name="endereco_id")
    private Endereco enderecoProprietario;

    @OneToMany(mappedBy="proprietario")    
    private List <AnimalEstimacao> petsProprietario;

    
}
