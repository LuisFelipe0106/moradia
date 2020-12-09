package projetomoradia;

import javax.swing.JOptionPane;

public class ProjetoMoradia {

  public static void main(String[] args) {
  
	int op = 0;
	do {
		op = Integer.parseInt(JOptionPane.showInputDialog("Digite a operação desejada:"+
		"\n1 - Cadastrar novo morador\n2 - Cadastrar novo funcionario\n3 - Cadastrar Quarto\n4 - Imprimir Quarto\n5 - Imprimir Funcionarios\n6") );
	switch ( op )
	{
	case 1:
		String nome = JOptionPane.showInputDialog("Nome completo: ");
		int nasc = Integer.parseInt(JOptionPane.showInputDialog("Data de nascimento: "));
		int cpf = JOptionPane.showInputDialog("CPF: ");
		int contrato = JOptionPane.showInputDialog("Numero do contrato: ");
		break;
	case 2:
		String nome = JOptionPane.showInputDialog("Nome completo: ");
		int nasc = Integer.parseInt(JOptionPane.showInputDialog("Data de nascimento: "));
		int cpf = JOptionPane.showInputDialog("CPF: ");
		String cargo = JOptionPane.showInputDialog("Cargo do funcionario: ");
		int salario = Integer.parseInt(JOptionPane.showInputDialog("Salario: "));
		break;
	case 3:
		int bloco = Integer.parseInt(JOptionPane.showInputDialog("Bloco: "));
		int andar = Integer.parseInt(JOptionPane.showInputDialog("Andar: "));
		int numero = JOptionPane.showInputDialog("Numero: ");
		break;
	case 4:
		if (quarto.contains(morador)) {
			System.out.println(morador)
			System.out.println(quarto)
		} else {
			System.out.println(quarto)
		}
	case 5:
		System.out.println(funcionario)
	case 0:
		JOptionPane.showMessageDialog(null, "Saindo do Sistema");
	}
  } while ( op!= 0 );
} 