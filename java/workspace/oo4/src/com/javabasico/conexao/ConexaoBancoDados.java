package com.javabasico.conexao;

public class ConexaoBancoDados 
	implements Conexao {

	@Override
	public void abrir() {
		System.out.println("Conectando ao banco de dados");
	}

	@Override
	public void enviarDados(String dados) {
		System.out.println("Enviando dados ao banco de dados: "
				+ dados);
	}

	@Override
	public void fechar() {
		System.out.println("Fechando conexao com o banco de dados");
	}
}
