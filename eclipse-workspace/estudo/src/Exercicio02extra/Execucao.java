package Exercicio02extra;
import java.util.Scanner;
public class Execucao {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int numero1, numero2, numero3, numero4, numero5, numero6, somaMedia, mediaMedia;
		Exercicio02extra exercicio02extra=new Exercicio02extra();
		System.out.println("Digite 3 valores");
		numero1=input.nextInt();
		numero2=input.nextInt();
		numero3=input.nextInt();
		System.out.println("Digite 3 valores");
		numero4=input.nextInt();
		numero5=input.nextInt();
		numero6=input.nextInt();
		somaMedia=(exercicio02extra.retornaMedia1(numero1, numero2, numero3)+exercicio02extra.retornaMedia2(numero4, numero5, numero6));
		mediaMedia=(exercicio02extra.retornaMedia1(numero1, numero2, numero3)+exercicio02extra.retornaMedia2(numero4, numero5, numero6))/2;
		System.out.println("Média 1: "+exercicio02extra.retornaMedia1(numero1, numero2, numero3)+"\nMédia 2: "+exercicio02extra.retornaMedia2(numero4, numero5, numero6)+"\nSoma das médias: "+somaMedia+"\nMédia das médias: "+mediaMedia);
	}
}