package exercicio13;
import java.util.Scanner;
public class execucaoExercicio13 {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Digite o valor da peça");
		double valorPeca=input.nextDouble();
		System.out.println("Digite a quantidade de peças");
		int quantidadePeca=input.nextInt();
		exercicio13 comissao=new exercicio13();
		System.out.println("O valor da comissão é: "+comissao.calculaComissao(valorPeca, quantidadePeca));
	}
}