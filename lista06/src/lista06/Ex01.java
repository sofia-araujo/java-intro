package lista06;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		ArrayList<String> cores = new ArrayList<String>();
		Scanner leia = new Scanner(System.in);
		
		for(int contador = 0; contador < 5; contador++) {
			System.out.println("Digite as cores: ");
			cores.add(leia.nextLine());
		}
		
		System.out.println("Listar todas as cores: \n");
		for(var cor : cores) {
			System.out.println(cor);
		}
		
		System.out.println("\nOrdenar as cores: \n");
		cores.sort(null);
		for(var cor : cores) {
			System.out.println(cor);
		}
		
		leia.close();
	}

}
