package vetores;

import java.util.Scanner;

public class ExemploMatriz {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numeros[][] = {
				{1, 2, 3}, 
				{4, 5, 6}, 
				{7, 8, 9}
		};
		float numerosReais[][] = new float[3][2];
		
		System.out.println("Output - Matriz Numeros");
		
		// Percorre linhas
		for(int linha = 0; linha < numeros.length; linha++) {
			// Percorre colunas
			for(int coluna = 0; coluna < numeros.length; coluna++) {
				System.out.printf("Numeros[%d][%d] = %d%n", linha, coluna, numeros[linha][coluna]);
			}
		}
		
		System.out.println("Input - Matriz Numeros Reais");
		
		for(int linha = 0; linha < numerosReais.length; linha++) {
			for(int coluna = 0; coluna < numerosReais[linha].length; coluna++) {
				System.out.println("Digite um número: ");
				numerosReais[linha][coluna] = leia.nextFloat();
			}
		}
		
		System.out.println("Output - Matriz Numeros Reais");
		
		for(int linha = 0; linha < numerosReais.length; linha++) {
			for(int coluna = 0; coluna < numerosReais[linha].length; coluna++) {
				System.out.printf("Numeros[%d][%d] = %.1f%n", linha, coluna, numerosReais[linha][coluna]);
			}
		}
		
		leia.close();

	}

}
