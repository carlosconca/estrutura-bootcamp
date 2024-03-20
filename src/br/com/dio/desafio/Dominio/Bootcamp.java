package br.com.dio.desafio.Dominio;

import java.util.Collection;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.time.LocalDate;


public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public java.lang.String getNome() {
        return nome;
    }

    public void setNmae(java.lang.String nome) {
        this.nome = nome;
    }

    public java.lang.String getDescricao() {
        return descricao;
    }

    public void setDescricao(java.lang.String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public Collection<? extends Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Bootcamp bootcamp = (Bootcamp) object;
        return java.util.Objects.equals(nome, bootcamp.nome) && java.util.Objects.equals(descricao, bootcamp.descricao) && java.util.Objects.equals(dataInicial, bootcamp.dataInicial) && java.util.Objects.equals(dataFinal, bootcamp.dataFinal) && java.util.Objects.equals(devsInscritos, bootcamp.devsInscritos) && java.util.Objects.equals(conteudos, bootcamp.conteudos);
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), nome, descricao, dataInicial, dataFinal, devsInscritos, conteudos);
    }

    public void setNome(String bootcampJavaDeveloper) {
    }
}
