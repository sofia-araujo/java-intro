package lista01;

import java.util.Scanner;

public class diferencaProduto {

	public static void main(String[] args) {
		float n1, n2, n3, n4, diferenca;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Número1: ");
		n1 = leia.nextFloat();
		System.out.println("Número2: ");
		n2 = leia.nextFloat();
		System.out.println("Número3: ");
		n3 = leia.nextFloat();
		System.out.println("Número4: ");
		n4 = leia.nextFloat();
		
		diferenca = (n1 * n2) - (n3 * n4);
		
		System.out.printf("Diferença: %.1f", diferenca);
		
		leia.close();

	}

}
