package repeticao;

import javax.swing.JOptionPane;

public class ExercicioRepeticao2 {
	
	public static void main(String[] args) {
		
		
		int numero1=0;
		int numero2=0;
		int contador = 1;
			
			numero1 = Integer.parseInt(JOptionPane.showInputDialog("Jogador 1 - Digite um numero : "));
				
		do {			
			
			numero2 = Integer.parseInt(JOptionPane.showInputDialog("Jogador 2 - Adivinhe o numero : "));
			contador++;
			
			if (numero2 < numero1) {
				System.out.println("Chutou baixo : " + numero2);
			}
			
			else if (numero2 > numero1) {
				System.out.println("Chutou alto : " + numero2);
			}
				
		} 
		while (numero1!=numero2) ;
		System.out.println("Parabens, voce acertou o resultado: " + numero2);
		System.out.println("Tentativas: " + contador);
		
		{
				
	
		}
		
	}

}
