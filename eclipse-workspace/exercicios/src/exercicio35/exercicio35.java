package exercicio35;

public class exercicio35{
	
	public void calculaGraos() {
		int graos=1;
		int graosCasa=1;
		for (int i=1;i<=64;i++) {
			graosCasa=graosCasa*2;
			graos+=graosCasa;
		}		
		System.out.println("o número de grãos é: "+graos);
	}
}