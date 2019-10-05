package javaBasico.listaOrdenada.comComparator;

public class Produto {
	private String codigo;
	private String descricao;
	private Double valor;
	
	public Produto(String codigo,String descricao, double valor) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", descricao=" + descricao + ", valor=" + valor + "]";
	}
	
	
	
	
}
