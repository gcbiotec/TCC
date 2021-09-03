package org.medicdata.model;

import javax.persistence.*;

@Entity
@Table(name = "registro_paciente")
public class Paciente {

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

    public Paciente(Long idpaciente, String nome, int altura, int peso) {

        this.idpaciente = idpaciente;

        this.nome = nome;

        this.altura = altura;

        this.peso = peso;

    }

    public Paciente(){}

    public Long getId() {
        return idpaciente;
    }

    public void setId(Long pacienteId) {
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


}

