package exercicio27;
import java.util.Scanner;
public class execucaoExercicio27 {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Digite o código");
		int codigo=input.nextInt();
		exercicio27 verifica=new exercicio27();
		verifica.verificaCodigo(codigo);
	}
}