package javaBasico.listaOrdenada.comComparable;

public class Aluno extends Pessoa{
	private String matricula;
	
	public Aluno(String nome,String nacionalidade,int idade,String matricula) {
		super(nome, nacionalidade, idade);
		this.matricula = matricula;
				
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return super.toString()+ " matricula=" + matricula + "]";
	}

	
	
	
	
}
