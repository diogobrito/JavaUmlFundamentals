package br.com.fiap;

import java.util.Date;

public class Cliente {
	private String numeroRG, numeroCPF, endereco, nome;
	private int idade;
	private boolean clienteAtivo;
	private Date primeiraCompra;
	
	public Cliente(){
		
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
	public String toString(){
		return this.nome + this.clienteAtivo + this.primeiraCompra ;
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

	public Date getPrimeiraCompra() {
		return primeiraCompra;
	}

	public void setPrimeiraCompra(Date primeiraCompra) {
		this.primeiraCompra = primeiraCompra;
	}
	
}
