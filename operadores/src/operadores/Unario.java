package operadores;

public class Unario {

	public static void main(String[] args) {
		
	int preIncrementoOriginal = 8, preIncrementoResultado;
	int posIncrementoOriginal = 8, posIncrementoResultado;
	
	System.out.printf("Pre incremento = Valor Original %d%n",preIncrementoOriginal);
	preIncrementoResultado = ++preIncrementoOriginal;
	System.out.printf("Apos incrementar = resultado %d, valor atualizado %d%n", preIncrementoResultado, preIncrementoOriginal);
	
	System.out.printf("Pos incremento = Valor Original %d%n",posIncrementoOriginal);
	posIncrementoResultado = posIncrementoOriginal++;
	System.out.printf("Apos incrementar = resultado %d, valor atualizado %d%n", posIncrementoResultado, posIncrementoOriginal);
	}

}
