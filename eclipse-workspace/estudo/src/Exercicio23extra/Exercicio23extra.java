package Exercicio23extra;

public class Exercicio23extra {
	
	public void retornaClasseEleitoral(int idade) {
		if (idade<16) {
			System.out.println("Não eleitor");
		}
		if (idade>=18 && idade <65) {
			System.out.println("Eleitor obrigatório");
		}
		if (idade>=16 && idade<18) {
			System.out.println("Eleitor facultativo");
		}
		if (idade>=65) {
			System.out.println("Eleitor facultativo");
		}
	}
}