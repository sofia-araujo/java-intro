package lista02;

import java.util.Scanner;

public class VerificaNumero {

	public static void main(String[] args) {
		int numero;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		
		if(numero % 2 == 0) {
			if(numero > 0) {
				System.out.printf("O Número %d é par e positivo!", numero);
			}else if(numero < 0) {
				System.out.printf("O Número %d é par e negativo!", numero);
			}
		}else if(numero % 2 != 0) {
			if(numero > 0) {
				System.out.printf("O Número %d é ímpar e positivo!", numero);
			}else if(numero < 0) {
				System.out.printf("O Número %d é ímpar e negativo!", numero);
			}
		}
		
		leia.close();

	}

}
