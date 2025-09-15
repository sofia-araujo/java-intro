package lista02;

import java.util.Scanner;

public class SomaMaior {

	public static void main(String[] args) {
		int a, b, c;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o número A: ");
		a = leia.nextInt();
		System.out.println("Digite o número B: ");
		b = leia.nextInt();
		System.out.println("Digite o número C: ");
		c = leia.nextInt();
		
		if(a + b > c) {
			System.out.printf("%d + %d = %d > %d%n", a, b, a + b, c);
			System.out.println("A Soma de A + B é Maior do que C");
		}else if(a + b < c) {
			System.out.printf("%d + %d = %d < %d%n", a, b, a + b, c);
			System.out.println("A Soma de A + B é Menor do que C");
		}else if(a + b == c) {
			System.out.printf("%d + %d = %d = %d%n", a, b, a + b, c);
			System.out.println("A Soma de A + B é Igual a C");
		}
		
		leia.close();

	}

}
