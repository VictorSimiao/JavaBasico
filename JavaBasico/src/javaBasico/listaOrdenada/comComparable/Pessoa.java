package javaBasico.listaOrdenada.comComparable;

public class Pessoa implements Comparable<Pessoa> {
	private String nome;
	private String nacionalidade;
	private int idade;

	public Pessoa(String nome, String nacionalidade, int idade) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", nacionalidade=" + nacionalidade + ", idade=" + idade ;
	}

	@Override
	public int compareTo(Pessoa o) {
		if (this.idade == o.idade) {
			return 0;
		}
		if (this.idade > o.idade) {
			return 1;
		}
		return -1;
	}

}
