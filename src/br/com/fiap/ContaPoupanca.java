package br.com.fiap;

public class ContaPoupanca extends ContaBancaria implements Tributacao{
	public ContaPoupanca(String nomeCliente, String endCliente, String cpfCliente){
		super(nomeCliente, endCliente, cpfCliente);
	}
	
	private int diaAniversario;

	public void saque(double valor){
		saldo -= valor - 0.10;
	}

	@Override
	public double calcularTributo() {
		return saldo * 0.03;
	}
}
