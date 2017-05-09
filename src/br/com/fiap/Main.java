package br.com.fiap;

public class Main {

	public static void main(String[] args) {
//		System.out.println("Olá Mundo!");
		Aluno aluno = new Aluno("diogo", 10);
		
		aluno.setCodigoAluno(10);
		System.out.println(aluno.getCodigoAluno());

		// toString é retornado por default
		System.out.println(aluno); 
		
		// Wrappers
		int b = Integer.valueOf("10");
		System.out.println(b = Integer.divideUnsigned(10, 3));
		
		// Simulando chamadas de construtores aninhados
		Cliente cliente = new Cliente("rg", "cpf", "endereco", "nome");
	
		System.out.println(aluno.getNomeAluno());
		
		//
		System.out.println(Calculator.toBinary(20));
	}
}
