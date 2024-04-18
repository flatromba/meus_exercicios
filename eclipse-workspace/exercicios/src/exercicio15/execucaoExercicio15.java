package exercicio15;
import java.util.Scanner;
public class execucaoExercicio15 {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Digite o tempo e a velocidadde");
		double tempo=input.nextDouble();
		double velocidade=input.nextDouble();
		exercicio15 consumo=new exercicio15();
		double litros=consumo.calculaDistancia(tempo, velocidade)/12;
		System.out.println("o consumo em litros da viagem foi de: "+litros);
	}
}