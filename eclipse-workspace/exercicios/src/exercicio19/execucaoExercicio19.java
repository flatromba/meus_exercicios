package exercicio19;
import java.util.Scanner;
public class execucaoExercicio19 {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Digite dois números");
		int A=input.nextInt();
		int B=input.nextInt();
		exercicio19 relacao=new exercicio19();
		relacao.retornaRelacionamento(A, B);
	}
}