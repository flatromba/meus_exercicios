package Exercicio03medio;

public class Exercicio03medio {
	
	public void retornaSoma() {
		int soma=0;
		for (int i=0;i<1000;i++) {
			soma=soma+i;
			if (soma>=1500) {
				System.out.println("Soma maior que 1500\nFIM!");
				break;
			}
			else {
				System.out.println(soma);
			}
		}
	}
}