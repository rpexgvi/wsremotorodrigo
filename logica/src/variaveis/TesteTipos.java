package variaveis;

import javax.swing.JOptionPane;

public class TesteTipos {
	
	public static void main(String[] args) {
		
		/*
		 * Dados a serem capturados:
		 * - Nome do produto (notebooks)
		 * - Qtde
		 * - Imposto
		 * - Valor unitário
		 * No final deverá exibir:
		 * - o valor acrescido com o imposto
		 * - o valor do imposto isolado
		 * - valor total com imposto
		 * - total sem imposto
		 */
		
		String produto = JOptionPane.showInputDialog("Digite o produto:   ");
		short quantidade = Short.parseShort(JOptionPane.showInputDialog("Dugite a quantidade :"));
		float porcentagem = Float.parseFloat(JOptionPane.showInputDialog("Digite a porcentagem " ));
		float valuni = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor unitario" ));
		float imposto = valuni * (porcentagem/100);
		
		
		System.out.printf("Valor com imposto: " + (valuni + imposto));
		System.out.printf("\nTotal do imposto:  " + imposto );
		System.out.printf("\nValor com imposto:  " + (valuni+imposto)*quantidade);
		System.out.printf("\nValor sem imposto:  " + (valuni*quantidade));
		
		
		
		
		
		
	}

}
