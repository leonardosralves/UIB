
public class Conta {
	
	private String numero;
	private double saldo;
	private Cliente DonoDaConta;
	
	public void creditar (double valor) {
		saldo = saldo  + valor;
	}
	
	public void debitar (double valor) {
		saldo = saldo - valor;
	}
	
	public void transferir (double valor, Conta contaDestino) {
		debitar (valor);
		contaDestino.creditar (valor);
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public Cliente getDonoDaConta() {
		return DonoDaConta;
	}
	
	public void setDonoDaConta(Cliente donoDaConta) {
		DonoDaConta = donoDaConta;
	}
}