package exercicio29;
import java.util.Scanner;
public class execucaoExercicio29 {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Digite 3 números");
		int numero1=input.nextInt();
		int numero2=input.nextInt();
		int numero3=input.nextInt();
		exercicio29 operacoes=new exercicio29();
		operacoes.calculaOperacao(numero1, numero2, numero3);
	}
}