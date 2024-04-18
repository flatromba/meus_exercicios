package Exercicio18extra;

public class Exercicio18extra {
	
	public void retornaNumeros0a100(int numero[]) {
		System.out.println("Números entre 0 e 100: ");
		for (int i=0;i<20;i++) {
			if (numero[i]>=0 && numero[i]<=100) {
				System.out.println(numero[i]);
			}
		}
	}
	
	public void retornaNumeros101a200(int numero[]) {
		System.out.println("Números entre 101 e 200: ");
		for (int i=0;i<20;i++) {
			if (numero[i]>=101 && numero[i]<=200) {
				System.out.println(numero[i]);
			}
		}
	}
	
	public void retornaNumerosMaior200(int numero[]) {
		System.out.println("Números maiores que 200: ");
		for (int i=0;i<20;i++) {
			if (numero[i]>200) {
				System.out.println(numero[i]);
			}
		}
	}
}