package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {

	public static void main(String[] args) {
		
		Aula a1 = new Aula("Revisitando ArrayLists", 14);
		
		Aula a2 = new Aula("Lista de objetos", 15);
		
		Aula a3 = new Aula("Relacionamento de listas e objetos", 15);
		
		ArrayList<Aula> aulas = new ArrayList<Aula>();
		
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		// Comaprando atraves do mpetodo compareTo implementado na classe Aula
		//Collections.sort(aulas);
		
		// Criando uma forma de ordenar diferente da implementada na classe Aula
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		
		System.out.println(aulas);
		
		
		
	}
	
}
