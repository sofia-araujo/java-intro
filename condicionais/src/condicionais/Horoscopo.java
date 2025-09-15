package condicionais;

import java.util.Scanner;

public class Horoscopo {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int signo;
		
		System.out.println("=================================");
		System.out.println("         Horóscopo do dia        ");
		System.out.println("=================================");
		System.out.println("                                 ");
		System.out.println("    1- Capricórnio               ");
		System.out.println("    2- Aquário                   ");
		System.out.println("    3- Peixes                    ");
		System.out.println("    4- Áries                     ");
		System.out.println("    5- Touro                     ");
		System.out.println("    6- Gêmeos                    ");
		System.out.println("    7- Câncer                    ");
		System.out.println("    8- Leão                      ");
		System.out.println("    9- Virgem                    ");
		System.out.println("    10- Libra                    ");
		System.out.println("    11- Escorpião                ");
		System.out.println("    12- Sagitátirio              ");
		System.out.println("                                 ");
		System.out.println("---------------------------------");
		System.out.println("    Digite a opção desejada:     ");
		
		signo = leia.nextInt();
		
		switch(signo) {
			case 1: 
				System.out.println("♑ Capricórnio: Responsabilidades podem pesar, mas sua disciplina te guiará.");
				break;
			case 2:
				System.out.println("♒ Aquário: Momento de refletir sobre suas amizades e conexões sociais.");
				break;
			case 3:
				System.out.println("♓ Peixes: Sensibilidade em alta. Use-a para se conectar com os outros e consigo mesmo.");
				break;
			case 4:
				System.out.println("♈ Áries: Mantenha o foco nas suas prioridades. Evite agir por impulso hoje.");
				break;
			case 5:
				System.out.println("♉ Touro: Um bom dia para cuidar das finanças e evitar gastos desnecessários.");
				break;
			case 6:
				System.out.println("♊ Gêmeos: Comunicação está em alta. Aproveite para resolver mal-entendidos.");
				break;
			case 7:
				System.out.println("♋ Câncer: Conecte-se com sua intuição e cuide de você mesmo com carinho.");
				break;
			case 8:
				System.out.println("♌ Leão: Oportunidades de destaque no trabalho podem surgir. Mostre seu valor.");
				break;
			case 9:
				System.out.println("♍ Virgem: Organize seus planos e mantenha-se firme nas suas metas.");
				break;
			case 10:
				System.out.println("♎ Libra: Relacionamentos pedem equilíbrio. Evite decisões precipitadas.");
				break;
			case 11:
				System.out.println("♏ Escorpião: Intensidade emocional pode dominar o dia. Respire antes de reagir.");
				break;
			case 12:
				System.out.println("♐ Sagitário: Novas ideias podem surgir. Mantenha a mente aberta para aprender.");
				break;
			default:
				System.out.println("Opção inválida! ");
				
			leia.close();
		}
	}

}
