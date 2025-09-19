package lista07;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.Scanner;

public class Pilha {

	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<String>();
		Scanner leia = new Scanner(System.in);
		int opcao;
		String nomeLivro;
		
		do {
			System.out.println("**************************************************\n");
			System.out.println("            1 - Adicionar Livro na Pilha            ");
			System.out.println("            2 - Listar todos os Livros              ");
			System.out.println("            3 - Retirar Livro da Pilha              ");
			System.out.println("            0 - Sair                                ");
			System.out.println("\n**************************************************");
			System.out.println("Entre com a opção desejada:                        \n");
			opcao = leia.nextInt();
			
			switch(opcao) {
			case 1: 
				System.out.println("Digite o nome: ");
				leia.skip("\\R?");
				nomeLivro = leia.nextLine();
				livros.push(nomeLivro);
				System.out.println("Pilha: \n");
				for(var livro : livros) {
					System.out.println(livro);
				}
				System.out.println("\nLivro adicionado! ");
				break;
			case 2: 
				if(!livros.isEmpty()) {
				System.out.println("Lista de Livros na Pilha: \n");
				for(var livro : livros) {
					System.out.println(livro);
				}}else {
					System.out.println("A Pilha está vazia! ");
				}
				break;
			case 3:
				if(!livros.isEmpty()) {
				livros.pop();
				System.out.println("Pilha: \n");
				for(var livro : livros) {
					System.out.println(livro);
				}
				System.out.println("Um Livro foi retirado da pilha! ");
				System.out.println(livros);
				}else {
					System.out.println("A Pilha está vazia! ");
				}
				break;
			case 0:
				System.out.println("Programa Finalizado! ");
				break;
			default: 
				System.out.println("Opção inválida! ");
				}
		}while(opcao != 0);
		
		
		leia.close();

	}

}
