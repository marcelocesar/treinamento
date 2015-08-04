package com.javabasico.conexao;

public class FabricaConexao {

	public Conexao getConexao() {
		return new ConexaoMainframe();
	}
}
