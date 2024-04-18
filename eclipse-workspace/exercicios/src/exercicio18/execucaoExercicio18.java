package exercicio18;
import java.util.Scanner;
public class execucaoExercicio18 {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Digite quantos anos");
		int anos=input.nextInt();
		System.out.println("Digite quantos meses");
		int meses=input.nextInt();
		System.out.println("Digite quantos dias");
		int dias=input.nextInt();
		exercicio18 idade=new exercicio18();
		int idadeDias=idade.anosEmDias(anos)+idade.mesesEmDias(meses)+dias;
		System.out.println("A idade em dias é: "+idadeDias);
	}
}