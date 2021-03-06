package br.com.lojaxpto.modelo;


// Extend a classe pai cliente
public class PessoaFisica extends Cliente {

	private String cpf;
	private String rg;

	//metodo[
	
	public String getDocumentos() {
		
		return cpf + " - " + rg;
	}
	
	
	// getters setters
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	// construtor vazio
	public PessoaFisica() {
		super();
	}

	// construtor cheio 
	
	public PessoaFisica(String nome, String email, String cpf, String rg) {
		super(nome, email);
		this.cpf = cpf;
		this.rg = rg;
	}




	// deve chamar o to string da super classe
	@Override
	public String toString() {
		return "PessoaFisica [cpf=" + cpf + ", rg=" + rg + ", " + super.toString() +   "]";
	}
	
	
	
	
	
}
