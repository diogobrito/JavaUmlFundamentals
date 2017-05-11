package br.com.fiap;

public enum ClassificacaoCliente {
	POTENCIAL(400000, 500000),
	MEDIO(200000, 400000),
	BAIXO(0, 200000);
	
	private double saldoMinimo;
	private double saldoMaximo;
	
	ClassificacaoCliente(double saldoMinimo, double saldoMaximo) {
		this.saldoMinimo = saldoMinimo;
		this.saldoMaximo = saldoMaximo;
	}
	
	public double getSaldoMinimo(){
		return saldoMinimo;
	}

	public double getSaldoMaximo(){
		return saldoMaximo;
	}
	
	public boolean isCompatible(ContaBancaria conta){
		if(conta.getSaldo() >= saldoMinimo &&
				conta.getSaldo() <= saldoMaximo){
			return true;
		}
		
		return false;
		/*if(conta instanceof ContaBancaria){
			return true;
		}
		
		return false;*/
	}
}
