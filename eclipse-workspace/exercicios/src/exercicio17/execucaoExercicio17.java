package exercicio17;
import java.util.Scanner;
public class execucaoExercicio17 {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
			System.out.println("Digite o valor do raio e da altura");
			double raio=input.nextDouble();
			double altura=input.nextDouble();
			exercicio17 volume=new exercicio17();
			System.out.println("o volume da lata é: "+volume.calculaVolume(raio, altura));
	}
}