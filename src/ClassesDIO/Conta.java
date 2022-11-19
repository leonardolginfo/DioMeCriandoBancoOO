package ClassesDIO;

public class Conta {
	
	private static final int AGENCIA_PADRAO = 001;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;

	
	public Conta() {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
	}

	public void sacar() {

	};

	public void depositar() {

	};

	public void transferir() {

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
