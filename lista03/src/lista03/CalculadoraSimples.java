package lista03;

import java.util.Scanner;

public class CalculadoraSimples {

	public static void main(String[] args) {
		float numero1, numero2;
		int codigoOperacao;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o 1º número: ");
		numero1 = leia.nextFloat();
		System.out.println("Digite o 2º número: ");
		numero2 = leia.nextFloat();
		System.out.println("Operação: ");
		codigoOperacao = leia.nextInt();
		
		switch(codigoOperacao) {
			case 1:
				System.out.printf("%.2f + %.2f = %.2f%n", numero1, numero2, numero1 + numero2);
				break;
			case 2:
				System.out.printf("%.2f - %.2f = %.2f%n", numero1, numero2, numero1 - numero2);
				break;
			case 3:
				System.out.printf("%.2f * %.2f = %.2f%n", numero1, numero2, numero1 * numero2);
				break;
			case 4:
				System.out.printf("%.2f / %.2f = %.2f%n", numero1, numero2, numero1 / numero2);
				break;
			default:
				System.out.println("Operação inválida! ");
		}
		
		
		leia.close();
		

	}

}
