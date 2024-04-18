package exercicio21;
import java.util.Scanner;
public class execucaoExercicio21 {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Digite um número");
		int numero=input.nextInt();
		exercicio21 modulo=new exercicio21();
		System.out.println("O módulo do número é: "+modulo.retornaModulo(numero));
	}
}