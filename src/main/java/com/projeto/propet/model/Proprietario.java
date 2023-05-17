package com.projeto.propet.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "proprietario")
public class Proprietario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String cpfProprietario;

    private String nomeProprietario;

    private String sobrenomeProrpietario;

    private String DDDTelefoneProprietario;

    private String telefoneProprietario;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="endereco_id_fk")
    private Endereco enderecoProprietario;

    @OneToMany(mappedBy="proprietarioPet")    
    private List <AnimalEstimacao> petsProprietario;

    
}
