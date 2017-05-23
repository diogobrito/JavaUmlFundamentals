package br.com.fiap;

public class ExemploThread extends Thread{
	
	String name = "";
	
	
	
	public ExemploThread(String name) {
		super();
		this.name = name;
	}



	public void run(){
		for(int i = 0; i < 100_000_000; i++){
			System.out.println(name + ": " + i);
		}
	}
}
