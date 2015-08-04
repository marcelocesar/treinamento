package com.javabasico.conexao;

public class Negocio {

	public void salvarDados(String dados) {
		//ConexaoBancoDados conexao = new ConexaoBancoDados();
		//ConexaoMainframe conexao = new ConexaoMainframe();
		FabricaConexao fc = new FabricaConexao();
		Conexao conexao = fc.getConexao();
		
		conexao.abrir();
		conexao.enviarDados(dados);
		conexao.fechar();
	}
}
