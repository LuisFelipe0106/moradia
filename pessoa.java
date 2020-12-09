package projetomoradia;

public class Pessoa {

  // Atributos
  private String nome;
  private int nasc;
  private int cpf;

  // Construtor
  public Pessoa(String nome, int nasc, int cpf) {
  this.nome = nome;
  this.nasc = nasc;
  this.cpf = cpf;
  }

  // Métodos GET e SET
  public String getNome() {
  return nome;
  }

  public void setNome(String nome) {
  this.nome = nome;
  }

  public String getCpf() {
  return cpf;
  }

  public void setCpf(int cpf) {
  this.cpf = cpf;
  }
  
  public String getNasc() {
  return nasc;
  }

  public void setNasc(int nasc) {
  this.nasc = nasc;
  }

  @Override
  public String toString (){
  return "Nome: " + this.getNome()+ " "+"\nData de Nascimento: "+this.nasc.imprimir()+".\nCPF: " + this.getcpf();
  }

}