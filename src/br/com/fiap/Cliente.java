package br.com.fiap;

public class Cliente {
	private String numeroRG, numeroCPF, endereco, nome;
	
	public Cliente(){
		System.out.println("utilizando construtor default");
		
	}

	public Cliente(String numeroRG){
		this();
		this.numeroRG = numeroRG;

		System.out.println("utilizando construtor com 2 params");
	}

	public Cliente(String numeroRG, String numeroCPF, String endereco, String nome){
		this(numeroRG);
		this.numeroCPF = numeroCPF;
		this.endereco = endereco;
		this.nome = nome;

		System.out.println("utilizando construtor com 4 params");
	}
}
