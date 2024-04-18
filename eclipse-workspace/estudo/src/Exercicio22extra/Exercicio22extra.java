package Exercicio22extra;

public class Exercicio22extra {
	
	public void retornaValorDeCredito(float saldoMedio){
		if (saldoMedio>=0 && saldoMedio<=500) {
			double credito=0;
			System.out.println("Saldo médio: "+saldoMedio+"\nValor de crédito: "+credito);
		}
		if (saldoMedio>=501 && saldoMedio<=1000) {
			double credito=saldoMedio*0.30;
			System.out.println("Saldo médio: "+saldoMedio+"\nValor de crédito: "+credito);	
		}
		if (saldoMedio>=1001 && saldoMedio<=3000) {
			double credito=saldoMedio*0.40;
			System.out.println("Saldo médio: "+saldoMedio+"\nValor de crédito: "+credito);
		}
		if (saldoMedio>=3001) {
			double credito=saldoMedio*0.50;
			System.out.println("Saldo médio: "+saldoMedio+"\nValor de crédito: "+credito);
		}
	}
}