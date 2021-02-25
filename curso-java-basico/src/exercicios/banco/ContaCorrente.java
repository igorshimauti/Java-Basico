package exercicios.banco;

public class ContaCorrente {
	
	Cliente cliente;
	String agencia;
	String numero;
	Double saldo;
	
	void depositar(Double valor) {
		saldo += valor;
	}
	
	void sacar(Double valor) {
		if (saldo >= valor) {
			saldo -= valor;
		} else {
			System.out.println("Saldo insuficente.");
		}
	}
}