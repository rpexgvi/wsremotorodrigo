package br.com.gama.modelo;

public class Turma {

	//atributo
	private String sigla;
	private String periodo;
	private Curso curso; //referencia a classe Curso
	private Aluno aluno; //referencia a classe Aluno
	private Professor professor; //referencia a classe Professor
	
	
	
	//construtor vazio
	
	
	public Turma() {
		super();
	}

	//construtor cheio
		
	
	public Turma(String sigla, String periodo, Curso curso, Aluno aluno, Professor professor) {
		super();
		this.sigla = sigla;
		this.periodo = periodo;
		this.curso = curso;
		this.aluno = aluno;
		this.professor = professor;
	}

	//get resumo
	
	public String getResumo() {
		return
				"Aluno: " + aluno.getNome() + 
				"\nProfessor " + professor.getNome() + 
				"\nCurso"  + curso.getDescricao() + 
				"\nTurma" + sigla;
		
	}
	
	// to string
	@Override
	public String toString() {
		return "Turma [sigla=" + sigla + ", periodo=" + periodo + ", curso=" + curso + ", aluno=" + aluno
				+ ", professor=" + professor + "]";
	}
	
	
	//get e set
	
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	
	
	
	
}
