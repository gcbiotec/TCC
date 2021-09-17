package org.medicdata.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.persistence.Entity;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "prontuario")
public class Prontuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idprontuario", unique = true)
    private Long idprontuario;

    @Column(name = "idpaciente")
    private Long idpaciente;

    @Column(name = "datacriacao")
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime datacriacao;

    @Column(name = "glicose")
    private int glicose;

    @Column(name = "creatinina")
    private double creatinina;

    @Column(name = "ck_mb")
    private double ckmb;

    @Column(name = "hemoglobina")
    private double hemoglobina;

    @Column(name = "leucocitos")
    private int leucocitos;

    @Column(name = "neutrofilos")
    private int neutrofilos;

    @Column(name = "HDL")
    private double HDL;

    @Column(name = "LDL")
    private double LDL;

    @Column(name = "troponina")
    private int troponina;

    @Column(name = "albumina")
    private int albumina;

    @Column(name = "hipertensao")
    private String hipertensao;

    @Column(name = "diabetes")
    private String diabetes;

    @Column(name = "fumante")
    private String fumante;

    @Column(name = "alcoolismo")
    private String alcoolismo;

    @Column(name = "comorbidades")
    private String comorbidades;

    @Column(name = "diagnostico")
    private String diagnostico;

    @Column(name = "idade")
    private int idade;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "idpaciente",insertable = false, updatable = false)
    private Paciente paciente;

    public Prontuario(Long idprontuario, int glicose, double creatinina, double ckmb,
                      double hemoglobina, int leucocitos, int neutrofilos, double HDL, double LDL,
                      int troponina, int albumina, String hipertensao, String diabetes, String fumante,
                      String alcoolismo, String comorbidades, String diagnostico, int idade) {

        this.idprontuario = idprontuario;
        this.glicose = glicose;
        this.creatinina = creatinina;
        this.ckmb = ckmb;
        this.hemoglobina = hemoglobina;
        this.leucocitos = leucocitos;
        this.neutrofilos = neutrofilos;
        this.HDL = HDL;
        this.LDL = LDL;
        this.troponina = troponina;
        this.albumina = albumina;
        this.hipertensao = hipertensao;
        this.diabetes = diabetes;
        this.fumante = fumante;
        this.alcoolismo = alcoolismo;
        this.comorbidades = comorbidades;
        this.diagnostico = diagnostico;
        this.idade = idade;
    }

    public Prontuario() {
    }

    public Long getIdprontuario() {
        return idprontuario;
    }

    public void setIdprontuario(Long idprontuario) {
        this.idprontuario = idprontuario;
    }

    public Long getIdpaciente() {
        return idpaciente;
    }

    public void setIdpaciente(Long idpaciente) {
        this.idpaciente = idpaciente;
    }

    public int getGlicose() {
        return glicose;
    }

    public void setGlicose(int glicose) {
        this.glicose = glicose;
    }

    public double getCreatinina() {
        return creatinina;
    }

    public void setCreatinina(double creatinina) {
        this.creatinina = creatinina;
    }

    public double getCkmb() {
        return ckmb;
    }

    public void setCkmb(double ckmb) {
        this.ckmb = ckmb;
    }

    public double getHemoglobina() {
        return hemoglobina;
    }

    public void setHemoglobina(double hemoglobina) {
        this.hemoglobina = hemoglobina;
    }

    public int getLeucocitos() {
        return leucocitos;
    }

    public void setLeucocitos(int leucocitos) {
        this.leucocitos = leucocitos;
    }

    public int getNeutrofilos() {
        return neutrofilos;
    }

    public void setNeutrofilos(int neutrofilos) {
        this.neutrofilos = neutrofilos;
    }

    public double getHDL() {
        return HDL;
    }

    public void setHDL(double HDL) {
        this.HDL = HDL;
    }

    public double getLDL() {
        return LDL;
    }

    public void setLDL(double LDL) {
        this.LDL = LDL;
    }

    public int getTroponina() {
        return troponina;
    }

    public void setTroponina(int troponina) {
        this.troponina = troponina;
    }

    public int getAlbumina() {
        return albumina;
    }

    public void setAlbumina(int albumina) {
        this.albumina = albumina;
    }

    public String getHipertensao() {
        return hipertensao;
    }

    public void setHipertensao(String hipertensao) {
        this.hipertensao = hipertensao;
    }

    public String getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(String diabetes) {
        this.diabetes = diabetes;
    }

    public String getFumante() {
        return fumante;
    }

    public void setFumante(String fumante) {
        this.fumante = fumante;
    }

    public String getAlcoolismo() {
        return alcoolismo;
    }

    public void setAlcoolismo(String alcoolismo) {
        this.alcoolismo = alcoolismo;
    }

    public String getComorbidades() {
        return comorbidades;
    }

    public void setComorbidades(String comorbidades) {
        this.comorbidades = comorbidades;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public LocalDateTime getDatacriacao() {
        return datacriacao;
    }

    public void setDatacriacao(LocalDateTime datacriacao) {
        this.datacriacao = datacriacao;
    }
}