package exercicio08;

public class exercicio08 {
	String nomeTitular ="Flávio";
	int numeroConta=12345;
	int numeroAgencia=9876;
	double saldo=300.00;
	String dataAbertura="05/06/2020";
	
	public double retornaDeposito (double deposito) {
		this.saldo+=deposito;
		return saldo;		
	}
	
	public double retornaSaque (double saque) {
		this.saldo-=saque;
		return saldo;
	}
	
	public double calculaRendimento (double saldo) {
		return this.saldo*0.1;		
	}
	
	public double retornaSaldoTotal () {
		return this.saldo*0.1+this.saldo;
	}
}