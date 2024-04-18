package Exercicio07medio;
import java.util.Scanner;
public class Execucao {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int meses=12;
		Exercicio07medio exercicio07medio=new Exercicio07medio();
		String vetorMeses[]=new String[meses];		
		for (int i=0;i<meses;i++) {
			System.out.println("Digite o mês");
			vetorMeses[i]=input.nextLine();
		}
		exercicio07medio.retornaMeses(vetorMeses);
	}
}