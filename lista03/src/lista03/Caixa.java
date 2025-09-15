package lista03;

import java.util.Scanner;

public class Caixa {

	public static void main(String[] args) {
		int codigo, quantidade;
		float total;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Código do Produto: ");
		codigo = leia.nextInt();
		System.out.println("Quantidade: ");
		quantidade = leia.nextInt();
		
		switch(codigo) {
			case 1:
				total = quantidade * 10.00f;
				System.out.printf("Produto: Cachorro Quente %nTotal: R$ %.2f", total);
				break;
			case 2:
				total = quantidade * 15.00f;
				System.out.printf("Produto: X-Salada %nTotal: R$ %.2f", total);
				break;
			case 3:
				total = quantidade * 18.00f;
				System.out.printf("Produto: X-Bacon %nTotal: R$ %.2f", total);
				break;
			case 4:
				total = quantidade * 12.00f;
				System.out.printf("Produto: Bauru %nTotal: R$ %.2f", total);
				break;
			case 5:
				total = quantidade * 8.00f;
				System.out.printf("Produto: Refrigerante %nTotal: R$ %.2f", total);
				break;
			case 6:
				total = quantidade * 13.00f;
				System.out.printf("Produto: Suco de laranja %nTotal: R$ %.2f", total);
				break;
			default:
				
				
		}
		
		
		leia.close();
		
		

	}

}
