package lista04;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero1, numero2;
		
		
		System.out.println("Digite o primeiro número do intervalo: ");
		numero1 = leia.nextInt();
		
		System.out.println("Digite o segundo número do intervalo: ");
		numero2 = leia.nextInt();
		
		if(numero1 < numero2) {
			System.out.printf("No Intervalo entre %d e %d: %n", numero1, numero2);
			for(int contador = numero1; contador <= numero2; contador++) {
				if(contador % 3 == 0 && contador % 5 == 0 && contador != 0) {
					System.out.printf("%d é múltiplo de 3 e 5%n", contador);
				}
			}
		}else {
			System.out.println("Intervalo inválido! ");
		}
		leia.close();

	}

}
