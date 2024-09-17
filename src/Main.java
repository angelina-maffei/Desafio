
public class Main {

	public static void main(String[] args) {
		Cliente Paula = new Cliente();
		Paula.setNome("Paula");
		
		Conta cc = new ContaCorrente(Paula);
		Conta poupanca = new ContaPoupanca(Paula);

		cc.depositar(3000);
		cc.transferir(300, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}