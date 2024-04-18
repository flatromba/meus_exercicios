package exercicio25;
import java.util.Scanner;
public class execucaoExercicio25 {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Digite 2 números");
		int numero1=input.nextInt();
		int numero2=input.nextInt();
		exercicio25 verifica=new exercicio25();
		verifica.verificaNumeros(numero1, numero2);
	}
}