package br.com.fiap;

public class ContaBancaria {
	protected double saldo;
	protected String nomeCliente;
	protected String endCliente;
	protected String cpfCliente;
	protected double taxaBancaria = 1;

	public ContaBancaria(String nomeCliente, String endCliente, String cpfCliente) {
//		super();
		this.nomeCliente = nomeCliente;
		this.endCliente = endCliente;
		this.cpfCliente = cpfCliente;
	}

	public void saque(double valor){
		saldo -= valor;
	}

	public void deposita(double valor){
		saldo += valor;
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public double getTaxaBancaria(){
		return taxaBancaria;
	}
	
	public double getTaxaBancaria(int dias){
		return getTaxaBancaria() * dias;
	}
	
	public double getTaxaBancaria(int dias, int meses){
		int qtdDias = (30 * meses) + dias;
		
		return getTaxaBancaria(qtdDias);
	}
}
