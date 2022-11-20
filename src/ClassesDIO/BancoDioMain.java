package ClassesDIO;

public class BancoDioMain {

	public static void main(String[] args) {
		Cliente cli1 = new Cliente();
		cli1.setNome("Leo");
		
		Cliente cli2 = new Cliente();
		cli2.setNome("Maria");
		
		Conta cc = new ContaCorrente(cli1);
		cc.depositar(100);
		
		Conta pp = new ContaPoupanca(cli2);
		
		cc.transferir(50, pp);
		pp.transferir(10, cc);

		cc.imprimirInfoComuns();
		pp.imprimirInfoComuns();
		
	}

}
