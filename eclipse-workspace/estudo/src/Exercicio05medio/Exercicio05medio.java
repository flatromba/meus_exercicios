package Exercicio05medio;

public class Exercicio05medio {
	
	public int retornaMenorNumero(int numero) {
		int menorNumero=0;
		for (int i=1;i<=5;i++) {
			if (numero<menorNumero || i==1) {
				menorNumero=numero;
			}			
		}
		return menorNumero;
	}
}