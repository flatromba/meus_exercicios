package exercicio09;
import java.util.Scanner;
public class execucaoExercicio09 {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		exercicio09 produto=new exercicio09();
		System.out.println("Digite o número");
		String numero=input.nextLine();
		System.out.println("Digite a descrição");
		String descricao=input.nextLine();
		System.out.println("Digite a quantidade");
		int quantidade=input.nextInt();
		System.out.println("Digite o preco");
		double preco=input.nextDouble();
		System.out.println("Número: "+produto.numero(numero)+"\nDescrição: "+produto.descricao(descricao)+"\nQuantidade: "+produto.quantidade(quantidade)+"\nPreço: "+produto.preco(preco)+"\nPreço total: "+produto.precoTotal(quantidade, preco));
	}
}