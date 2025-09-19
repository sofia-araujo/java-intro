package colecoes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ColecaoSet {

	public static void main(String[] args) {
		Set<String> frutas = new HashSet<String>();
		
		frutas.add("Banana");
		frutas.add("Uva");
		frutas.add("Morango");
		frutas.add("Laranja");
		frutas.add("Banana");
		
		System.out.println(frutas);
		
		
		for(String fruta : frutas) {
			System.out.println(fruta.hashCode());
		}
		
		frutas.remove("Laranja");
		
		System.out.println(frutas);
		
		System.out.println("Contém a fruta Amora? "+ frutas.contains("Amora"));
		System.out.println("O set está vazio? "+ frutas.isEmpty());
		
		Iterator<String> itFrutas = frutas.iterator();
		
		
		while(itFrutas.hasNext()) {
			System.out.println(itFrutas.next());
		}
		
		ArrayList<String> frutasList = new ArrayList<String>();
		
		frutasList.addAll(frutas);
		
		System.out.println(frutasList);
		
		frutasList.sort(null);
		
		System.out.println(frutasList);
		
		frutasList.sort(Comparator.reverseOrder());
		
		System.out.println(frutasList);
	}

}
