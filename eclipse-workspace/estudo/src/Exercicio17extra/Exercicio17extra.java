package Exercicio17extra;

public class Exercicio17extra {
	
	public void retornaNumeros0a100(int numero[]) {
		System.out.println("Números entre 0 e 100: ");
		for (int i=0;i<20;i++) {
			if (numero[i]>=0 && numero[i]<=100) {
				System.out.println(numero[i]);
			}
		}
	}
}