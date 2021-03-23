package br.com.lojaxpto.implementacao;

import javax.swing.JOptionPane;

import br.com.lojaxpto.modelo.Cliente;
import br.com.lojaxpto.modelo.PessoaFisica;
import br.com.lojaxpto.modelo.PessoaJuridica;

public class TesteCliente {
	
	public static void main(String[] args) {
		
		//Criei pela sub e instanciei pela sub
		//		PessoaFisica pf = new PessoaFisica();
		
		//Criei pela super e instanciei pel sub cli pode ser pessoa juridica ou fisica
		// ex cli=PessoaJuridica ou cli=PessoaFisica
		
		Cliente cliente = new Cliente();
		
		if (JOptionPane.showInputDialog("Digite <F> para fisica ou qqr coisa para Jurifica").toUpperCase().equals("F")) {
			cliente = new PessoaFisica(
					"Nome PF: ",
					"Email@PF.com.br",
					"38427700815",
					"4728332-x"
					);
		}else {
			cliente = new PessoaJuridica(
					"Nome PJ",
					"Email@PJ.com.br",
					"1111111111/55",
					"Contato",
					"123.456.789"
					);
		}
		
		System.out.println(cliente.toString());
		System.out.println(cliente.getDocumentos());
		
				
		
		
		
		
		
		
		
		
		
		
		
	}

}
