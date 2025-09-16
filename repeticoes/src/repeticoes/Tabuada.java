package repeticoes;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite o número da tabuada pretendida: ");
		numero = leia.nextInt();
		
		for(int contador = 1; contador <= 10; contador++) {
			System.out.printf("%d X %d = %d%n", numero, contador, numero * contador);
		}
		
		leia.close();

	}

}
