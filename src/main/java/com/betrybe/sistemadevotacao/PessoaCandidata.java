package com.betrybe.sistemadevotacao;

/**
 * Classe concreta que representa uma pessoa candidata.
 */
public class PessoaCandidata extends Pessoa {
  protected int numero;
  protected int votos;

  /**
   * Construtor da classe PessoaCandidata.
   *
   * @param nome   Nome do candidato.
   * @param numero Número indicador para o voto.
   */
  public PessoaCandidata(String nome, int numero) {
    setNome(nome);
    this.numero = numero;
    this.votos = 0;
  }

  public int getNumero() {
    return numero;
  }

  public int getVotos() {
    return votos;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public void receberVoto() {
    this.votos += 1;
  }
}
