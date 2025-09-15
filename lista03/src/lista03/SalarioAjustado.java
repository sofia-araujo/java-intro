package lista03;

import java.util.Scanner;

public class SalarioAjustado {

	public static void main(String[] args) {
		String nome;
		int codigoCargo;
		float salario, novoSalario;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Nome do colaborador: ");
		nome = leia.nextLine();
		System.out.println("Cargo: ");
		codigoCargo = leia.nextInt();
		System.out.println("Salário: ");
		salario = leia.nextFloat();
		
		switch(codigoCargo) {
			case 1:
				novoSalario = salario + (salario * 0.10f);
				System.out.printf("Nome do colaborador: %s%n", nome);
				System.out.println("Cargo: Gerente");
				System.out.printf("Salário: R$ %.2f", novoSalario);
				break;
			case 2:
				novoSalario = salario + (salario * 0.07f);
				System.out.printf("Nome do colaborador: %s%n", nome);
				System.out.println("Cargo: Vendedor");
				System.out.printf("Salário: R$ %.2f", novoSalario);
				break;
			case 3:
				novoSalario = salario + (salario * 0.09f);
				System.out.printf("Nome do colaborador: %s%n", nome);
				System.out.println("Cargo: Supervisor");
				System.out.printf("Salário: R$ %.2f", novoSalario);
				break;
			case 4:
				novoSalario = salario + (salario * 0.06f);
				System.out.printf("Nome do colaborador: %s%n", nome);
				System.out.println("Cargo: Motorista");
				System.out.printf("Salário: R$ %.2f", novoSalario);
				break;
			case 5:
				novoSalario = salario + (salario * 0.05f);
				System.out.printf("Nome do colaborador: %s%n", nome);
				System.out.println("Cargo: Estoquista");
				System.out.printf("Salário: R$ %.2f", novoSalario);
				break;
			case 6:
				novoSalario = salario + (salario * 0.08f);
				System.out.printf("Nome do colaborador: %s%n", nome);
				System.out.println("Cargo: Técnico de TI");
				System.out.printf("Salário: R$ %.2f", novoSalario);
				break;
		}
		leia.close();

	}

}
