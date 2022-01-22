package br.com.alura;

public class TestaCurso {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando coleções", "Daniel Nascimento");

		//javaColecoes.getAulas().add(new Aula("Auka 01", 20));

		javaColecoes.adiciona(new Aula("Aula sobre Lista", 20));
		
		System.out.println(javaColecoes.getAulas());
		
	}

}
