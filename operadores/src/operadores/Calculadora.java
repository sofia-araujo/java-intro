package operadores;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
	
	// Instanciar um objeto da classe Scanner (Entrada de dados)
	Scanner leia = new Scanner(System.in);
	
	// Definir as variaveis
	double numero1, numero2;
	
	// Entrada de dados
	System.out.println("Digite o primeiro número: ");
	numero1 = leia.nextDouble();
	System.out.println("Digite o segundo número: ");
	numero2 = leia.nextDouble();
		
	// Operação matemática e mostrar o resultado
	System.out.printf("%.2f + %.2f = %.2f"
					+ "\n%.2f - %.2f = %.2f"
					+ "\n%.2f / %.2f = %.2f"
					+ "\n%.2f * %.2f = %.2f"
					+ "\n%.2f ^ %.2f = %.2f"
					+ "\nRaiz quadradada de %.2f = %.2f",
					numero1, numero2, numero1 + numero2,
					numero1, numero2, numero1 - numero2,
					numero1, numero2, numero1 / numero2,
					numero1, numero2, numero1 * numero2,
					numero1, numero2, Math.pow(numero1, numero2),
					numero1, Math.sqrt(numero1));
	
	leia.close();
	}

}
