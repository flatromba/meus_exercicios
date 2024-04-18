package exercicio31;
import java.util.Scanner;
public class execucaoExercicio31 {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Digite a sua altura");
		double altura=input.nextDouble();
		System.out.println("Escolha seu sexo:\n1-M\n2-F");
		int sexo=input.nextInt();
		exercicio31 pessoa=new exercicio31();
		pessoa.calculaPesoIdeal(sexo, altura);
	}
}