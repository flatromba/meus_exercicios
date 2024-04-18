package Exercicio04extra;

public class Exercicio04extra {
	
	public float retornaValorTotal (float ipi, float valorPeca1, float valorPeca2, int numeroPecas1, int numeroPecas2) {
		float ipiP=((ipi/100)+1);
		float valorTotal=((valorPeca1*numeroPecas1)+(valorPeca2*numeroPecas2))*ipiP;
		return valorTotal;
	}
}