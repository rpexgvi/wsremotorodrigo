package br.com.implementacao.bankofoz;

import br.com.modelo.bankofoz.Cliente;
import br.com.modelo.bankofoz.Conta;
import br.com.modelo.bankofoz.Corrente;
import br.com.modelo.bankofoz.Poupanca;
import br.com.modelo.bankofoz.util.Magica;

public class TesteBanko {
	
	
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente(
				Magica.i("ID"),
				Magica.s("Nome"),
				Magica.s("CPF"),
				Magica.s("Fone")
				
				);
				
		
		Conta conta = new Conta();
		if (Magica.b("Abrir conta corrente?")==true) {
			conta = new Corrente(
					(short) Magica.i("Numero"),
					(byte) Magica.i("Digito"),
					(short) Magica.i("Agencia"),
					Magica.f("Saldo"),
					cliente,
					Magica.f("Limite"),
					Magica.f("Taxa")
					);
		}else {
			conta = new Poupanca();
		}
		
		
		System.out.println(conta);
		
		
		
		
		
		
		
		
	}

}
