package Exercicio24extra;

public class Exercicio24extra {
	
	public int retornaPrato(int numeroPrato) {
		switch (numeroPrato) {
		case 1: 
			System.out.println("Prato escolhido: Vegetariano");
			int caloriaPrato1=180;
			return caloriaPrato1;
		case 2:
			System.out.println("Prato escolhido: Peixe");
			int caloriaPrato2=230;
			return caloriaPrato2;
		case 3: 
			System.out.println("Prato escolhido: Frango");
			int caloriaPrato3=250;
			return caloriaPrato3;
		case 4: 
			System.out.println("Prato escolhido: Carne");
			int caloriaPrato4=350;
			return caloriaPrato4;
		}
		return numeroPrato;
	}
	
	public int retornaSobremesa(int numeroSobremesa) {
		switch (numeroSobremesa) {
		case 1: 
			System.out.println("Sobremesa escolhida: Abacaxi");
			int caloriaSobremesa1=75;
			return caloriaSobremesa1;
		case 2:
			System.out.println("Sobremesa escolhida: Sorvete diet");
			int caloriaSobremesa2=110;
			return caloriaSobremesa2;
		case 3: 
			System.out.println("Sobremesa escolhida: Mousse diet");
			int caloriaSobremesa3=170;
			return caloriaSobremesa3;
		case 4: 
			System.out.println("Sobremesa escolhida: Mousse chocolate");
			int caloriaSobremesa4=200;
			return caloriaSobremesa4;
		}
		return numeroSobremesa;
	}
	
	public int retornaBebida(int numeroBebida) {
		switch (numeroBebida) {
		case 1: 
			System.out.println("Bebida escolhida: Chá");
			int caloriaBebida1=20;
			return caloriaBebida1;
		case 2:
			System.out.println("Bebida escolhida: Suco de laranja");
			int caloriaBebida2=70;
			return caloriaBebida2;
		case 3: 
			System.out.println("Bebida escolhida: Suco de melão");
			int caloriaBebida3=100;
			return caloriaBebida3;
		case 4: 
			System.out.println("Bebida escolhida: Refrigerante diet");
			int caloriaBebida4=65;
			return caloriaBebida4;
		}
		return numeroBebida;	
		
	}
}