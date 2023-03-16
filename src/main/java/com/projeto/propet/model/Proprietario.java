package com.projeto.propet.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "proprietario")
public class Proprietario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    private String nomeProprietario;

    private String sobrenomeProrpietario;

    private String DDDTelefoneProprietario;

    private String telefoneProprietario;

    @ManyToOne
    @JoinColumn(name="endereco_id")
    private Endereco enderecoProprietario;

    @OneToMany(mappedBy="proprietarioPet")    
    private List <AnimalEstimacao> petsProprietario;

    

    public Proprietario() {
    }

    public Proprietario(String nomeProprietario, String sobrenomeProrpietario, String dDDTelefoneProprietario,
            String telefoneProprietario, Endereco enderecoProprietario, List<AnimalEstimacao> petsProprietario) {
        this.nomeProprietario = nomeProprietario;
        this.sobrenomeProrpietario = sobrenomeProrpietario;
        DDDTelefoneProprietario = dDDTelefoneProprietario;
        this.telefoneProprietario = telefoneProprietario;
        this.enderecoProprietario = enderecoProprietario;
        this.petsProprietario = petsProprietario;
    }
    

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public String getSobrenomeProrpietario() {
        return sobrenomeProrpietario;
    }

    public void setSobrenomeProrpietario(String sobrenomeProrpietario) {
        this.sobrenomeProrpietario = sobrenomeProrpietario;
    }

    public String getDDDTelefoneProprietario() {
        return DDDTelefoneProprietario;
    }

    public void setDDDTelefoneProprietario(String dDDTelefoneProprietario) {
        DDDTelefoneProprietario = dDDTelefoneProprietario;
    }

    public String getTelefoneProprietario() {
        return telefoneProprietario;
    }

    public void setTelefoneProprietario(String telefoneProprietario) {
        this.telefoneProprietario = telefoneProprietario;
    }

    public Endereco getEnderecoProprietario() {
        return enderecoProprietario;
    }

    public void setEnderecoProprietario(Endereco enderecoProprietario) {
        this.enderecoProprietario = enderecoProprietario;
    }

    public List<AnimalEstimacao> getPetsProprietario() {
        return petsProprietario;
    }

    public void setPetsProprietario(List<AnimalEstimacao> petsProprietario) {
        this.petsProprietario = petsProprietario;
    }

    
}
