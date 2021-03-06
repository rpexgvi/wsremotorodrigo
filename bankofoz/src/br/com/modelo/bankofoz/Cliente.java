package br.com.modelo.bankofoz;

import br.com.modelo.bankofoz.util.PadraoBasico;

public class Cliente implements PadraoBasico {
	
	
	// atributos privados
	private	int id;
	private String nome;
	private String cpf;
	private String fones;
	
	// getter setter
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getFones() {
		return fones;
	}

	public void setFones(String fones) {
		this.fones = fones;
	}

	
	
	// construotor vazio
	public Cliente() {
		super();
	}

	//construtor cheio
	public Cliente(int id, String nome, String cpf, String fones) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.fones = fones;
	}

	//to string - boa pratica
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", fones=" + fones + "]";
	}

	@Override // pode incluir nome + telefone
	public String getResumo() {
		// TODO Auto-generated method stub
		return nome + "-" + fones;
	}
	
	
	
	
	
	
	
	
	
	

}
