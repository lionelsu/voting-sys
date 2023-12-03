package com.betrybe.sistemadevotacao;

/**
 * Classe concreta que representa uma pessoa eleitora.
 */
public class PessoaEleitora extends Pessoa {
  private String cpf;

  public PessoaEleitora(String nome, String cpf) {
    setNome(nome);
    this.cpf = cpf;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
}
