package Exercicio10medio;

public class Execucao {
	
	public static void main(String[] args) {
		int elementos=10;
		int vetorFibonacci[]=new int[elementos];
		vetorFibonacci[0]=0;
		vetorFibonacci[1]=1;
		Exercicio10medio exercicio10medio=new Exercicio10medio();
		for (int i=2;i<elementos;i++) {
			vetorFibonacci[i]=vetorFibonacci[i-1]+vetorFibonacci[i-2];
		}
		System.out.println("Sequencia de Fibonacci até o "+elementos+"º elemento: ");
		exercicio10medio.retornaSequenciaFibonacci(vetorFibonacci);
	}
}