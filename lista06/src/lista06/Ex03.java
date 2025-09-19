package lista06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex03 {

	public static void main(String[] args) {
		Set<Integer> numeros = new HashSet<Integer>();
		Scanner leia = new Scanner(System.in);
		
		for(int contador = 0; contador < 10; contador++) {
			System.out.println("Digite valores inteiros não repetidos: ");
			numeros.add(leia.nextInt());
		}
		
		System.out.println("Listar dados do Set: \n");
		Iterator<Integer> iterator = numeros.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		leia.close();
	}

}
