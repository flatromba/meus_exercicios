package exercicio34;
import java.util.Scanner;
public class execucaoExercicio34 {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Digite as horas trabalhadas");
		int horas=input.nextInt();
		exercicio34 salario=new exercicio34();
		salario.calculaSalario(horas);
	}
}