package repeticao;

import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

public class ExercicioRepeticao {
	
	public static void main(String[] args) {
		
		String nome="";
		short idade=0;
		short qtdemaioresidade=0;
		
		short totalIdades=0;
		short qtdepessoas=0;
		
		String nomeMaisExperiente="";
		short idadeMaisExperiente=0;
		
		String nomeMaisjovem="";
		short idadeMaisJovem=0;
		
		
		do {
			
			nome = JOptionPane.showInputDialog("Digite o nome :").toLowerCase();
			idade = Short.parseShort(JOptionPane.showInputDialog("Digite sua Idade"));
			
			if (idade<idadeMaisJovem || qtdepessoas==0) {
				idadeMaisJovem=idade;
				nomeMaisjovem=nome;
				
			}
			
			
			if (idade>idadeMaisExperiente) {
				idadeMaisExperiente = idade;
				nomeMaisExperiente = nome;
				
			}
			
					
			qtdepessoas+=1;
			totalIdades+=idade;
			
			if (idade>18) {
				qtdemaioresidade+=1;			
			}
			
						
		} while (JOptionPane.showConfirmDialog(null, "continuar?", "Exercicio 2", JOptionPane.YES_NO_OPTION)==0);
		
		JOptionPane.showMessageDialog(null, "Maiores de idade : " + qtdemaioresidade);
		JOptionPane.showMessageDialog(null, "Media de idade : " + (totalIdades/qtdepessoas));
		JOptionPane.showMessageDialog(null, "Mais Experiente - " +  nomeMaisExperiente + "  - Idade :" + idadeMaisExperiente );
		JOptionPane.showMessageDialog(null, "Mais Jovem - " +  nomeMaisjovem + "  - Idade :" + idadeMaisJovem );
				
	}

}
