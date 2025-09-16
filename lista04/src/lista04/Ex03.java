package lista04;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade = 0, totalm21 = 0, totalM50 = 0;
		while(idade >= 0) {
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
			
			if(idade < 21 && idade > 0) {
				totalm21++;
			}else if(idade > 50) {
				totalM50++;
			}
		}
		System.out.printf("Total de pessoas menores de 21 anos: %d%n", totalm21);
		System.out.printf("Total de pessoas maiores de 50 anos: %d%n", totalM50);
		leia.close();

	}

}
