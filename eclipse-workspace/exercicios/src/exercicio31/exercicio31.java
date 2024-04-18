package exercicio31;

public class exercicio31 {
	
	public void calculaPesoIdeal (int sexo, double altura) {
		
		switch (sexo) {
		case 1:
			double peso1=(72.7*altura)-58;
			System.out.println("Seu peso ideal é:"+peso1);
			break;
		case 2:
			double peso2=(62.1 *altura) - 44.7;
			System.out.println("Seu peso ideal é:"+peso2);
			break;
		}
	}
}