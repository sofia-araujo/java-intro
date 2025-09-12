package lista01;

import java.util.Scanner;

public class SalarioAbono {

	public static void main(String[] args) {
		float salario, abono, novoSalario;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o Salário: ");
		salario = leia.nextFloat();
		System.out.println("Digite o Abono: ");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
				
		System.out.printf("Novo Salário: %.2f", novoSalario);
		
		leia.close();

	}

}
