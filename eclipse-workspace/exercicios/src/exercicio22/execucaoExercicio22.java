package exercicio22;
import java.util.Scanner;
public class execucaoExercicio22 {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Digite 3 números");
		int numero1=input.nextInt();
		int numero2=input.nextInt();
		int numero3=input.nextInt();
		
		exercicio22 ordem= new exercicio22();
		ordem.ordemDecrescente(numero1, numero2, numero3);
	}
}