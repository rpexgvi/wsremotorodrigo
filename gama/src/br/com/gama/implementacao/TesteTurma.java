package br.com.gama.implementacao;

import br.com.gama.modelo.Aluno;
import br.com.gama.modelo.Curso;
import br.com.gama.modelo.Endereco;
import br.com.gama.modelo.Professor;
import br.com.gama.modelo.Turma;

public class TesteTurma {
	
	
	public static void main(String[] args) {
		
		Endereco endereco = new Endereco();
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		Curso curso = new Curso();
		Turma turma = new Turma();
		
		
		// preenchendo endereco - poderia usar joptiopane
		
		endereco.setLogradouro("Av abc");
		endereco.setNumero("655 s");
		endereco.setComplemento("viela 2");
		endereco.setBairro("Itaquera");
		endereco.setCidade("S?o Paulo");
		endereco.setUf("SP");
		endereco.setCep("12121-123");
		
		// preenchendo curso - poderia usar joptiopane
		
		curso.setAtivo(true);
		curso.setDescricao("Java");
		curso.setDuracao((byte) 6);
		curso.setSigla("JV");
		curso.setValor(1000);
		
		// preenchendo Aluno - poderia usar joptiopane
		
		aluno.setEmail("rodrigo@gmail.com");
		aluno.setEndereco(endereco);
		aluno.setFone("9999-9999");
		aluno.setMatricula(1234);
		aluno.setNome("Rodrigo");
		
		
		// preenchendo Professor - poderia usar joptiopane
		
		professor.setArea("Exatas");
		professor.setEndereco(endereco);
		professor.setFormacao("Engenharia");
		professor.setNome("Paulo");
		
		
		// preenchendo Turma - poderia usar joptiopane
		
		turma.setAluno(aluno);
		turma.setCurso(curso);
		turma.setPeriodo("Vespertino");
		turma.setProfessor(professor);
		turma.setSigla("J01");
		
		
		// exibindo
		System.out.println(turma.toString());
		System.out.println("Resumo Professor: " + turma.getProfessor().getResumo());
		turma.getCurso().atualizarValor(10);
		System.out.println("valor atualizado " + turma.getCurso().getValor());
		System.out.println("usuario Aluno " + turma.getAluno().getUsuario());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
