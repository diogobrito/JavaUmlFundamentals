package br.com.fiap;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
/*//		System.out.println("Ol� Mundo!");
		Aluno aluno = new Aluno("diogo", 10);
		
		aluno.setCodigoAluno(10);
		System.out.println(aluno.getCodigoAluno());

		// toString � retornado por default
		System.out.println(aluno); 
		
		// Wrappers
		int b = Integer.valueOf("10");
		System.out.println(b = Integer.divideUnsigned(10, 3));
		
		// Simulando chamadas de construtores aninhados
		Cliente cliente = new Cliente("rg", "cpf", "endereco", "nome");
	
		System.out.println(aluno.getNomeAluno());
		
		// Testes para toBinary 
		if(!Calculator.toBinary(0).equals("0")){
			System.out.println("Erro linha 26");
		}else if(!Calculator.toBinary(1).equals("1")){
			System.out.println("Erro linha 28, resultado " + Calculator.toBinary(1));
		}else if(!Calculator.toBinary(2).equals("10")){
			System.out.println("Erro linha 30");
		}else if(!Calculator.toBinary(3).equals("11")){
			System.out.println("Erro linha 32");
		}else if(!Calculator.toBinary(4).equals("100")){
			System.out.println("Erro linha 34");
		}else if(!Calculator.toBinary(5).equals("101")){
			System.out.println("Erro linha 36");
		}else if(!Calculator.toBinary(6).equals("110")){
			System.out.println("Erro linha 38");
		}else if(!Calculator.toBinary(7).equals("111")){
			System.out.println("Erro linha 40, resultado " + Calculator.toBinary(1));
		}else if(!Calculator.toBinary(8).equals("1000")){
			System.out.println("Erro linha 42");
		}else if(!Calculator.toBinary(9).equals("1001")){
			System.out.println("Erro linha 44");
		}else if(!Calculator.toBinary(10).equals("1010")){
			System.out.println("Erro linha 46");
		}else if(!Calculator.toBinary(11).equals("1011")){
			System.out.println("Erro linha 48");
		}else if(!Calculator.toBinary(12).equals("1100")){
			System.out.println("Erro linha 50");
		}else{
			System.out.println("Tudo certo para toBinary!");
		}

		// Testes para Fatorial
		if(Calculator.fatorial(0) != 0){
			System.out.println("Erro linha 57");			
		}else if(Calculator.fatorial(1) != 1){
			System.out.println("Erro linha 59, o resultado foi: " + Calculator.fatorial(1));			
		}else if(Calculator.fatorial(2) != 2){
			System.out.println("Erro linha 61, o resultado foi: " + Calculator.fatorial(2));			
		}else if(Calculator.fatorial(3) != 6){
			System.out.println("Erro linha 63, o resultado foi: " + Calculator.fatorial(3));			
		}else if(Calculator.fatorial(4) != 24){
			System.out.println("Erro linha 64, o resultado foi: " + Calculator.fatorial(4));			
		}else if(Calculator.fatorial(5) != 120){
			System.out.println("Erro linha 66, o resultado foi: " + Calculator.fatorial(5));			
		}else if(Calculator.fatorial(6) != 720){
			System.out.println("Erro linha 68, o resultado foi: " + Calculator.fatorial(6));			
		}else if(Calculator.fatorial(7) != 5040){
			System.out.println("Erro linha 70, o resultado foi: " + Calculator.fatorial(7));			
		}else if(Calculator.fatorial(8) != 40320){
			System.out.println("Erro linha 72, o resultado foi: " + Calculator.fatorial(8));			
		}else if(Calculator.fatorial(9) != 362880){
			System.out.println("Erro linha 74, o resultado foi: " + Calculator.fatorial(9));			
		}else if(Calculator.fatorial(10) != 3628800){
			System.out.println("Erro linha 76, o resultado foi: " + Calculator.fatorial(10));			
		}else{
			System.out.println("Tudo certo para fatorial!");
		}
		
		// Calculos de Array
		int[] intArray = {40, 15};
		
		ArraysActivity.calcOnArrays(intArray);
		
		// Manipulando contas
		ContaEspecial contaEspecial = new ContaEspecial("nome", "endereco", "cpf");
		
		contaEspecial.deposita(100);
		
		System.out.println(contaEspecial.getSaldo());
		
		contaEspecial.saque(50);

		System.out.println(contaEspecial.getSaldo());
		
		System.out.println(contaEspecial.getTaxaBancaria(10));
		
		Tributacao contaPoupT = new ContaPoupanca("nome", "end", "cpf");
		
		System.out.println(ClassificacaoCliente.POTENCIAL.isCompatible(contaEspecial));
		
		ContaPoupanca cp = new ContaPoupanca("y", "x", "123");
		ContaPoupanca cp1 = new ContaPoupanca("y", "x", "123");
		
		cp.setSaldo(1000);
		
		try {
			cp.saque(1000, LocalDate.of(2000, Month.AUGUST, 23));
		} catch (ContaException e) {
			System.out.println(e.getMessage());
		}
		
		//System.out.println(cp.equals(cp1));
		
		
		
//		System.out.println(ClassificacaoCliente.isCompatible(contaEspecial));
	*/
	
		/*List<String> testeArray = new ArrayList();
		
		LinkedList<String> testeLinked = new LinkedList<String>();
		
		for(int i=0; i<=100000000; i++){
			testeArray.add("ABC :" + i);
			testeLinked.add("ABC :" + i);
		}
		
		System.out.println(LocalDateTime.now() );
		
		System.out.println(testeArray.get(950000));

		System.out.println(LocalDateTime.now() );
		System.out.println(testeLinked.get(950000));
		 */
		
		
	}
	
}

