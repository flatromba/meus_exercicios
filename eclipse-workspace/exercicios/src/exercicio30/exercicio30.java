package exercicio30;

public class exercicio30 {
	
	public void calculadora (int numero1, int numero2, int opcao) {
		
		switch (opcao) {
		case 1: 
			int resultado1=numero1+numero2;
			System.out.println(numero1+"+"+numero2+"="+resultado1);
			break;
		case 2:
			int resultado2=numero1-numero2;
			System.out.println(numero1+"-"+numero2+"="+resultado2);
		case 3:
			int resultado3=numero1*numero2;
			System.out.println(numero1+"x"+numero2+"="+resultado3);
			break;
		case 4:
			double resultado4=numero1/numero2;
			System.out.println(numero1+"/"+numero2+"="+resultado4);
			break;
		}
	}
}