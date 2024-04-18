package exercicio26;
import java.util.Scanner;
public class execucaoExercicio26 {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Digite um número");
		int numero=input.nextInt();
		exercicio26 intervalo=new exercicio26();
		intervalo.verificaIntervalo(numero);
	}
}