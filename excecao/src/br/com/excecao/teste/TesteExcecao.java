package br.com.excecao.teste;

public class TesteExcecao {
	
	public static void main(String[] args) {
		try {
			int numero = Integer.parseInt("1");
			System.out.println("Numero : " + numero);
			
			//if (numero<0) {
			//	throw new RuntimeException("Eu derrubei vc");
			// }
			
			String palavra="nulo";
			System.out.println("Qtde de letras: " + palavra.length());
			
			
			int[] numeros = new int[3];
			System.out.println("numeros 2: " + numeros);
			numeros[0]=502;
			numeros[1]=187;
			numeros[2]=235;
			
		}catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
		System.out.println("Vetor estourado");
			
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("Objeto Nulo");
			
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("Numero Invalido ");
		
		
		} catch (Exception e) {
			//// TODO: handle exception
			System.out.println("Ops!Deu ruim");
			e.printStackTrace();
		} finally {
			System.out.println("Até logo!!!");
			// fechar comunicação com o bd
			
			
		}
		
		
		
	}
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

