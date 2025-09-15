package lista02;

import java.util.Scanner;

public class DoacaoSangue {

	public static void main(String[] args) {
		String nome;
		int idade;
		boolean primeiraDoacao;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o Nome do doador: ");
		nome = leia.nextLine();
		System.out.println("Digite a Idade do doador: ");
		idade = leia.nextInt();
		System.out.println("Primeira doação de sangue? ");
		primeiraDoacao = leia.nextBoolean();
		
		if(idade >= 18 && idade <= 69) {
			if((idade >= 60 && idade <= 69) && !primeiraDoacao) {
				System.out.printf("%s está apto para doar sangue!", nome);
			}else if(!(idade >= 60 && idade <= 69)) {
				System.out.printf("%s está apto para doar sangue!", nome);
			}else {
				System.out.printf("%s não está apto para doar sangue!", nome);
			}
		}else {
			System.out.printf("%s não está apto para doar sangue!", nome);
		}
		
		leia.close();

	}

}
