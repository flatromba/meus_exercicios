package Exercicio21extra;

public class Exercicio21extra {
	
	public float retornaIMC(float peso, float altura) {
		float imc=peso/(altura*altura);
		if (imc<20) {
			System.out.println("IMC="+imc+" :abaixo do peso");
		}
		if (imc>=20 && imc<25) {
			System.out.println("IMC="+imc+" :peso normal");
		}
		if (imc>=25 && imc<30) {
			System.out.println("IMC="+imc+" :sobre peso");
		}
		if (imc>=30 && imc<40) {
			System.out.println("IMC="+imc+" :obeso");
		}
		if (imc>=40) {
			System.out.println("IMC="+imc+" :obeso mórbido");
		}
		return imc;
	}
}