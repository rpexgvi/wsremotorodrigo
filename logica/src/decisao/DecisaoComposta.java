package decisao;

import javax.swing.JOptionPane;

public class DecisaoComposta {
	
	
	public static void main(String[] args) {
		
				
		String disciplina = JOptionPane.showInputDialog("Digite a disciplina:   ").toUpperCase();
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1 " ));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2 " ));
		
		double media = (nota1 + nota2) / 2;
		
				if (media>=6) {
						System.out.printf("\n Parabens, a sua media ? :  " + media + " \n Disciplina : " + disciplina );
		} 
			
				else if (media<4) {
						System.out.printf("\n Reprovado. Media  :  " + media + " \n Disciplina : " + disciplina );
		}
				else {
						System.out.printf("\n Exame. Media  :  " + media + " \n Disciplina : " + disciplina );
			
		}
		
		
		
		
	}

}
