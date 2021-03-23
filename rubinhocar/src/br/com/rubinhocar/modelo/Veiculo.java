package br.com.rubinhocar.modelo;

public class Veiculo {

	private String montadora;
	private float valor;
	private short velocidadeAtual;
	private boolean status;
	private short velocidadeMaxima;
	private String modelo;
	
	
	// sintaxe dos metodos
	// <modificador> <tipo do retorno> <nome do metodo> (<tipo> <nome> do parm)
	
	
	
		// 	preenche montadora	/////////////////////////////////////////
		public void preencherMontadora (String param) {
		montadora = param.toUpperCase();
		
		}
	
		//retorno montadora
		public String retornarMontadora() {
		return montadora;
	
		}
		
		// preenche modelo	//////////////////////////////////////////
		public void preencherModelo (String param) {
			modelo = param.toUpperCase();
			
		}
		
		//retorno modelo
		public String retornarModelo() {
			return modelo;
		
		}
		
    	
		// preencher valor	//////////////////////////////////////////
		public void preencherValor(float param) {
			if (param>0) {
				valor = param;
		}
		
					
				}
				
				//retorno valor
				public float retornarValor() {
					return valor;
				
				}

		// preencher basico /////////////////////////////////////
		public void preencherBasico(boolean pStatus, short pVelocidadeMaxima) {
			status= pStatus;
			velocidadeMaxima = pVelocidadeMaxima;
					
					
				}
	
				
		// retornar tudo valor	//////////////////////////////////////////
		public String retornarTudo() {
		return
							"Montadora:....." + montadora + "\n" + 
							"Valor: ........" + valor + "\n" +
							"Velocidade:... " + velocidadeAtual + "\n" +
							"Status: ...... " + status + "\n" +
							"Velocidade Maxima: " + velocidadeMaxima + "\n" +
							"Modelo:........ " + modelo + "\n" ;

					
				}
				
		// retornar desconto
				public float retornarDesconto() {
					return valor * (float) 0.9;
				}
		
	
				// <modificador> <tipo do retorno> <nome do metodo> (<tipo> <nome> do parm)
			
				//pendente ligar desligar e acelerar
				
				public void desacelerar(short velocidade) {
					if (status==true && (velocidadeAtual-velocidade)>=0) {
						velocidadeAtual-=velocidade;
					}
				}
				
				public void acelerar(short velocidade) {
					if (status==true && (velocidadeAtual+velocidade)<=velocidadeMaxima) {
						velocidadeAtual+=velocidade;
					}
				}
				
				public String desligar() {
					status=false;
					velocidadeAtual=0;
					return "Desligado";
				}
				
				public String ligar() {
					status=true;
					return "Ligado";
				}
		
				
			
				
				
				
				
				
				

	
	
	
	
}
