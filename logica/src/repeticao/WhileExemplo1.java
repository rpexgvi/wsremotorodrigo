package repeticao;

import javax.swing.JOptionPane;

public class WhileExemplo1 {
	
	
public static void main(String[] args) {
		
		
		String nome = JOptionPane.showInputDialog("Nome :").toUpperCase();
		
		while(nome.length()<3 || nome.length()>15) {
			
			nome = JOptionPane.showInputDialog("Nome novamente :").toUpperCase();
					
		}
			nome = JOptionPane.showInputDialog("Nome :").toUpperCase();
			System.out.println(nome);
		
	}

}
