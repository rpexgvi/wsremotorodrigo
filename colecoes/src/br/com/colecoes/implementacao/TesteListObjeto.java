package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.List;

import br.com.colecoes.beans.Cargo;

public class TesteListObjeto {
	
	public static void main(String[] args) {
		
		
		List<Cargo> lista = new ArrayList<Cargo>();
		
		lista.add(new Cargo("DBA","JR",5000));
		lista.add(new Cargo("ESTAGIARIO","PL",3000));
		lista.add(new Cargo("DEV","PL",15000));
		lista.add(new Cargo("DBA","SR",15500));
		lista.add(new Cargo("ANALISTA","JR",5500));
		
		System.out.println("Lista Original" + lista);
		
		/*
		for (int contador = 0; contador < lista.size(); contador++) {
			System.out.println("Objeto " + (contador+1));
			System.out.println("Cargo : " + lista.get(contador).getNome());
			System.out.println("Nivel: " + lista.get(contador).getNivel());
			System.out.println("Salario " + lista.get(contador).getSalario());
			
		}
		*/
		
		//Exibir total de todos os salarios
		//Exibir a media
		//Exibir quantos cargos do nivel jr existem
		
		
		
		float total=0;
		int qtdeJr=0;
		for (int contador = 0; contador < lista.size(); contador++) {
			
			System.out.println("Objeto " + (contador+1));
			System.out.println("Cargo : " + lista.get(contador).getNome());
			System.out.println("Nivel: " + lista.get(contador).getNivel());
			System.out.println("Salario " + lista.get(contador).getSalario());
			total+=lista.get(contador).getSalario();
			
			if (lista.get(contador).getNivel().toUpperCase().equals("JR")) {
				qtdeJr++;
			}
		}
		
		System.out.println("Total Salario : " + total);
		System.out.println("Media Salario : " + (total/lista.size()));
		System.out.println("Cargos JRs :  " + qtdeJr);
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
