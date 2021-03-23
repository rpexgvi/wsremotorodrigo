package decisao;

import javax.swing.JOptionPane;
import javax.xml.ws.Endpoint;

public class DesafioDecisao3 {
	
	public static void main(String[] args) {
		
		Double lab = Double.parseDouble(JOptionPane.showInputDialog("Nota laboratório 1 : (peso 2) : " ));
		Double avs = Double.parseDouble(JOptionPane.showInputDialog("Nota Av. Semestral : (peso 3) " ));
		Double exf = Double.parseDouble(JOptionPane.showInputDialog("Exame final        : (peso 5) " ));
	
		double total1 = lab/2;
		double total2 = avs/3;
		double total3 = exf/5;
		
		System.out.println("Resultado final : " + (float) (total1+total2+total3));
	}

}
