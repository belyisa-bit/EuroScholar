
package com.euroscholar.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "oportunidades")
public class Oportunidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O título é obrigatório")
    @Size(max = 180)
    @Column(nullable = false, length = 180)
    private String titulo;

    @Column(columnDefinition = "TEXT")
    private String descricao;

    @NotBlank(message = "O grau acadêmico é obrigatório")
    @Column(name = "grau_academico", nullable = false, length = 100)
    private String grauAcademico;

    @NotBlank(message = "A área de estudo é obrigatória")
    @Column(name = "area_estudo", nullable = false, length = 120)
    private String areaEstudo = "Ciência da Computação";

    @Column(length = 50)
    private String modalidade;

    @Column(length = 100)
    private String idioma;

    @Column(name = "prazo_inscricao")
    private LocalDate prazoInscricao;

    @Column(name = "valor_bolsa", precision = 12, scale = 2)
    private BigDecimal valorBolsa;

    @Size(max = 500)
    @Column(name = "link_inscricao", length = 500)
    private String linkInscricao;

    @Column(nullable = false)
    private Boolean ativa = true;

    @NotNull(message = "A universidade é obrigatória")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "universidade_id", nullable = false)
    private Universidade universidade;

    public Oportunidade() {
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getGrauAcademico() {
        return grauAcademico;
    }

    public void setGrauAcademico(String grauAcademico) {
        this.grauAcademico = grauAcademico;
    }

    public String getAreaEstudo() {
        return areaEstudo;
    }

    public void setAreaEstudo(String areaEstudo) {
        this.areaEstudo = areaEstudo;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public LocalDate getPrazoInscricao() {
        return prazoInscricao;
    }

    public void setPrazoInscricao(LocalDate prazoInscricao) {
        this.prazoInscricao = prazoInscricao;
    }

    public BigDecimal getValorBolsa() {
        return valorBolsa;
    }

    public void setValorBolsa(BigDecimal valorBolsa) {
        this.valorBolsa = valorBolsa;
    }

    public String getLinkInscricao() {
        return linkInscricao;
    }

    public void setLinkInscricao(String linkInscricao) {
        this.linkInscricao = linkInscricao;
    }

    public Boolean getAtiva() {
        return ativa;
    }

    public void setAtiva(Boolean ativa) {
        this.ativa = ativa;
    }

    public Universidade getUniversidade() {
        return universidade;
    }

    public void setUniversidade(Universidade universidade) {
        this.universidade = universidade;
    }
}
