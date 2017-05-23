package br.com.fiap;

public class Cavalo implements Runnable{

	private String nomeCavalo = "";
	
	
	public Cavalo(String nomeCavalo) {
		super();
		this.nomeCavalo = nomeCavalo;
	}


	@Override
	public void run() {
		try {
			for(int i=0; i < 17; i++){
				Thread.sleep((int)(Math.random() * 5000));
				System.out.println(nomeCavalo + " " + (i*100)/100 + "%..." );
			}
			System.out.println(nomeCavalo + ": Ganhou!!!");
		} catch (InterruptedException e) {
		
		}
	}

	
	public String getNomeCavalo() {
		return nomeCavalo;
	}

	public void setNomeCavalo(String nomeCavalo) {
		this.nomeCavalo = nomeCavalo;
	}
	
}
