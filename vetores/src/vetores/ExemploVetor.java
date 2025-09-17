package vetores;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ExemploVetor {

	public static void main(String[] args) {
		String nomes[] = {"Cintia", "Stella", "Patrícia", "Rafaela", "Leticia", "Jamila"};
		Scanner leia = new Scanner(System.in);
		int numeros[] =  new int[5];
		
		System.out.println("Listagem - Vetor de nomes");
		
		Arrays.sort(nomes);
		Arrays.sort(nomes, Collections.reverseOrder());
		for(int indice = 0; indice < nomes.length; indice++) {
			System.out.printf("nomes[%d] = %s%n",indice, nomes[indice]);
		}
		for(int indice = 0; indice < numeros.length; indice++) {
			System.out.println("Digite um número: ");
			numeros[indice] = leia.nextInt();
		}
		System.out.println("\nListagem - Vetor de números");
		for(int indice = 0; indice < numeros.length; indice++) {
			System.out.printf("numeros[%d] = %d%n",indice, numeros[indice]);
		}
		
		leia.close();
	}

}
