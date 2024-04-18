package Exercicio02medio;

public class Exercicio02medio {
	
	public double retornaInvestimento(double valorInvestido) {
		double valorTotal=valorInvestido;
		double taxaJuros=0.05;
		for (int i=0;i<10;i++) {
			valorTotal=(valorTotal*taxaJuros)+valorTotal;
		}
		return valorTotal;
	}
}