package exercicio23;

public class exercicio23 {
	
	public void calculaDiferenca (int numero1, int numero2) {
		
		if (numero1>numero2) {
			int diferenca=numero1-numero2;
			System.out.println("A diferença é: "+diferenca);
		}
		if (numero2>numero1) {
			int diferenca=numero2-numero1;
			System.out.println("A diferença é: "+diferenca);
		}
		if (numero1==numero2) {
			System.out.println("Os números são iguais");
		}
	}
}