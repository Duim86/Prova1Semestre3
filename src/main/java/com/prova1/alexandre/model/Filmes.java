package com.prova1.alexandre.model;

public class Filmes {
  private Long idFilme;
  private String nome;
  private String descricao;
  private String diretor;
  private String atores;
  private String genero;

  public Filmes(Long idFilme, String nome, String descricao, String diretor, String atores, String genero) {
    this.idFilme = idFilme;
    this.nome = nome;
    this.descricao = descricao;
    this.diretor = diretor;
    this.atores = atores;
    this.genero = genero;
  }

  public Long getIdFilme() {
    return idFilme;
  }

  public void setIdFilme(Long idFilme) {
    this.idFilme = idFilme;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public String getDiretor() {
    return diretor;
  }

  public void setDiretor(String diretor) {
    this.diretor = diretor;
  }

  public String getAtores() {
    return atores;
  }

  public void setAtores(String atores) {
    this.atores = atores;
  }

  public String getGenero() {
    return genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  @Override
  public String toString() {
    return "Filmes{" +
            "idFilme=" + idFilme +
            ", nome='" + nome + '\'' +
            ", descricao='" + descricao + '\'' +
            ", diretor='" + diretor + '\'' +
            ", atores='" + atores + '\'' +
            ", genero='" + genero + '\'' +
            '}';
  }
}
