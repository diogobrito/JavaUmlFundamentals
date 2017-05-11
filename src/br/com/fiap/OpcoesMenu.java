package br.com.fiap;

public enum OpcoesMenu {
		SALVAR(0), IMPRMIR(1), ABRIR(2), VISUALIZAR(3), FECHAR(4);
		
		private final int valor;
		
		OpcoesMenu(int valorOpcao){
			valor = valorOpcao;
		}
		
		public int getValor(){
			return valor;
		}
}
