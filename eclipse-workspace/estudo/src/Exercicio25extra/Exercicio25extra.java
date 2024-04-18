package Exercicio25extra;

public class Exercicio25extra {
	
	public String retornaDiaDaSemana(int diaSemana) {
		if (diaSemana>=1 && diaSemana<=7) {
		switch (diaSemana) {
		case 1:
			System.out.println("Domingo");
			return "Domingo";	
		case 2:
			System.out.println("Segunda-feira");
			return "Segunda-feira";
		case 3:
			System.out.println("Terça-feira");
			return "Terça-feira";
		case 4:
			System.out.println("Quarta-feira");
			return "Quarta-feira";
		case 5:
			System.out.println("Quinta-feira");
			return "Quinta-feira";
		case 6:
			System.out.println("Sexta-feira");
			return "Sexta-feira";
		case 7:
			System.out.println("Sábado");
			return "Sábado";
		}
		}
		else {
			System.out.println("Dia da semana inexistente");
		}
		return null;
	}
}