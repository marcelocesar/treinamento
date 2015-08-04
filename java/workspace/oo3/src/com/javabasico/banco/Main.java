package com.javabasico.banco;

import com.javabasico.comum.Cliente;

public class Main {

	public static void main(String[] args) {
		Banco bb = new Banco();
		bb.setNumero(1);
		bb.setNome("Banco do Brasil");
		
		Banco caixa = new Banco();
		caixa.setNumero(104);
		caixa.setNome("Caixa");
		
		Agencia agencia = new Agencia();
		agencia.setNumero("4885");
		agencia.setBanco(bb);
		
		Cliente pele = new Cliente();
		pele.setNome("Edson Arantes do Nascimento");
		
		Conta c1 = new Conta();
		c1.setAgencia(agencia);
		c1.setNumero("12345");
		c1.setSaldo(70000.0);
		
		Agencia agx = new Agencia();
		agx.setNumero("999");
		agx.setBanco(caixa);
		
		ContaEspecial c2 = new ContaEspecial();
		c2.setAgencia(agx);
		c2.setNumero("23846");
		c2.setSaldo(500000.0);
		c2.setLimite(100000.0);
		
		System.out.println(c2.getAgencia().getBanco().getNome());
		
		c1.retirar(10000.0);
		System.out.printf(
			"Saldo c1 apos retirada de 10mil: %.2f\n",
			c1.getSaldo()
		);
		
		c1.retirar(61000.0);
		System.out.printf(
			"Saldo c1 apos retirada de 61mil: %.2f\n",
			c1.getSaldo()
		);
		
		c2.transferir(c1, 500000.0);
		System.out.printf(
			"Saldos c1 e c2 apos transferencia c2->c1 [500mil]: \n\tc1=%.2f, \n\tc2=%.2f\n\tc2(disp)=%.2f\n",
			c1.getSaldo(),
			c2.getSaldo(),
			c2.getValorDisponivel()
		);
	}
}
