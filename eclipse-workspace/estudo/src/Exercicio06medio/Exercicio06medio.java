package Exercicio06medio;

public class Exercicio06medio {
	
	public int retornaFatorial(int numero) {
		int fatorial=numero;
		while (fatorial>1) {
			numero=numero*(fatorial-1);
			fatorial--;
		}
		return numero;
	}
}