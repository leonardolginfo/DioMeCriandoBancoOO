package ClassesDIO;

public class BancoDioMain {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		cc.depositar(100);
		
		Conta pp = new ContaPoupanca();
		
		cc.transferir(50, pp);

		cc.imprimirInfoComuns();
		pp.imprimirInfoComuns();
		
	}

}
