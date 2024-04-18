package Exercicio02medio;
import java.util.Scanner;
public class Execucao {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Digite o valor investido");
		double valorInvestido=input.nextFloat();
		Exercicio02medio exercicio02medio=new Exercicio02medio();
		double valorJuros=exercicio02medio.retornaInvestimento(valorInvestido)-valorInvestido;
		System.out.println("Valor investido: "+valorInvestido+"\nValor dos juros: "+valorJuros+"\nValortotal: "+exercicio02medio.retornaInvestimento(valorInvestido));
	}
}