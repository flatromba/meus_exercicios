package exercicio14;
import java.util.Scanner;
public class execucaoExercicio14 {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Digite 4 valores");
		int A=input.nextInt();
		int B=input.nextInt();
		int C=input.nextInt();
		int D=input.nextInt();
		exercicio14 operacoes=new exercicio14();
		System.out.println("Soma A com B:"+operacoes.somaAComB(A, B)+"\nSoma A com C:"+operacoes.somaAComC(A, C)+"\nSoma A com D:"+operacoes.somaAComD(A, D));
		System.out.println("Multiplicação A com B:"+operacoes.multiplicaAComB(A, B)+"\nMultiplicação A com C:"+operacoes.multiplicaAComC(A, C)+"\nMultiplicação A com D:"+operacoes.multiplicaAComD(A, D));
	}
}