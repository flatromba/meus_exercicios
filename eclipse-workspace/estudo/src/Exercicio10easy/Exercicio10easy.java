package Exercicio10easy;

public class Exercicio10easy {
	
	public double calculaValorJuros(float valorInvestido) {
		double taxa=0.05;
		int duracao=10;
		double valorJuros=valorInvestido*(taxa*duracao);
		return valorJuros;
	}
	
	public double calculaValorTotal(float valorInvestido) {
		double taxa=0.05;
		int duracao=10;
		double valorJuros=valorInvestido*(taxa*duracao);
		double valorTotal=valorInvestido+valorJuros;
		return valorTotal;
	}
}