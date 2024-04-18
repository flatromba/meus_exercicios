package Exercicio15extra;

public class Exercicio15extra {
	
	public void retornaNomeEIdade(String nome[], int idade[]) {
		System.out.println("A pessoa mais nova é: ");		
		int menorIdade=0;
		for (int i=0;i<10;i++) {
		if (idade[i]<menorIdade||i==0) {
			menorIdade=idade[i];
			System.out.println(nome[i]+" com "+idade[i]+" ano(s)");
		}
		}
	}
}