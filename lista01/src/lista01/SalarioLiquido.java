package lista01;

import java.util.Scanner;

public class SalarioLiquido {

	public static void main(String[] args) {
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o Salário Bruto: ");
		salarioBruto = leia.nextFloat();
		System.out.println("Digite o Adicional Noturno: ");
		adicionalNoturno = leia.nextFloat();
		System.out.println("Digite as Horas Extras: ");
		horasExtras = leia.nextFloat();
		System.out.println("Digite os descontos: ");
		descontos = leia.nextFloat();
			
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.printf("Salário Líquido: %.2f", salarioLiquido);
		leia.close();

	}

}
