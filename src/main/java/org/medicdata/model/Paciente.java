package org.medicdata.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "paciente1")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpaciente", unique = true)
    private Long idpaciente;

    @Column(name = "nome")
    private String nome;

    @Column(name = "idade")
    private int idade;

    @Column(name = "altura")
    private int altura;

    @Column(name = "peso")
    private int peso;

//    @Column(name = "glicose")
//    private int glicose;
//
//    @Column(name = "creatinina")
//    private double creatinina;
//
//    @Column(name = "ck_mb")
//    private double ck_mb;
//
//    @Column(name = "hemoglobina")
//    private double hemoglobina;
//
//    @Column(name = "leucocitos")
//    private int leucocitos;
//
//    @Column(name = "neutrofilos")
//    private int neutrofilos;
//
//    @Column(name = "HDL")
//    private double HDL;
//
//    @Column(name = "LDL")
//    private double LDL;
//
//    @Column(name = "troponina")
//    private int troponina;
//
//    @Column(name = "albumina")
//    private int albumina;
//
//    @Column(name = "hipertensao")
//    private String hipertensao;
//
//    @Column(name = "diabetes")
//    private String diabetes;
//
//    @Column(name = "fumante")
//    private String fumante;
//
//    @Column(name = "alcoolismo")
//    private String alcoolismo;
//
//    @Column(name = "comorbidades")
//    private String comorbidades;

    @Column(name = "diagnostico")
    private String diagnostico;

//    @Column(name = "nascimento")
//    private Date nascimento;

    public Paciente(Long idpaciente, String nome, int altura, int peso, String diagnostico) {

        // Long idpaciente,  int glicose, double creatinina, double ck_mb, double hemoglobina, int leucocitos, int neutrofilos, double HDL, double LDL, int troponina, int albumina, String hipertensao, String diabetes, String fumante, String alcoolismo, String comorbidades,

        this.idpaciente = idpaciente;

        this.nome = nome;

        this.altura = altura;

        this.peso = peso;

        this.diagnostico = diagnostico;

//        this.glicose = glicose;
//        this.creatinina = creatinina;
//        this.ck_mb = ck_mb;
//        this.hemoglobina = hemoglobina;
//        this.leucocitos = leucocitos;
//        this.neutrofilos = neutrofilos;
//        this.HDL = HDL;
//        this.LDL = LDL;
//        this.troponina = troponina;
//        this.albumina = albumina;
//        this.hipertensao = hipertensao;
//        this.diabetes = diabetes;
//        this.fumante = fumante;
//        this.alcoolismo = alcoolismo;
//        this.comorbidades = comorbidades;
        //this.nascimento = nascimento;
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

//    public int getIdade() {
//        return idade;
//    }
//
//    public void setIdade(int idade) {
//        this.idade = idade;
//    }

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

//    public int getGlicose() {
//        return glicose;
//    }
//
//    public void setGlicose(int glicose) {
//        this.glicose = glicose;
//    }
//
//    public double getCreatinina() {
//        return creatinina;
//    }
//
//    public void setCreatinina(double creatinina) {
//        this.creatinina = creatinina;
//    }
//
//    public double getCk_mb() {
//        return ck_mb;
//    }
//
//    public void setCk_mb(double ck_mb) {
//        this.ck_mb = ck_mb;
//    }
//
//    public double getHemoglobina() {
//        return hemoglobina;
//    }
//
//    public void setHemoglobina(double hemoglobina) {
//        this.hemoglobina = hemoglobina;
//    }
//
//    public int getLeucocitos() {
//        return leucocitos;
//    }
//
//    public void setLeucocitos(int leucocitos) {
//        this.leucocitos = leucocitos;
//    }
//
//    public int getNeutrofilos() {
//        return neutrofilos;
//    }
//
//    public void setNeutrofilos(int neutrofilos) {
//        this.neutrofilos = neutrofilos;
//    }
//
//    public double getHDL() {
//        return HDL;
//    }
//
//    public void setHDL(double HDL) {
//        this.HDL = HDL;
//    }
//
//    public double getLDL() {
//        return LDL;
//    }
//
//    public void setLDL(double LDL) {
//        this.LDL = LDL;
//    }
//
//    public int getTroponina() {
//        return troponina;
//    }
//
//    public void setTroponina(int troponina) {
//        this.troponina = troponina;
//    }
//
//    public int getAlbumina() {
//        return albumina;
//    }
//
//    public void setAlbumina(int albumina) {
//        this.albumina = albumina;
//    }
//
//    public String getHipertensao() {
//        return hipertensao;
//    }
//
//    public void setHipertensao(String hipertensao) {
//        this.hipertensao = hipertensao;
//    }
//
//    public String getDiabetes() {
//        return diabetes;
//    }
//
//    public void setDiabetes(String diabetes) {
//        this.diabetes = diabetes;
//    }
//
//    public String getFumante() {
//        return fumante;
//    }
//
//    public void setFumante(String fumante) {
//        this.fumante = fumante;
//    }
//
//    public String getAlcoolismo() {
//        return alcoolismo;
//    }
//
//    public void setAlcoolismo(String alcoolismo) {
//        this.alcoolismo = alcoolismo;
//    }
//
//    public String getComorbidades() {
//        return comorbidades;
//    }
//
//    public void setComorbidades(String comorbidades) {
//        this.comorbidades = comorbidades;
//    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

//    public Date getNascimento() {return nascimento; }
//
//    public void setNascimento(Date nascimento) {this.nascimento = nascimento; }
}

