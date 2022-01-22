package br.com.alura;

public class Aluno {

	private String nome;

	private String cpf;

	private int ra;

	public Aluno(String nome, String cpf, int ra) {
		this.nome = nome;
		this.cpf = cpf;
		this.ra = ra;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public int getRa() {
		return ra;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", cpf=" + cpf + ", ra=" + ra + "]";
	}

}
