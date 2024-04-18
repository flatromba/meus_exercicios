package Exercicio19extra;

public class Exercicio19extra {
	
	public void retornaSoma(int[] numero) {		
		int soma=0;				
			for (int i=0;i<1000;i++) {
				while (numero[i]>=0) {
				soma=soma+numero[i];
			}
			System.out.println("Número inválido\nA soma total é: "+soma);
		}
	}
}

