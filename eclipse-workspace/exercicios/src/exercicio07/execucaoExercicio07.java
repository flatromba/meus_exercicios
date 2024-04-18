package exercicio07;
import java.util.Scanner;
public class execucaoExercicio07 {
	
	public static void main(String[] args) {		
		Scanner input=new Scanner(System.in);
		exercicio07 conta1=new exercicio07();
		System.out.println("Digite um valor");
		int x=input.nextInt();
		System.out.println(conta1.retornaConta1(x));
		exercicio07 conta2=new exercicio07();
		System.out.println("Digite um valor");
		int y=input.nextInt();
		System.out.println(conta1.retornaConta2(y));
}
}