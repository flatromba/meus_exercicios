package Exercicio24extra;
import java.util.Scanner;
public class Execucao {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Digite o número do prato (1-Vegetariano/2-Peixe/3-Frango/4-Carne");
		int numeroPrato=input.nextInt();
		System.out.println("Digite o número da sobremesa (1-Abacaxi/2-Sorvete diet/3-Mousse diet/4-Mousse chocolate");
		int numeroSobremesa=input.nextInt();
		System.out.println("Digite o número da bebida (1-Chá/2-Suco de laranja/3-Suco de melão/4-Refrigerante diet");
		int numeroBebida=input.nextInt();
		Exercicio24extra exercicio24extra=new Exercicio24extra();
		int caloriaTotal=exercicio24extra.retornaPrato(numeroPrato)+exercicio24extra.retornaSobremesa(numeroSobremesa)+exercicio24extra.retornaBebida(numeroBebida);
		System.out.println("Caloria total="+caloriaTotal);
	}
}