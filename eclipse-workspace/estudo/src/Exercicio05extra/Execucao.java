package Exercicio05extra;
import java.util.Scanner;
public class Execucao {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		float quantidadeSM, salarioMinimo, salarioUsuario;
		Exercicio05extra exercicio05extra=new Exercicio05extra();
		System.out.println("Digite o salário mínimo");
		salarioMinimo=input.nextFloat();
		System.out.println("Digite o salário do usuário");
		salarioUsuario=input.nextFloat();
		System.out.println("O usuário ganha "+exercicio05extra.retornaQuantidadeSM(salarioMinimo, salarioUsuario)+" salários mínimos");
	}
}