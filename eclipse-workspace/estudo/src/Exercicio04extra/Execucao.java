package Exercicio04extra;
import java.util.Scanner;
public class Execucao {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int numeroPecas1, numeroPecas2, codigoPeca1, codigoPeca2;
		float valorPeca1, valorPeca2, valorTotal, ipi;
		Exercicio04extra exercicio04extra=new Exercicio04extra();
		System.out.println("Digite a porcentagem do IPI");
		ipi=input.nextFloat();
		System.out.println("Digite o código da peça 1");
		codigoPeca1=input.nextInt();
		System.out.println("Digite o valor da peça 1");
		valorPeca1=input.nextFloat();
		System.out.println("Digite a quantidade de peças 1");
		numeroPecas1=input.nextInt();
		System.out.println("Digite o código da peça 2");
		codigoPeca2=input.nextInt();
		System.out.println("Digite o valor da peça 2");
		valorPeca2=input.nextFloat();
		System.out.println("Digite a quantidade de peças 2");
		numeroPecas2=input.nextInt();
		System.out.println("Valor total a ser pago: "+exercicio04extra.retornaValorTotal(ipi, valorPeca1, valorPeca2, numeroPecas1, numeroPecas2));
	}
}