package exercicio29;

public class exercicio29 {
	
	public void calculaOperacao(int numero1, int numero2, int numero3) {
		if (numero1>0 && numero2>0 && numero3>0) {
			if (numero1>numero2 && numero2>numero3) {
				int multiplicacao=numero3*numero1;
				float divisao=numero1/numero3;
				System.out.println("Multiplicação: "+multiplicacao+"\nDivisão: "+divisao);
			}
			if (numero1>numero2 && numero3>numero2) {
				int multiplicacao=numero2*numero1;
				float divisao=numero1/numero2;
				System.out.println("Multiplicação: "+multiplicacao+"\nDivisão: "+divisao);
			}
			if (numero2>numero1 && numero1>numero3) {
				int multiplicacao=numero3*numero2;
				float divisao=numero2/numero3;
				System.out.println("Multiplicação: "+multiplicacao+"\nDivisão: "+divisao);
			}
			if (numero2>numero3 && numero3>numero1) {
				int multiplicacao=numero1*numero2;
				float divisao=numero2/numero1;
				System.out.println("Multiplicação: "+multiplicacao+"\nDivisão: "+divisao);
			}
			if (numero3>numero2 && numero2>numero1) {
				int multiplicacao=numero1*numero3;
				float divisao=numero3/numero1;
				System.out.println("Multiplicação: "+multiplicacao+"\nDivisão: "+divisao);
			}
			if (numero3>numero1 && numero1>numero2) {
				int multiplicacao=numero2*numero3;
				float divisao=numero3/numero2;
				System.out.println("Multiplicação: "+multiplicacao+"\nDivisão: "+divisao);
			}
		}
	
	else {
		System.out.println("número(s) inválido(s)");
	}
	}
}