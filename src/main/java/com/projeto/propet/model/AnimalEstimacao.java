package com.projeto.propet.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="animal_estimacao")
public class AnimalEstimacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nomePet;

    private Date dataNascimentoPet;

   @OneToOne(mappedBy = "animalEstimacao")
    private CartaoVacinaPet cartaoVacina;

    private TipoAnimal tipoAnimal;

    private String raçaAnimal;

    @ManyToOne
    @JoinColumn(name="proprietario_id")
    private  Proprietario proprietarioPet;


    

     




}
