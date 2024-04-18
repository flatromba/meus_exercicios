package exercicio19;

public class exercicio19 {
	
	public void retornaRelacionamento (int A, int B) {
		if (A==B) {
			System.out.println("Os números "+A+" e "+B+" são iguais");
		}
		else if (A>B) {
			System.out.println("O número "+A+" é maior que o número "+B);
		}
		else {
			System.out.println("O número "+A+" é menor que o número "+B);
		}
	}
}