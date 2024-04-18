package exercicio28;

public class exercicio28 {
	
	public void verificaTriangulo (int ladoA, int ladoB, int ladoC) {
		if (ladoA<ladoB+ladoC && ladoB<ladoA+ladoC && ladoC<ladoA+ladoB) {
			if (ladoA==ladoB && ladoB==ladoC) {
				System.out.println("Triângulo equilatero");				
			}
			if (ladoA==ladoB || ladoA==ladoC || ladoB==ladoC) {
				System.out.println("Triângulo isósceles");
			}
			else {
				System.out.println("Triângulo escaleno");
			}
		}
		else {
			System.out.println("Não é um triângulo");
		}
	}
}