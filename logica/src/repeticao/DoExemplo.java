package repeticao;

import javax.swing.JOptionPane;

public class DoExemplo {

	
	public static void main(String[] args) {
		
		int numero1 = 0;
		int numero2 = 0;
		int resultado = 0;
		String operacao="";
		String resp="";
				
		do {
			
			numero1 = Integer.parseInt(JOptionPane.showInputDialog("Numero 1 : "));
			operacao=JOptionPane.showInputDialog("Digite a opera��o : + - * /");
			numero2 = Integer.parseInt(JOptionPane.showInputDialog("Numero 2 : "));
			
			
			if (operacao.equals("+")==true) {
				System.out.println("Resultado: " + (numero1+numero2));
			}else if (operacao.equals("-")==true) {
				System.out.println("Resultado: " + (numero1-numero2));
			}else if (operacao.equals("*")==true) {
				System.out.println("Resultado: " + (numero1*numero2));
			}else if (operacao.equals("/")==true) {
				System.out.println("Resultado: " + (numero1/numero2));
			}else {
				System.out.println("Opera��o invalida");
			}
			
		resp=JOptionPane.showInputDialog("Digite <S> para continuar").toUpperCase();	
		} while (resp.equals("S")) ;
		
		{
			
			
		}		
	}
	
}
