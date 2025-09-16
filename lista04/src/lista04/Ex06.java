package lista04;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero = 0, totalNumeros = 0, totalMultiplos = 0;
		double media;
		
		do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			
			if(numero % 3 == 0 && numero != 0) {
				totalMultiplos++;
				totalNumeros += numero;
			}
		}while(numero != 0);
		
		media = (double) totalNumeros / totalMultiplos;
		if(totalMultiplos > 0) {
			System.out.printf("A média de todos os números múltiplos de 3 é: %.1f", media);
		}else {
			System.out.printf("Nenhum número múltiplo de 3 foi digitado ");
		}
		
		leia.close();
	}

}
