package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteList {
	
	public static void main(String[] args) {
	
		// colection framework são usadas para manipulação de um conjunto de dados
		// são mais flexiveis do que os vetores - 
		//Alocação dinamica

		
		//classe list <tipode dado> = array<tipo de dado>
		List<String> lista = new ArrayList<String>();
		lista.add("DBA");
		lista.add("Estagiario");
		lista.add("Dev");
		lista.add("DBA");
		lista.add("Analista");

		
		System.out.println("Lista Original : " + lista);
		System.out.println("Segundo elemento: " + lista.get(1));
		lista.remove(3);
		System.out.println("Lista sem o 4º elemento : " + lista);
		
		// ordenacão da lista // collection.reverse de z a a
		Collections.sort(lista);
		System.out.println("Lista Ordenada :" + lista);
		
		
		// percorra toda a lista e imprima os valores enquando o contador for menor que lista.size ++ ou +=1
		for (int contador = 0; contador < lista.size(); contador+=1) {
			System.out.println("Cargo : " + (contador+1) + " - " + lista.get(contador));
						
		}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
