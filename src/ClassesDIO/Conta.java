package ClassesDIO;

public class Conta {

	private static final int AGENCIA_PADRAO = 001;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	protected void imprimirInfoComuns() {
		System.out.println(String.format("Titular: %s" , this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d" , this.agencia));
		System.out.println(String.format("Número: %d",this.numero));
		System.out.println(String.format("Saldo: %.2f",this.saldo));
		System.out.println("");
	}
	
	public void sacar(double valor) {
		saldo -= valor;
	};

	public void depositar(double valor) {
		saldo += valor;
	};

	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
}
