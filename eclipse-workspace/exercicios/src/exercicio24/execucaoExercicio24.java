package exercicio24;
import java.util.Scanner;
public class execucaoExercicio24 {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Digite 4 notas");
		float nota1=input.nextFloat();
		float nota2=input.nextFloat();
		float nota3=input.nextFloat();
		float nota4=input.nextFloat();
		exercicio24 media=new exercicio24();
		media.calculaMedia(nota1, nota2, nota3, nota4, nota4);
		System.out.println("Digite a nota de recuperação");	
		float notaRec=input.nextFloat();
		media.calculaMedia(nota1, nota2, nota3, nota4, notaRec);
		
	}
}