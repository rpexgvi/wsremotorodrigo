package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimplesDesafio {
	
	public static void main(String[] args) {
		
		/*
		 * Capturar nome e idade de uma pessoa
		 * ir�o exibir as mensagens de acordo com a regra:
		 * 
		 * "Voto obrigatorio" = pessoas entre 18 e 70
		 * "Voto facultativo" 16,17 e acima de 70
		 * "N�o pode Votar" = menores de 16 anos
		 * 
		 */
		
		
		String nome = JOptionPane.showInputDialog("Digite o seu nome :   ").toUpperCase();
		short idade = Short.parseShort(JOptionPane.showInputDialog("Digite a sua idade " ));
		
		if (idade >= 18 && idade < 70) {
			
			System.out.printf(" Nome : " + nome + " \n Voto obrigat�rio :  " + idade + " anos" );			
		}
		
		if (idade == 16 || idade == 17 || idade >= 70 ) {
			
			System.out.printf(" Nome : " + nome + "\n Voto facultativo :  " + idade + " anos" );
			
		}
		if (idade < 16) {
			
			System.out.printf(" Nome : " + nome + "\n N�o pode votar :  " + idade + " anos" );
		}
		
		
		
		
	}

}
