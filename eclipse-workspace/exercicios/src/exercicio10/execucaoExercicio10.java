package exercicio10;
import java.util.Scanner;
public class execucaoExercicio10 {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		exercicio10 empregado1=new exercicio10();
		System.out.println("Digite o nome");
		String nome1=input.nextLine();
		System.out.println("Digite o sobrenome");
		String sobrenome1=input.nextLine();
		System.out.println("Digite o salário");
		double salario1=input.nextDouble();
		System.out.println("Nome: "+empregado1.nome1(nome1)+"\nSobrenome: "+empregado1.sobrenome1(sobrenome1)+"\nSalario: "+empregado1.salario1(salario1));
		System.out.println("Digite o valor do aumento");
		double aumento1=input.nextDouble();
		System.out.println("Salário com aumento: "+empregado1.novoSalario1(salario1, aumento1)+"\nSalário anual: "+empregado1.salarioAnual1(salario1));
		
		exercicio10 empregado2=new exercicio10();
		System.out.println("Digite o nome");
		String nome2=input.nextLine();
		System.out.println("Digite o sobrenome");
		String sobrenome2=input.nextLine();
		System.out.println("Digite o salário");
		double salario2=input.nextDouble();
		System.out.println("Nome: "+empregado2.nome2(nome2)+"\nSobrenome: "+empregado2.sobrenome2(sobrenome2)+"\nSalario: "+empregado2.salario2(salario2));
		System.out.println("Digite o valor do aumento");
		double aumento2=input.nextDouble();
		System.out.println("Salário com aumento: "+empregado2.novoSalario2(salario2, aumento2)+"\nSalário anual: "+empregado2.salarioAnual2(salario2));

	}
}