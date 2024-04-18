package exercicio22;

public class exercicio22 {
	
	public void ordemDecrescente (int numero1, int numero2, int numero3) {
		
		if (numero1<numero2 && numero2<numero3){
			System.out.println("Os números na ordem decrescente: "+numero1+","+numero2+","+numero3);
		}
		if (numero1<numero2 && numero3<numero2) {
			System.out.println("Os números na ordem decrescente: "+numero1+","+numero3+","+numero2);
		}
		if (numero2<numero1 && numero1<numero3) {
			System.out.println("Os números na ordem decrescente: "+numero2+","+numero1+","+numero3);
		}
		if (numero2<numero1 && numero3<numero1) {
			System.out.println("Os números na ordem decrescente: "+numero2+","+numero3+","+numero1);
		}
		if (numero3<numero1 && numero2<numero1) {
			System.out.println("Os números na ordem decrescente: "+numero3+","+numero2+","+numero1);
		}
		if (numero3<numero1 && numero1<numero2) {
			System.out.println("Os números na ordem decrescente: "+numero3+","+numero1+","+numero2);
		}
		else {
			System.out.println("Existem números iguais");
		}
		
	}
}