package exercicio16;
import java.util.Scanner;
public class execucaoExercicio16 {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Digite a temperatura em ºC");
		double celsius=input.nextDouble();
		exercicio16 temperatura=new exercicio16();
		System.out.println("A temperatura em Fahrenheit é: "+temperatura.calculaTemperatura(celsius));
	}
}