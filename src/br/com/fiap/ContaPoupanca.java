package br.com.fiap;

public class ContaPoupanca extends ContaBancaria implements Tributacao{
	public ContaPoupanca(String nomeCliente, String endCliente, String cpfCliente){
		super(nomeCliente, endCliente, cpfCliente);
	}
	
	private int diaAniversario;

	public void saque(double valor) throws ContaException{
		saldo -= valor - 0.10;
		if( valor > saldo ){
			throw new ContaException("Você não tem saldo sulficiente para essa operação.");
		}
	}

	@Override
	public double calcularTributo() {
		return saldo * 0.03;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof ContaPoupanca){
			ContaPoupanca conta = (ContaPoupanca) obj;
			return conta.getCpfCliente().equals(cpfCliente);
		} else {
			return super.equals(obj);
		}
	}
	
	
}
