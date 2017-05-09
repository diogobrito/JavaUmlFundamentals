package br.com.fiap;

public class ClasseUtilitaria {
	private static String staticString = null;
	private String string= null;
	
	static {
		staticString = "A classe foi carregada.";
				//string ="Esta linha não compila."
	}
	
	public static String normalizar(String text){
		return text.toUpperCase();
	}
}