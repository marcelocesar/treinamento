package com.javabasico.pacote2;

import com.javabasico.pacote1.Cls1;

public class SubCls1 extends Cls1 {

	void x() {
		Cls1 um = new Cls1();
		um.pub = 1;
		
		protegido = 2;
		
		//um.pacote = 3;
		//um.priv = 1;
	}
}
