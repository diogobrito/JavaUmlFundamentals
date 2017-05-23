package br.com.fiap;

import java.time.LocalDateTime;

public class Cliente {
	private String numeroRG, numeroCPF, endereco, nome;
	private int idade;
	private boolean clienteAtivo = true;
	private LocalDateTime primeiraCompra;
	
	public Cliente(){
		
	}
	
	
	
	public Cliente(String nome, int idade, LocalDateTime primeiraCompra) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.primeiraCompra = primeiraCompra;
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
	
	
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", idade=" + idade + ", clienteAtivo=" + clienteAtivo + ", primeiraCompra="
				+ primeiraCompra + "]";
	}

	public String getNumeroRG() {
		return numeroRG;
	}

	public void setNumeroRG(String numeroRG) {
		this.numeroRG = numeroRG;
	}

	public String getNumeroCPF() {
		return numeroCPF;
	}

	public void setNumeroCPF(String numeroCPF) {
		this.numeroCPF = numeroCPF;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isClienteAtivo() {
		return clienteAtivo;
	}

	public void setClienteAtivo(boolean clienteAtivo) {
		this.clienteAtivo = clienteAtivo;
	}

	public LocalDateTime getPrimeiraCompra() {
		return primeiraCompra;
	}

	public void setPrimeiraCompra(LocalDateTime primeiraCompra) {
		this.primeiraCompra = primeiraCompra;
	}
	
}
