package br.com.lojaxpto.modelo;

public class Cliente {
	
	private String nome;
	private String email;
	
	
	//metodo para o teste get documentos
	public String getDocumentos() {
		return null;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	//construtor cheio
	public Cliente(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}
	//construtor vazio
	public Cliente() {
		super();
	}
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", email=" + email + "]";
	}
	
	
	
	
	

}
