package exercicio12;
import java.util.Scanner;
public class execucaoExercicio12 {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Digite o valor da cotação");
		double cotacao=input.nextDouble();
		System.out.println("Digite o valor em dólares");
		double dolar=input.nextDouble();
		exercicio12 conversao=new exercicio12();
		System.out.println("O valor em real é: "+conversao.converteDolarReal(dolar, cotacao));
	}
}