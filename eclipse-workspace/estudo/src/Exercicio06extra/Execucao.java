package Exercicio06extra;
import java.util.Scanner;
public class Execucao {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);	
		int numero;
		Exercicio06extra exercicio06extra=new Exercicio06extra();
		System.out.println("Digite um número");
		numero=input.nextInt();
		System.out.println("O antecessor de "+numero+" é: "+exercicio06extra.retornaAntecessor(numero)+"\nO sucessor de "+numero+" é: "+exercicio06extra.retornaSucessor(numero));
	}
}