package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<Aula>();
	private Set<Aluno> alunos = new HashSet<Aluno>();

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		// Devolve uma c?pia da lista imutavel
		return Collections.unmodifiableList(aulas);
	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public void adiciona(Aula aula) {
		aulas.add(aula);
	}

	public int getTempoTotal() {

		int tempoTotal = 0;

		for (Aula aula : aulas) {
			tempoTotal += aula.getTempo();
		}

		return tempoTotal;
	}

	public void matricular(Aluno aluno) {
		this.alunos.add(aluno);
	}
	
}
