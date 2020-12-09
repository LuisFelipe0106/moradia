package projetomoradia;

public class Quarto {

  // Atributos
  public int bloco;
  public int andar;
  public int numero;
  

  // Construtor
  public Quarto(int bloco, int andar, int numero) {
  this.bloco = bloco;
  this.andar = andar;
  this.numero = numero;
  }

  // Métodos GET e SET
  public int getBloco() {
  return Bloco;
  }

  public void setBloco(int Bloco) {
  this.Bloco = Bloco;
  }

  public int getAndar() {
  return Andar;
  }

  public void setAndar(int Andar) {
  this.Andar = Andar;
  }
  
  public int getNumero() {
  return numero;
  }

  public void setNumero(int numero) {
  this.numero = numero;
  } 
  

  @Override
  public String toString (){
  return "Bloco: " + this.getBloco()+ " "+"\nNumero: "+this.numero.imprimir()+".\nAndar: " + this.getAndar();
  }
}