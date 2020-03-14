
public class TestaMetodo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo = 100;
		conta.deposita(50);
		System.out.println(conta.saldo);

		boolean conseguirRetirar = conta.saca(20);
		System.out.println(conta.saldo);
		System.out.println(conseguirRetirar);

		Conta contaNova = new Conta();
		contaNova.deposita(1000);

		if (contaNova.transfere(300, conta)) {
			System.out.println("Transferencia feita com sucesso");
		} else {
			System.out.println("Faltou dinheiro");
		}
		System.out.println(contaNova.saldo);
		System.out.println(conta.saldo);

		conta.titular = "Augusto Furtado";
		System.out.println(conta.titular);
		
		
	}

}
