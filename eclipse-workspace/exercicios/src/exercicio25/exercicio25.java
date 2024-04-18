package exercicio25;

public class exercicio25 {
	
	public void verificaNumeros( int numero1, int numero2) {
		if (numero1>numero2) {
			System.out.println("Número maior: "+numero1+"\nNúmero menor: "+numero2);
		}
		if (numero2>numero1) {
			System.out.println("Número maior: "+numero2+"\nNúmero menor: "+numero1);
		}
		if (numero1==numero2) {
			System.out.println("Os números são iguais");
		}
	}
}