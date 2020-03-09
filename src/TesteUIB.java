
public class TesteUIB {

	public static void main(String[] args) {
		Cliente clienteUm = new Cliente();
		Conta conta = new Conta();
		
		clienteUm.nome = "Bruno";
		clienteUm.cpf = "123.456.789-11";
		
		conta.saldo = 100.00;
		conta.DonoDaConta = clienteUm;
		
		System.out.println(conta.DonoDaConta.nome + " tem R$ " + conta.saldo);

	}

}
