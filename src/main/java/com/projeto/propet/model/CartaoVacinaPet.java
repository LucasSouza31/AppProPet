package com.projeto.propet.model;

import java.sql.Date;

import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;


@Entity
@Table(name = "cartao_vacina")
public class CartaoVacinaPet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nomeVacina;

    private Date dataVacina;

    private Date dataProximaVacina;

    private String sexoAnimal;

    @OneToOne
    @JoinColumn(name="animal_estimacao_id")
    private AnimalEstimacao animalEstimacao;


    
    public CartaoVacinaPet() {
    }

    public CartaoVacinaPet(String nomeVacina, Date dataVacina, Date dataProximaVacina, String sexoAnimal,
            AnimalEstimacao animalEstimacao) {
        this.nomeVacina = nomeVacina;
        this.dataVacina = dataVacina;
        this.dataProximaVacina = dataProximaVacina;
        this.sexoAnimal = sexoAnimal;
        this.animalEstimacao = animalEstimacao;
    }

    public String getNomeVacina() {
        return nomeVacina;
    }

    public void setNomeVacina(String nomeVacina) {
        this.nomeVacina = nomeVacina;
    }

    public Date getDataVacina() {
        return dataVacina;
    }

    public void setDataVacina(Date dataVacina) {
        this.dataVacina = dataVacina;
    }

    public Date getDataProximaVacina() {
        return dataProximaVacina;
    }

    public void setDataProximaVacina(Date dataProximaVacina) {
        this.dataProximaVacina = dataProximaVacina;
    }

    public String getSexoAnimal() {
        return sexoAnimal;
    }

    public void setSexoAnimal(String sexoAnimal) {
        this.sexoAnimal = sexoAnimal;
    }

    public AnimalEstimacao getAnimalEstimacao() {
        return animalEstimacao;
    }

    public void setAnimalEstimacao(AnimalEstimacao animalEstimacao) {
        this.animalEstimacao = animalEstimacao;
    }




}
