package lista03;

import java.util.Scanner;

public class ContaBancaria {

	public static void main(String[] args) {
		int codigoOperacao;
		float saldo = 1000.00f;
		float valor;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Operação: ");
		codigoOperacao = leia.nextInt();
		
		switch(codigoOperacao) {
			case 1:
				System.out.printf("Operação - Saldo%nSaldo: R$ %.2f", saldo);
				break;
			case 2:
				System.out.println("Valor: ");
				valor = leia.nextFloat();
				if(valor <= saldo) {
					saldo -= valor;
					System.out.printf("Operação - Saque%nNovo Saldo: R$ %.2f", saldo);
				}else {
					System.out.println("Saldo Insuficiente! ");
				}
				break;
			case 3:
				System.out.println("Valor: ");
				valor = leia.nextFloat();
				saldo += valor;
				System.out.printf("Operação - Depósito%nNovo Saldo: R$ %.2f", saldo);
				break;
		}
		leia.close();

	}

}
