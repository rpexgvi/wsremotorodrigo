package br.com.lojaxpto.implementacao;

import br.com.lojaxpto.modelo.Cliente;
import br.com.lojaxpto.modelo.Fabricante;
import br.com.lojaxpto.modelo.Produto;
import br.com.lojaxpto.modelo.Venda;

public class TesteVenda {
	
	
	public static void main(String[] args) {
		
		

		Venda venda = new Venda(
				123,
				1000,
				new Cliente(
						"Xpto",
						"xpto@xpto.com"
						),
				new Produto(
						1,
						"Churros",
						new Fabricante(
								"123456789",
								"Churrolandia",
								"1234-5678"
								),
						10,
						15,
						1000
						)
				);
		
		System.out.println(venda.toString());
		System.out.println("Resumo: " + venda.getResumo());
		System.out.println("Total Estoque Venda: " + venda.getProduto().totalEstoqueVenda());
		System.out.println("Total Estoque Compra: " + venda.getProduto().totalEstoqueCompra());

				
				
		
		
	}
	
	

}
