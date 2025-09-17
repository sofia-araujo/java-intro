package lista05;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		int numeros[][] = new int[3][3];
		String diagonalPrincipal = "";
		String diagonalSecundaria = "";
		int somaPrincipal = 0, somaSecundaria = 0;
		Scanner leia = new Scanner(System.in);
		
		// Input
		for(int linha = 0; linha < numeros.length; linha++) {
			for(int coluna = 0; coluna < numeros.length; coluna++) {
				System.out.println("Digite um número: ");
				numeros[linha][coluna] = leia.nextInt();
			}
		}
		
		// Lógica
		for(int linha = 0; linha < numeros.length; linha++) {
			for(int coluna = 0; coluna < numeros.length; coluna++) {
				if(linha == coluna) {
					diagonalPrincipal += numeros[linha][coluna] + " ";
					somaPrincipal += numeros[linha][coluna];
				}
				if(linha + coluna == numeros.length - 1) { 
					diagonalSecundaria += numeros[linha][coluna] + " ";
					somaSecundaria += numeros[linha][coluna]; 
				}
					 
			}
		}
		
		System.out.printf("Elementos da Diagonal Principal: %s%n", diagonalPrincipal);
		System.out.printf("Elementos da Diagonal Secundária: %s%n", diagonalSecundaria);
		System.out.printf("Soma dos Elementos da Diagonal Principal: %d%n", somaPrincipal);
		System.out.printf("Soma dos Elementos da Diagonal Secundária: %d%n", somaSecundaria);
		
		leia.close();
	}

}
