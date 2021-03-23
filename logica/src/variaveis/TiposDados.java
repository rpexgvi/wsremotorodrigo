package variaveis;

public class TiposDados {
	
	public static void main(String[] args) {
		
		String nome = "Rodrigo de Paula";
		int idade = 30;
		double altura = 1.69;
		double peso = 62;
		double imc = peso / (altura * altura);
		
				System.out.println("Nome   : " + nome);
				System.out.println("Idade  : " + idade);	
				System.out.println("Altura : " + altura);
				System.out.printf("\nIMC    : %.2f " , imc);
				System.out.printf("\n\nOla %s seu imc eh %.2f", nome, imc);
				
			
				
	}
	
	
}
