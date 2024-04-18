package exercicio23;
import java.util.Scanner;
public class execucaoExercicio23 {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("digite 2 números");
		int numero1=input.nextInt();
		int numero2=input.nextInt();
		exercicio23 diferenca=new exercicio23();
		diferenca.calculaDiferenca(numero1, numero2);
	}
}