package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada {
	
	
	public static void main(String[] args) {
		/*
		 * capturar faltas
		 * o aluno sera aprovado em relação a media  e faltas < 20
		 * o msm vale para exame
		 */
				
		String disciplina = JOptionPane.showInputDialog("Digite a disciplina:   ").toUpperCase();
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1 " ));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2 " ));
		short falta = Short.parseShort(JOptionPane.showInputDialog("Digite a quantidade de faltas : " ));
		
		double media = (nota1 + nota2) / 2;
		
		if (falta>20) {
			System.out.printf("\nMédia :  " + media + " \nDisciplina : " + disciplina );
			System.out.println("\nReprovado por falta!");
			
		}  else			 {
			
				if (media>=6) {
						System.out.printf("\n Parabens, a sua media é :  " + media + " \n Disciplina : " + disciplina );
						System.out.printf("\n Quantidade de faltas :  " + falta);
						
		} 
			
				else if (media<4 ) {
						System.out.printf("\n Reprovado. Media  :  " + media + " \n Disciplina : " + disciplina );
						System.out.printf("\n Quantidade de faltas :  " + falta);
		}
						
				else {
						System.out.printf("\n Exame. Media  :  " + media + " \n Disciplina : " + disciplina );
			
		}
		
						}
		
		
	}

}
