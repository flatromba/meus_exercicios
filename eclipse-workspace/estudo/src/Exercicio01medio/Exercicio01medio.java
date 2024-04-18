package Exercicio01medio;

public class Exercicio01medio {
	
	public void retornaParImpar() {
		for (int i=0;i<=100;i++) {
			if (i%2==0) {
				System.out.println("O número "+i+" é par");
			}
			if (i%2!=0) {
				System.out.println("o número "+i+" é impar");
			}
		}
	}
}