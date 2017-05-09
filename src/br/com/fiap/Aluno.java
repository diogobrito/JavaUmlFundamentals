package br.com.fiap;

public class Aluno {
	private int codigoAluno;
	private String nomeAluno;

	public Aluno(){
		
	}
	
	/**
	 * 
	 * @param nomeAluno  Nome do Aluno
	 * @param codigoAluno  Codigo do Aluno
	 */
	public Aluno(String nomeAluno, int codigoAluno){
		this.nomeAluno = nomeAluno;
		this.codigoAluno = codigoAluno;
	}
	
	public void setCodigoAluno(int codigoAluno){
		this.codigoAluno = codigoAluno;
	}
	
	/**
	 * 
	 * @return Retorna o código do aluno
	 */	
	public int getCodigoAluno(){
		return codigoAluno;
	}

	// Chamada utilizando classe estática
	public String getNomeAluno() {
		return ClasseUtilitaria.normalizar(nomeAluno);
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
}
