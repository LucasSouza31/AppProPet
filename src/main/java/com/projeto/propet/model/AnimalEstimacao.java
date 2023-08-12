package com.projeto.propet.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
    
    @Column(name = "nome")
    private String nomePet;

    @Column(name = "data_nascimento")
    private LocalDate dataNascimentoPet;

    @OneToOne(mappedBy = "animalEstimacao")
    @JoinColumn(name = "cartao_vacina_id_fk")
    private CartaoVacinaPet cartaoVacina;
    
    @Enumerated(EnumType.STRING)
    private TipoAnimal tipoAnimal;

    @Column(name = "raca")
    private String racaAnimal;

    @Column(name = "sexo")
    private String sexoAnimal;

    @ManyToOne
    @JoinColumn(name="proprietario_id_fk")
    private  Proprietario proprietarioPet;



}
