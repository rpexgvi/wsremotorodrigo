package br.com.modelo.bankofoz;

public class Corrente extends Conta{
	
	private float limite;
	private float taxa;
	
	
	
	
	// metodo aumentar limite
	public void aumentarLimite(float porc) {
		limite = limite + limite * (porc/100);
		
	}
	
	// metodo debitar taxa
	public void debitarTaxa() {
		setSaldo(getSaldo() - taxa);
	
	}
	
	
	
	// metodo sacar	
		public boolean sacar(float valor) {
			if ((getSaldo()+limite)>=valor) {
			setSaldo(getSaldo()-valor);
			return true;
			}
			return false;
	}
	
	
	
	// construtor cheio
		public Corrente(short numero, byte digito, short agencia, float saldo, Cliente cliente, float limite, float taxa) {
			super(numero, digito, agencia, saldo, cliente);
			this.limite = limite;
			this.taxa = taxa;
		}

		


	// construtor vazio	

	public Corrente() {
		super();
	}





	// to string
	@Override
	public String toString() {
		return "Corrente [limite=" + limite + ", taxa=" + taxa + ", toString()=" + super.toString() + "]";
	}



	public float getLimite() {
		return limite;
	}



	public void setLimite(float limite) {
		this.limite = limite;
	}



	public float getTaxa() {
		return taxa;
	}



	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}
	
	
	
	
	

	
	
	
	
	
}
