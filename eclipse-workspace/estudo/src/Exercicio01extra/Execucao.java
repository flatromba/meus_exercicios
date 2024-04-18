package Exercicio01extra;
import java.util.Scanner;
public class Execucao {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int ano,mes,dia;
		Exercicio01extra flavio=new Exercicio01extra();
		System.out.println("Digite quantos anos");
		ano=input.nextInt();
		System.out.println("Digite quantos meses");
		mes=input.nextInt();
		System.out.println("Digite quantos dias");
		dia=input.nextInt();
		System.out.println("Idade em dias é: "+(flavio.retornaAnosEmDias(ano)+flavio.retornaMesesEmDias(mes)+dia));
	}
}