package Exercicio06easy;
import java.util.Scanner;
public class Execucao {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Digite a primeira nota");
		float nota1=input.nextFloat();
		System.out.println("Digite a segunda nota");
		float nota2=input.nextFloat();
		Exercicio06easy exercicio06easy=new Exercicio06easy();
		if (exercicio06easy.retornaMedia(nota1, nota2)>5) {
			System.out.println("Aprovado "+exercicio06easy.retornaMedia(nota1, nota2));
		}
		if (exercicio06easy.retornaMedia(nota1, nota2)<5) {
			System.out.println("Reprovado "+exercicio06easy.retornaMedia(nota1, nota2));
		}
		if (exercicio06easy.retornaMedia(nota1, nota2)==5) {
			System.out.println("Exame "+exercicio06easy.retornaMedia(nota1, nota2));
		}
	}
}