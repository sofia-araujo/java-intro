package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(256);
		numeros.add(20);
		
		System.out.println(numeros);
		
		System.out.println("Exibir o elemento na posição 1" + numeros.get(1));
		
		System.out.println("Exibir o indice do elemento 20: " + numeros.indexOf(20));
		
		numeros.set(numeros.indexOf(20), 2);
		
		System.out.println(numeros);
		
		for(int numero : numeros) {
			System.out.println(numero);
		}
		System.out.println("Tamanho da lista: "+ numeros.size());
		numeros.clear();
		System.out.println("A lista está vazia? "+ numeros.isEmpty());
		System.out.println("A lista possui o numero 9? "+ numeros.contains(9));
	}
}
