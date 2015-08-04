package com.javabasico.conexao;

public interface Conexao {

	void abrir();
	
	void enviarDados(String dados);
	
	void fechar();
}
