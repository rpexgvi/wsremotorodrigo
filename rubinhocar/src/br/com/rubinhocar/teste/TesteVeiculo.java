package br.com.rubinhocar.teste;

import javax.swing.JOptionPane;

import br.com.rubinhocar.modelo.Veiculo;

public class TesteVeiculo {
	
	public static void main(String[] args) {
		
		
		//Instanciando um objeto
		Veiculo carro = new Veiculo();
		
		carro.preencherMontadora(JOptionPane.showInputDialog("Montadora"));
		carro.preencherModelo("uno");
		carro.preencherValor((float)15000.00);
		carro.preencherBasico(false, (short)200);
		System.out.println(carro.retornarTudo());
		System.out.println("Desconto: " + carro.retornarDesconto());
		carro.desligar();
		carro.acelerar((short)15);
		carro.acelerar((short)30);
		carro.desacelerar((short)20);
		System.out.println("Depois de acelerar:" + carro.retornarTudo());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 
		
		// m�todo preencrer montadora
		carro.preencherMontadora("fiat");
		System.out.println(carro.retornarMontadora());
			
		// m�todo preencrer modelo
		carro.preencherModelo("Uno");
		System.out.println(carro.retornarModelo());
		
		// m�todo preencrer valor
		//carro.preencherValor = 1000.00;
		//System.out.println(carro.retornarValor());
		
		// m�todo preencrer basico
		carro.preencherBasico("sim", 200);
		System.out.println(carro.retornarBasico));
		
		// Retornar tudo
		carro.retornarTudo("teste");
		System.out.println(carro.retornarTudo));
		
		// Retornar desconto
		carro.retornarDesconto("teste");
		System.out.println(carro.retornarDesconto));
		
				
		
		* 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
