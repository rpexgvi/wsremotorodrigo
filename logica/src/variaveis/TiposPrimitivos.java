package variaveis;

import javax.swing.JOptionPane;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		
		
		String time1 = JOptionPane.showInputDialog("Digite o time 1");
		String time2 = JOptionPane.showInputDialog("Digite o time 2");
		double entrada = Double.parseDouble(JOptionPane.showInputDialog("Digite a entrada" ));
		int publico = Integer.parseInt(JOptionPane.showInputDialog("Dugite o publico total :"));
		double total = entrada * publico;
		
		System.out.printf("No jogo entre %s x %s a arrecadação foi de : R$ %.2f ", time1, time2, total);
		
		
		
		
		
		
		
	}

}
