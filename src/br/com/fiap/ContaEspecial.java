package br.com.fiap;

public class ContaEspecial extends ContaBancaria {
	public ContaEspecial(String nomeCliente, String endCliente, String cpfCliente){
		super(nomeCliente, endCliente, cpfCliente);
	}
	
	@Override
	public void saque(double valor) {
		saldo -= valor + (valor * 0.1);
	}
	
	@Override
	public void deposita(double valor) {
		saldo += valor * 0.9;
	}
}
