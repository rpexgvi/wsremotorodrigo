package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisao {
	
	public static void main(String[] args) {
		
		/*
		 * 1. Um hotel cobra R$ 80,00 a di�ria e mais uma taxa de servi�os. 
		 *	A taxa de servi�os � de: 
		 *	R$ 5,50 por di�ria, se o n�mero de di�rias for maior que 15; >15
		 *	R$ 6,00 por di�ria, se o n�mero de di�rias for igual a 15;   ==15
		 *	R$ 8,00 por di�ria, se o n�mero de di�rias for menor que 15. <15
		 *	Monte uma aplica��o que apresente a conta do cliente.
		 */
		
		double diaria = 80.00;
		double tx1 = 5.50;
		double tx2 = 6.00;
		double tx3 = 8.00;
		
		short dia = Short.parseShort(JOptionPane.showInputDialog("Digite a quantidade DIAS : " ));
		
		if (dia>15) {
			double total = (diaria * dia) + tx1;
			System.out.println("\nValor da total : " + total);
						
		}
		
		if (dia==15) {
			double total = (diaria * dia) + tx2;
			System.out.println("\nValor da total : " + total);
						
		}
		
		if (dia<15) {
			double total = (diaria * dia) + tx3;
			System.out.println("\nValor da total : " + total);
						
		}
		
	}

}
