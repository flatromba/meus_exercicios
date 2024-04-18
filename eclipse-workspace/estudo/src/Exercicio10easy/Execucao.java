package Exercicio10easy;
import java.util.Scanner;
public class Execucao{
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);	
		System.out.println("Digite o valor investido");
		float valorInvestido=input.nextFloat();
		Exercicio10easy exercicio10easy=new Exercicio10easy();
		System.out.println("Valor investido: "+valorInvestido+"\nValor dos juros: "+exercicio10easy.calculaValorJuros(valorInvestido)+"\nValor total: "+exercicio10easy.calculaValorTotal(valorInvestido));
	}
}