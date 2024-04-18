package Exercicio18extra;
import java.util.Scanner;
public class Execucao {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[]numero=new int[20];
		Exercicio18extra exercicio18extra=new Exercicio18extra();
		for (int i=0;i<20;i++) {
			System.out.println("Digite um número");
			numero[i]=input.nextInt();
		}
		exercicio18extra.retornaNumeros0a100(numero);
		exercicio18extra.retornaNumeros101a200(numero);
		exercicio18extra.retornaNumerosMaior200(numero);
	}
}