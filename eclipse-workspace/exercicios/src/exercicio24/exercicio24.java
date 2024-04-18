package exercicio24;

public class exercicio24 {	

	public void calculaMedia (float nota1, float nota2, float nota3, float nota4, float notaRec) {
		float media=(nota1+nota2+nota3+nota4)/4;
		if (media>=7) {
			System.out.println("Aluno aprovado");
		}
		if (media<7) {
			System.out.println("Aluno em recuperação");
			float mediaRec=(media+notaRec)/2;
			if (mediaRec>=7) {
				System.out.println("Aluno aprovado em recuperação");
			}
			if (mediaRec<7){
				System.out.println("Aluno reprovado");
			}
		}
		
	}
}