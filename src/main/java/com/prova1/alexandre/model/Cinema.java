package com.prova1.alexandre.model;

import java.util.Arrays;
import java.util.Objects;

public class Cinema {

  private Long idCinema;

  private String nome;
  private String rua;
  private Long numero;
  private String complemento;
  private String bairro;
  private String cidade;
  private String estado;
  private Filmes filme[];

  // Constructor

  public Cinema(Long idCinema, String nome, String rua, Long numero, String bairro, String cidade, String estado, Filmes[] filme) {
    this.idCinema = idCinema;
    this.nome = nome;
    this.rua = rua;
    this.numero = numero;
    this.bairro = bairro;
    this.cidade = cidade;
    this.estado = estado;
    this.filme = filme;
  }

  public Cinema() {
  }

  // Métodos


  public Long getIdCinema() {
    return idCinema;
  }

  public void setIdCinema(Long idCinema) {
    this.idCinema = idCinema;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getRua() {
    return rua;
  }

  public void setRua(String rua) {
    this.rua = rua;
  }

  public Long getNumero() {
    return numero;
  }

  public void setNumero(Long numero) {
    this.numero = numero;
  }

  public String getComplemento() {
    return complemento;
  }

  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  public String getBairro() {
    return bairro;
  }

  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  public String getCidade() {
    return cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public Filmes[] getFilme() {
    return filme;
  }

  public void setFilme(Filmes[] filme) {
    this.filme = filme;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Cinema cinema = (Cinema) o;
    return idCinema.equals(cinema.idCinema) && nome.equals(cinema.nome) && rua.equals(cinema.rua) && numero.equals(cinema.numero) && complemento.equals(cinema.complemento) && bairro.equals(cinema.bairro) && cidade.equals(cinema.cidade) && estado.equals(cinema.estado) && Arrays.equals(filme, cinema.filme);
  }

  @Override
  public int hashCode() {
    int result = Objects.hash(idCinema, nome, rua, numero, complemento, bairro, cidade, estado);
    result = 31 * result + Arrays.hashCode(filme);
    return result;
  }

  @Override
  public String toString() {
    return "Cinema{" +
            "idCinema=" + idCinema +
            ", nome='" + nome + '\'' +
            ", rua='" + rua + '\'' +
            ", numero=" + numero +
            ", complemento='" + complemento + '\'' +
            ", bairro='" + bairro + '\'' +
            ", cidade='" + cidade + '\'' +
            ", estado='" + estado + '\'' +
            ", filme=" + Arrays.toString(filme) +
            '}';
  }
}