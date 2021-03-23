package br.com.modelo.bankofoz;

// herança
public class Poupanca extends Conta {
	
	// atributos privados
	private float rendimento;

	
	// calculo de rendimento
	
	
	public void creditarRendimentos() {
	
		setSaldo(getSaldo() + getSaldo() * (rendimento/100));
		
	}
	 	
	
	
	
	
	
	public float getRendimento() {
		return rendimento;
	}






	public void setRendimento(float rendimento) {
		this.rendimento = rendimento;
	}






	public Poupanca(short numero, byte digito, short agencia, float saldo, Cliente cliente, float rendimento) {
		super(numero, digito, agencia, saldo, cliente);
		this.rendimento = rendimento;
	}






	public Poupanca() {
		super();
	}






	@Override
	public String toString() {
		return "Poupanca [rendimento=" + rendimento + ", toString()=" + super.toString() + "]";
	}


	


	

	
	
	
	
	
	

}
