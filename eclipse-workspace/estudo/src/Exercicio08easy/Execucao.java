package Exercicio08easy;
import java.util.Scanner;
public class Execucao{
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Digite o salário");
		float salario=input.nextFloat();
		Exercicio08easy exercicio08easy=new Exercicio08easy();
		System.out.println("Valor do salário bruto: "+salario+"\nValor do salário liquido: "+exercicio08easy.retornaSalarioLiquido(salario)+"\nValor do imposto de renda: "+exercicio08easy.retornaImpostoRenda(salario));

	}
}