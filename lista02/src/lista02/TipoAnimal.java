package lista02;

import java.util.Scanner;

public class TipoAnimal {

	public static void main(String[] args) {
		String tipo01, tipo02, tipo03;
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Digite o 1º tipo: ");
		tipo01 = leia.nextLine();
		
		System.out.println("Digite o 2º tipo: ");
		leia.skip("\\R?");
		tipo02 = leia.nextLine();
		
		System.out.println("Digite o 3º tipo: ");
		leia.skip("\\R?");
		tipo03 = leia.nextLine();
		
		
		if(tipo01.equalsIgnoreCase("Vertebrado")) {
			if(tipo02.equalsIgnoreCase("Ave")) {
				if(tipo03.equalsIgnoreCase("Carnivoro")) {
					System.out.println("Águia");
				}else if(tipo03.equalsIgnoreCase("Onivoro")) {
					System.out.println("Pomba");
				}
			}else if(tipo02.equalsIgnoreCase("Mamifero")) {
				if(tipo03.equalsIgnoreCase("Herbivoro")) {
					System.out.println("Vaca");
				}else if(tipo03.equalsIgnoreCase("Onivoro")) {
					System.out.println("Homem");
				}
			}
		}else if(tipo01.equalsIgnoreCase("Invertebrado")) {
			if(tipo02.equalsIgnoreCase("Inseto")) {
				if(tipo03.equalsIgnoreCase("Hematofago")) {
					System.out.println("Pulga");
				}else if(tipo03.equalsIgnoreCase("Herbivoro")) {
					System.out.println("Largata");
				}
			}else if(tipo02.equalsIgnoreCase("Anelideo")) {
				if(tipo03.equalsIgnoreCase("Hematofago")) {
					System.out.println("Sanguessuga");
				}else if(tipo03.equalsIgnoreCase("Onivoro")) {
					System.out.println("Minhoca");
				}
			}
		}else {
			System.out.println("Tipos de animais inválido! ");
		}
		
		
		leia.close();

	}

}
