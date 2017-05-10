package br.com.fiap;

public class ContaPoupanca extends ContaBancaria{
	private int diaAniversario;

	public void saque(double valor){
		saldo -= valor - 0.10;
	}
}
