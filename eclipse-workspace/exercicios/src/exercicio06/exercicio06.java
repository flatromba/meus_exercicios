package exercicio06;

public class exercicio06 {
	
	public void retornaFibonacci() {
		int atual=1;
		int anterior=0;
		for (int i=0;i<=100;i++) {
			int proximo=anterior+atual;
			anterior=atual;
			atual=proximo;
		}
		System.out.println(atual);
	}
}