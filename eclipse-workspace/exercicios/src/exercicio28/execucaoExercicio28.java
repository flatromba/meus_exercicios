package exercicio28;
import java.util.Scanner;
public class execucaoExercicio28 {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);			
		System.out.println("Digite 3 números");
		int ladoA=input.nextInt();
		int ladoB=input.nextInt();
		int ladoC=input.nextInt();
		exercicio28 triangulo=new exercicio28();
		triangulo.verificaTriangulo(ladoA, ladoB, ladoC);
	}
}