package variaveis;

public class TipoString {

	public static void main(String[] args) {
		
		
		String email = "rodrIgo.A.paulaitau-unibanco.com.br";
		System.out.println("Original: " + email);
		System.out.println("Minuscula: " + email.toLowerCase());
		System.out.println("Maiuscula: " + email.toUpperCase());
		System.out.println("Qtde de caracteres: " + email.length());
		System.out.println("É IGUAL: " + email.equals("teste@teste"));
		System.out.println("É IGUAL 2 " + email.equalsIgnoreCase("rodrIgo.a.paula"));
		System.out.println("Contem o caracter @ ? " + email.contains("@"));
		System.out.println("Posição da letra " + email.indexOf("@"));
		System.out.println("Do 3º e 4º caracter : " + email.substring(2,4));
		System.out.println("Exibe o que está antes do arroba : " + email.substring(0,7));
		
		//if (email.contains("@") >-1) { poderia ser utilizado
		
		if (email.contains("@") == true) {
						
			System.out.println("Exibe o que está antes do arroba2 : " + email.substring(0,email.indexOf("@")));
		}
		
			System.out.println("Até logo");
		
				
			
		
		
		
		
		
	}
}
