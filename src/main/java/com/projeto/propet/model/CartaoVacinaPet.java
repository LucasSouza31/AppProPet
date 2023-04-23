package com.projeto.propet.model;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cartao_vacina")
public class CartaoVacinaPet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nomeVacina;

    private Date dataVacina;

    private int DiasProximaVacina;

    private String sexoAnimal;
    
    @OneToMany(mappedBy = "cartaoVacina")
    private List<Vacina> vacinaPet;

    @OneToOne
    @JoinColumn(name="animal_estimacao_id")
    private AnimalEstimacao animalEstimacao;

}
