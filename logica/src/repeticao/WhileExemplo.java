package repeticao;

import javax.swing.JOptionPane;

public class WhileExemplo {

	public static void main(String[] args) {
		
		
		String email = JOptionPane.showInputDialog("Email:").toLowerCase();
		
		while (email.contains("@")==false) {
			email = JOptionPane.showInputDialog("Email com @").toLowerCase();
					
		}
		
		System.out.println("Usuario : " + email.substring(0, email.indexOf("@")));	
				
	}
}
