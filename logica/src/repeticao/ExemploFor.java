package repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {
	
	public static void main(String[] args) {
		
		/*
		 * sintaxe For
		 * contador valor inicial
		 * condi��o
		 * como vai ocorrer o incremento
		 */
		
		
		
		int tabuada = Integer.parseInt(JOptionPane.showInputDialog("Tabuada : "));
		
		for (int contador=1;contador<11; contador+=1) {
			
			System.out.println(tabuada + " x " + contador + "=" + (tabuada*contador));
			
		}
		
		
	}

}
