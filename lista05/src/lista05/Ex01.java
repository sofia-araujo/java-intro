package lista05;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		int numeros[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		Scanner leia = new Scanner(System.in);
		int numeroAchar, indexNovo = -1;
		
		
		System.out.println("Digite o número que você deseja encontrar: ");
		numeroAchar = leia.nextInt();
		
		for(int index = 0; index < numeros.length; index++) {
			if(numeroAchar == numeros[index]) {
				indexNovo = index;
			}
		}
		
		if(indexNovo >= 0) {
			System.out.printf("O número %d está localizado na posição: %d", numeroAchar, indexNovo);
		}else {
			System.out.printf("O número %d não foi encontrado!", numeroAchar);
		}
		
	
		leia.close();
	}
}
