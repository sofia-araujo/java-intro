package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		Deque<String> pilha = new ArrayDeque<String>();
	
		pilha.push("Duna");
		pilha.push("Pai rico pai pobre");
		pilha.push("Maus");
		pilha.push("Crime e castigo");
		pilha.push("Quarto de Despejo");
		
		System.out.println(pilha);
		
		pilha.pop();
		
		System.out.println(pilha);
		
		System.out.println("O livro guia do mochileiro das galáxias está na pilha? " + pilha.contains("mochileiro das galáxias"));
		

	}

}
