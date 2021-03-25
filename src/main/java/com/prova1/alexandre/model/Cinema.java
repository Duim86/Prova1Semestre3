package com.prova1.alexandre.model;

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

  public Cinema(Long idCinema, String nome, String rua, Long numero,
                String bairro, String cidade,
                String estado) {
    this.idCinema = idCinema;
    this.nome = nome;
    this.rua = rua;
    this.numero = numero;
    this.bairro = bairro;
    this.cidade = cidade;
    this.estado = estado;
  }

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
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Cinema cinema = (Cinema) o;
    return idCinema.equals(cinema.idCinema) && nome.equals(cinema.nome) && rua.equals(cinema.rua) && numero.equals(cinema.numero) && complemento.equals(cinema.complemento) && bairro.equals(cinema.bairro) && cidade.equals(cinema.cidade) && estado.equals(cinema.estado);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idCinema, nome, rua, numero, complemento, bairro, cidade, estado);
  }
}
