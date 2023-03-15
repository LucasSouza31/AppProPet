package com.projeto.propet.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Animal_Estimacao")
public class AnimalEstimacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nomePet;

    private String dataNascimentoPet;

    @OneToOne//??
    private CartaoVacinaPet cartaoVacina;

    private TipoAnimal tipoAnimal;

    private String raçaAnimal;

    @ManyToOne
    @JoinColumn(name="proprietario_id")
    private  Proprietario proprietarioPet;


    

    public AnimalEstimacao() {
    }
    

    public AnimalEstimacao(String nomePet, String dataNascimentoPet, CartaoVacinaPet cartaoVacina,
            TipoAnimal tipoAnimal, String raçaAnimal, Proprietario proprietarioPet) {
        this.nomePet = nomePet;
        this.dataNascimentoPet = dataNascimentoPet;
        this.cartaoVacina = cartaoVacina;
        this.tipoAnimal = tipoAnimal;
        this.raçaAnimal = raçaAnimal;
        this.proprietarioPet = proprietarioPet;
    }

    public String getNomePet() {
        return nomePet;
    }

    public void setNomePet(String nomePet) {
        this.nomePet = nomePet;
    }

    public String getDataNascimentoPet() {
        return dataNascimentoPet;
    }

    public void setDataNascimentoPet(String dataNascimentoPet) {
        this.dataNascimentoPet = dataNascimentoPet;
    }

    public CartaoVacinaPet getCartaoVacina() {
        return cartaoVacina;
    }

    public void setCartaoVacina(CartaoVacinaPet cartaoVacina) {
        this.cartaoVacina = cartaoVacina;
    }

    public TipoAnimal getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(TipoAnimal tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public String getRaçaAnimal() {
        return raçaAnimal;
    }

    public void setRaçaAnimal(String raçaAnimal) {
        this.raçaAnimal = raçaAnimal;
    }

    public Proprietario getProprietarioPet() {
        return proprietarioPet;
    }

    public void setProprietarioPet(Proprietario proprietarioPet) {
        this.proprietarioPet = proprietarioPet;
    }

   




}
