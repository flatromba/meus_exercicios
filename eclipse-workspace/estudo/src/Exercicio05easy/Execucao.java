package Exercicio05easy;
import java.util.Scanner;
public class Execucao {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Digite um número");
		int numero1=input.nextInt();
		System.out.println("Digite um número");
		int numero2=input.nextInt();
		System.out.println("Digite um número");
		int numero3=input.nextInt();
		Exercicio05 exercicio05easy=new Exercicio05();
		System.out.println("A soma dos numeros "+numero1+","+numero2+","+numero3+" é: "+exercicio05easy.retornaSoma(numero1, numero2, numero3));
		System.out.println("A subtração dos numeros "+numero1+","+numero2+","+numero3+" é: "+exercicio05easy.retornaSubtracao(numero1, numero2, numero3));
		System.out.println("A multiplicação dos numeros "+numero1+","+numero2+","+numero3+" é: "+exercicio05easy.retornaMultiplicacao(numero1, numero2, numero3));
		System.out.println("A média dos numeros "+numero1+","+numero2+","+numero3+" é: "+exercicio05easy.retornaMedia(numero1, numero2, numero3));
	}
}