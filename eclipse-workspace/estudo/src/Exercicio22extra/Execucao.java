package Exercicio22extra;
import java.util.Scanner;
public class Execucao {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Digite o saldo médio");
		float saldoMedio=input.nextFloat();
		Exercicio22extra exercicio22extra=new Exercicio22extra();
		exercicio22extra.retornaValorDeCredito(saldoMedio);
	}
}