package exercicio34;

public class exercicio34 {
	public void calculaSalario (int horas) {
		if (horas>=50) {
			int salario=50*10;
			int horaExtra=horas-50;
			int salarioExtra=horaExtra*20;
			int salarioTotal=salario+salarioExtra;
			System.out.println("Salário total: "+salarioTotal+"\nSalário extra: "+salarioExtra);
		}
		if (horas>0 && horas<50) {
			int salario=horas*10;
			int horaExtra=0;
			int salarioExtra=horaExtra*20;
			int salarioTotal=salario+salarioExtra;
			System.out.println("Salário total: "+salarioTotal+"\nSalário extra: "+salarioExtra);
		}
		if (horas<=0) {
			System.out.println("Número de horas inválido");
		}
	}
}