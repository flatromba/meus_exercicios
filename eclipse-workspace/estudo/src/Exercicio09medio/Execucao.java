package Exercicio09medio;
import java.util.Scanner;
public class Execucao {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int aluno=10;
		Exercicio09medio exercicio09medio=new Exercicio09medio();
		int vetorNumero[]=new int[aluno];		
		String vetorNome[]=new String[aluno];
		for (int i=0;i<aluno;i++) {
			System.out.println("Digite o número do aluno");
			vetorNumero[i]=input.nextInt();
		}
		for (int i=0;i<aluno;i++) {
			System.out.println("Digite o nome do aluno");
			vetorNome[i]=input.nextLine();
		}
		System.out.println("Número: "+exercicio09medio.retornaNumeroAluno(vetorNumero)+" Nome: "+exercicio09medio.retornaNomeAluno(vetorNome));
	}
}
//CORREÇÃO