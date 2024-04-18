import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero,soma=0;
		for (int i=0;i<10;i++) {
			System.out.println("Digite um número");
			numero=input.nextInt();
			soma=soma+numero;
		}	
		System.out.println(soma);
		}
}



