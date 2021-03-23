package br.com.modelo.bankofoz;

public class Conta {
	
	// atributos privados
	private short numero;
	private byte digito;
	private short agencia;
	private float saldo;
	private Cliente cliente;
	
	
	public void creditarRendimento() {}
	public void debitarTaxa() {}
	public void aumentarLimite (float porcentagem) {}
	
	
	
	// metodo verificar saldo
	
		public float verificarSaldo() {
			
			return saldo;
			
		}
	
	
	// metodo sacar
	
	public boolean sacar(float valor) {
		if (valor<=saldo) {
			saldo-=valor;
			return true;
		}
		return false;
		
	}
	
	
		// metodo depositar
		
	public boolean depositar(float valor) {
		if (valor>0) {
			saldo+=valor;
			return true;
		}
		return false;
		
	}
		
		
	
	// get / set
	
	public short getNumero() {
		return numero;
	}

	public void setNumero(short numero) {
		this.numero = numero;
	}

	public byte getDigito() {
		return digito;
	}

	public void setDigito(byte digito) {
		this.digito = digito;
	}

	public short getAgencia() {
		return agencia;
	}

	public void setAgencia(short agencia) {
		this.agencia = agencia;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	// construtor vazio
	public Conta() {
		super();
	}

	// construtor cheio
	public Conta(short numero, byte digito, short agencia, float saldo, Cliente cliente) {
		super();
		this.numero = numero;
		this.digito = digito;
		this.agencia = agencia;
		this.saldo = saldo;
		this.cliente = cliente;
	}


	// to string retorno
	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", digito=" + digito + ", agencia=" + agencia + ", saldo=" + saldo
				+ ", cliente=" + cliente + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
