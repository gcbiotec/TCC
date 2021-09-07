package org.medicdata.model;

import javax.persistence.*;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.List;


@Entity
@Table(name = "paciente")
public class Paciente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpaciente", unique = true)
    private Long idpaciente;

    @Column(name = "nome")
    private String nome;

    @Column(name = "altura")
    private int altura;

    @Column(name = "peso")
    private int peso;

    @OneToMany(
            mappedBy = "paciente",
            targetEntity = Prontuario.class,
            fetch = FetchType.LAZY,
            cascade = CascadeType.PERSIST
    )
    private List<Prontuario> prontuarios;

    public Paciente(){};

    public Paciente(Long idpaciente, String nome, int altura, int peso,  List<Prontuario> prontuarios) {

        super();

        this.idpaciente = idpaciente;

        this.nome = nome;

        this.altura = altura;

        this.peso = peso;

        this.prontuarios = prontuarios;

    }


    public Long getIdpaciente() {
        return idpaciente;
    }

    public void setIdpaciente(Long idpaciente) {
        this.idpaciente = idpaciente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public List<Prontuario> getProntuarios() {
        return prontuarios;
    }

    public void setProntuarios(List<Prontuario> prontuarios) {
        this.prontuarios = prontuarios;
    }



}

