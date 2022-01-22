package br.com.alura;

import java.util.Collections;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando coleções", "Daniel Nascimento");

		javaColecoes.adiciona(new Aula("Aula sobre Lista", 20));

		javaColecoes.adiciona(new Aula("Aula sobre Set", 40));

		Aluno a1 = new Aluno("Daniel Batista", "111-111-111-11", 123);
		Aluno a2 = new Aluno("Marco Antonio", "222-222-222-22", 321);

		javaColecoes.matricular(a1);
		javaColecoes.matricular(a2);

		System.out.println(javaColecoes.getAlunos());

	}

}
