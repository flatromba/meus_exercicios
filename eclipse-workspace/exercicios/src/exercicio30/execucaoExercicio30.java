package exercicio30;
import java.util.Scanner;
public class execucaoExercicio30 {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Digite 2 números");
		int numero1=input.nextInt();
		int numero2=input.nextInt();
		System.out.println("Escolha uma opção:\n1 – Adição\n2 – Subtração\n3 – Multiplicação\n4 – Divisão");
		int opcao=input.nextInt();
		exercicio30 calculadora=new exercicio30();
		calculadora.calculadora(numero1, numero2, opcao);
	}
}