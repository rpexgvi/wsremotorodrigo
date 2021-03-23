package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples {
	
	
	public static void main(String[] args) {
		
		/*Capturar
		 * Nome da disciplina
		 * nota 1
		 * nota 2
		 * No final exibir a media entre as duas notas
		 * exibir Parabens somente se a media for >=3 
		 * 
		 */
		
		String disciplina = JOptionPane.showInputDialog("Digite a disciplina:   ").toUpperCase();
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1 " ));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2 " ));
		
		double media = (nota1 + nota2) / 2;
		
		if (media>=6) {
			
			System.out.printf("\n Parabens, a sua media é :  " + media + " \n Disciplina : " + disciplina );
		} 
			
		
		if (media<4) {
			
			System.out.printf("\n Reprovado. Media  :  " + media + " \n Disciplina : " + disciplina );
		}
		
		//  && and
		//  || or
		
		if (media>=4 && media<6) {
			
			System.out.printf("\n Exame. Media  :  " + media + " \n Disciplina : " + disciplina );
			
		}
		
		
		
		
		
		
		
	}

}
