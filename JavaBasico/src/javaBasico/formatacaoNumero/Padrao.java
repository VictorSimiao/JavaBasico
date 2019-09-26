package javaBasico.formatacaoNumero;

import java.text.NumberFormat;
import java.util.Locale;

public class Padrao {
	private double valor;

	Padrao(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	/** Recebe um valor double, formata para o padrão Br e retorna uma string */
	public String gerarPadraoBR(double valor) {
		NumberFormat nf = NumberFormat.getNumberInstance();
		return nf.format(valor);
	}

	/** Recebe um valor double, formata para o padrao EUA e retorna uma String */
	public String gerarPadraoEUA(double valor) {
		NumberFormat nf = NumberFormat.getNumberInstance(new Locale("en", "US"));
		return nf.format(valor);
	}
	/**Recebe um valor double, formata para o padrao de moeda(Real)BR e retorna uma String*/
	public String gerarMoedaBr(double valor) {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		return nf.format(valor);
	}
	/**Recebe um valor double, formata para o padrao de moeda(Dolar)EUA e retorna uma String*/
	public String gerarMoedaAmericana(double valor) {
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
		return nf.format(valor);
	}

}
