package br.com.fiap;

public class ContaBancaria{
	protected double saldo;

	public void saque(double valor){
		saldo -= valor;
	}
	
	public void deposita(double valor){
		saldo += valor;
	}
	
	public double getSaldo(){
		return saldo;
	}
	
	public double getTaxaBancaria(){
		return 1.5;
	}
	
	public double getTaxaBancaria(int dias){
		return getTaxaBancaria() * dias;
	}
	
	public double getTaxaBancaria(int dias, int meses){
		int qtdDias = (30 * meses) + dias;
		
		return getTaxaBancaria(qtdDias);
	}
}
