package exercicio11;
import java.util.Scanner;
public class execucaoExercicio11 {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in); 
		System.out.println("Digite a quantidade mínima");
		int quantidadeMinima=input.nextInt();
		System.out.println("Digite a quantidade máxima");
		int quantidademaxima=input.nextInt();
		exercicio11 estoque=new exercicio11();
		System.out.println("Estoque médio é: "+estoque.calculaEstoqueMedio(quantidadeMinima, quantidademaxima));
	}
}