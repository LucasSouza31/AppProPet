package com.projeto.propet.model;

import java.sql.Date;

import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;



public class CartaoVacinaPet {
    
    private String nomeVacina;

    private Date dataVacina;

    private Date dataProximaVacina;

    private String sexoAnimal;

    @OneToOne
    @JoinColumn(name="animal_estimacao_id")
    private AnimalEstimacao animalEstimacao;




}
