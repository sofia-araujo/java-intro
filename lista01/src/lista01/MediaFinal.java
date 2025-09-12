package lista01;

import java.util.Scanner;

public class MediaFinal {

	public static void main(String[] args) {
		float nota1, nota2, nota3, nota4, mediaFinal;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Nota 1: ");
		nota1 = leia.nextFloat();
		System.out.println("Nota 2: ");
		nota2 = leia.nextFloat();
		System.out.println("Nota 3: ");
		nota3 = leia.nextFloat();
		System.out.println("Nota 4: ");
		nota4 = leia.nextFloat();
		
		mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
				
		System.out.printf("Média Final: %.1f", mediaFinal);
		
		leia.close();

	}

}
