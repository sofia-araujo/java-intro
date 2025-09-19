package lista07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		Scanner leia = new Scanner(System.in);
		int opcao;
		String cliente;
		
		do {
			System.out.println("**************************************************\n");
			System.out.println("            1 - Adicionar Cliente na Fila           ");
			System.out.println("            2 - Listar todos os Clientes            ");
			System.out.println("            3 - Retirar Cliente da Fila             ");
			System.out.println("            0 - Sair                                ");
			System.out.println("\n**************************************************");
			System.out.println("Entre com a opção desejada:                        \n");
			opcao = leia.nextInt();
			
			switch(opcao) {
			case 1: 
				System.out.println("Digite o nome: ");
				leia.skip("\\R?");
				cliente = leia.nextLine();
				fila.add(cliente);
				System.out.println("Fila: \n");
				for(var pessoa : fila) {
					System.out.println(pessoa);
				}
				System.out.println("\nCliente adicionado! ");
				break;
			case 2: 
				if(!fila.isEmpty()) {
					System.out.println("Lista de Clientes na Fila: \n");
				for(var pessoa : fila) {
					System.out.println(pessoa);
				}}else {
					System.out.println("A Fila está vazia! ");
				}
				break;
			case 3:
				if(!fila.isEmpty()) {
				fila.remove();
				System.out.println("Fila: \n");
				for(var pessoa : fila) {
					System.out.println(pessoa);
				}
				System.out.println("O Cliente foi Chamado! ");
				}else {
					System.out.println("A Fila está vazia! ");
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
