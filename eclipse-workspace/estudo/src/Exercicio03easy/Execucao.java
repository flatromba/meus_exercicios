package Exercicio03easy;
import java.util.Scanner;
public class Execucao {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Digite o primeiro valor");
		String primeiroValor=input.nextLine();
		System.out.println("Digite o segundo valor");
		String segundoValor=input.nextLine();
		Exercicio03easy exercicio03easy=new Exercicio03easy();
		System.out.println(exercicio03easy.retornaValorTrocado(primeiroValor, segundoValor));
	}
}