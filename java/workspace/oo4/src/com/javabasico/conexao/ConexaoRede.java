package com.javabasico.conexao;

public class ConexaoRede 
	implements Conexao {

	@Override
	public void abrir() {
		System.out.println("Conectando na rede");
	}

	@Override
	public void enviarDados(String dados) {
		System.out.println("Enviando dados pela rede: "
				+ dados);
	}

	@Override
	public void fechar() {
		System.out.println("Fechando conexao com a rede");
	}

}
