package Exercicio08easy;

public class Exercicio08easy {
	
	public double retornaSalarioLiquido(float salario) {
		double deducao, impostoRenda, salarioLiquido=0;
		if (salario<=1903.98) {
			deducao=0;
			impostoRenda=0;
			salarioLiquido=salario-impostoRenda;
		}
		if (salario>=1903.99 && salario<=2826.65) {
			deducao=142.80;
			impostoRenda=(salario*0.075)-deducao;
			salarioLiquido=salario-impostoRenda;
		}
		if (salario>=2826.66 && salario<=3751.05) {
			deducao=354.80;
			impostoRenda=(salario*0.15)-deducao;
			salarioLiquido=salario-impostoRenda;
		}
		if (salario>=3751.06 && salario<=4664.68) {
			deducao=636.13;
			impostoRenda=(salario*0.225)-deducao;
			salarioLiquido=salario-impostoRenda;
		}
		if (salario>=4664.69) {
			deducao=869.36;
			impostoRenda=(salario*0.275)-deducao;
			salarioLiquido=salario-impostoRenda;

	}
		return salarioLiquido;
	}
	
	public double retornaImpostoRenda(float salario) {
		double deducao, impostoRenda=0;
		if (salario<=1903.98) {
			deducao=0;
			impostoRenda=0;
		}
		if (salario>=1903.99 && salario<=2826.65) {
			deducao=142.80;
			impostoRenda=(salario*0.075)-deducao;
		}
		if (salario>=2826.66 && salario<=3751.05) {
			deducao=354.80;
			impostoRenda=(salario*0.15)-deducao;
		}
		if (salario>=3751.06 && salario<=4664.68) {
			deducao=636.13;
			impostoRenda=(salario*0.225)-deducao;
		}
		if (salario>=4664.69) {
			deducao=869.36;
			impostoRenda=(salario*0.275)-deducao;

	}
		return impostoRenda;
	}
}