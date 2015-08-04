package com.javabasico.conexao;

public class ConexaoMainframe 
	implements Conexao {

	@Override
	public void abrir() {
		System.out.println("Conectando no mainframe");
	}

	@Override
	public void enviarDados(String dados) {
		System.out.println("Enviando dados ao mainframe: " 
				+ dados);
	}

	@Override
	public void fechar() {
		System.out.println("Fechando conexao com o mainframe");
	}

}
