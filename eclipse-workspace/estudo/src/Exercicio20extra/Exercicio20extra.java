package Exercicio20extra;

public class Exercicio20extra {
	
	public void retornaDivisivel (int numero) {
		if (numero%2==0) {
			System.out.println("O "+numero+" é divisível por 2");
		}
		if (numero%5==0) {
			System.out.println("O "+numero+" é divisível por 5");
		}
		if (numero%10==0) {
			System.out.println("O "+numero+" é divisível por 10");
		}
		if (numero%2!=0 && numero%5!=0 && numero%10!=0) {
			System.out.println("O "+numero+" não é divisível por nenhum deles");
		}
	}
}