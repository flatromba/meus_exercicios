package exercicio20;
import java.util.Scanner;
public class execucaoExercicio20 {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Digite dois números");
		int A=input.nextInt();
		int B=input.nextInt();
		exercicio20 inverso=new exercicio20();
		System.out.println("números digitados: "+inverso.inversoA(B)+" e "+inverso.inversoB(A));
	}
}