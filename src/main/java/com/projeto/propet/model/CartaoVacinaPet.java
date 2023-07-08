package com.projeto.propet.model;

import java.time.LocalDate;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
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
      
    @Column(name = "primeira_dose")
    @DateTimeFormat(iso = ISO.DATE)
    private LocalDate dataVacina;

    @Column(name = "proxima_dose")
    @DateTimeFormat(iso = ISO.DATE)
    private LocalDate proximaDose;    
    
    @Column(name = "vacinas")
    @OneToMany(mappedBy = "cartaoVacina", cascade = CascadeType.ALL)
    private List<Vacina> vacinas;

   
    @OneToOne
    @JoinColumn(name="animal_estimacao_id_fk")
    private AnimalEstimacao animalEstimacao;

}
