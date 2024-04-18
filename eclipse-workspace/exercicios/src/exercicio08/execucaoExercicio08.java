package exercicio08;
import java.util.Scanner;
public class execucaoExercicio08 {
	
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		exercicio08 conta=new exercicio08();
		System.out.println("Digite o valor para depositar");
		double deposito=input.nextDouble();
		System.out.println("Novo saldo: "+conta.retornaDeposito(deposito));
		System.out.println("Digite o valor para sacar");
		double saque=input.nextDouble();
		System.out.println("Novo saldo: "+conta.retornaSaque(saque));
		System.out.println("Rendimentos: "+conta.calculaRendimento(saque));
		System.out.println("Nome do titular: "+conta.nomeTitular+"\nNúmero da agencia: "+conta.numeroAgencia+"\nNúmero da conta: "+conta.numeroConta+"\nData de abertura: "+conta.dataAbertura+"\nSaldo: "+conta.retornaSaldoTotal());
	}
}