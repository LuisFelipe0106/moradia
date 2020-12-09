package projetomoradia;

public class Funcionario extends Pessoa {

  // Atributos de instância
  private String cargo;
  private int salario;

  // Construtor
  public Funcionario(String cargo, int salario) {
  this.cargo = cargo;
  this.salario = salario;
  }

  public String getcargo() {
  return cargo;
  }

  public void setcargo(String cargo) {
  this.cargo = cargo;
  }

  public int getSalario() {
  return salario;
  }

  public void setSalario(int salario) {
  this.salario = salario;
  }

  @Override
  public String toString (){
  return super.toString()+"\nCargo: "+this.getcargo()+ "\nSalario: "+this.getSalario();
  }
}