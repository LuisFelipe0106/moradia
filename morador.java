package projetomoradia;

public class Morador extends Pessoa {

  // Atributos de instãncia
  private int contrato;

  // Construtor
  public Morador(String contrato, String nome, int nasc, int cpf) {
  super(nome, nasc, cpf);
  this.contrato = contrato;

  // Métodos GET e SET
  public String getcontrato() {
  return contrato;
  }

  public void setcontrato(String contrato) {
  this.contrato = contrato;
  }

  @Override
  public String toString (){
  return super.toString()+
  "\nNumero de contrato: " + this.getcontrato()
  }
}