package com.projeto.propet.model;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class AnimalEstimacao {
    
    private String nomePet;

    private String dataNascimentoPet;

    private CartaoVacinaPet cartaoVacina;

    private String tipoAnimal;

    private String raçaAnimal;

    @ManyToOne
    @JoinColumn(name="proprietario_id")
    private  Proprietario proprietarioPet;







}
