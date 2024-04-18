package exercicio01;

public class execucaoExercicio01 {
	
	public static void main(String[] args) {
		
		int janeiro=15000;
		int fevereiro=23000;
		int marco=17000;
		int media=(janeiro+fevereiro+marco)/3;
		int gastosTrimestre=janeiro+fevereiro+marco;
		exercicio01 gastos=new exercicio01();
		System.out.println("os gastos do trimestre foi de :R$"+gastosTrimestre);
		System.out.println("a média de gastos do trimestre foi de :R$"+media);
	}
}