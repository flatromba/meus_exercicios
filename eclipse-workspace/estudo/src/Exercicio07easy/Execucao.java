package Exercicio07easy;
import java.util.Scanner;
public class Execucao {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o salário");
		float salario=input.nextFloat();
		Exercicio07easy exercicio07easy=new Exercicio07easy();
		System.out.println("Valor do INSS a ser pago: "+exercicio07easy.retornaInss(salario));
	}
}