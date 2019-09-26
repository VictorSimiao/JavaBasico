package javaBasico.formatacaoNumero;

public class Numero {

	public static void main(String[] args) {
		Padrao padrao = new Padrao(2553.33);
		System.out.println("----N�meros decimais gen�ricos------");
		System.out.println("N�mero Brasileiro: "+padrao.gerarPadraoBR(padrao.getValor()));
		System.out.println("N�mero Americano: "+padrao.gerarPadraoEUA(padrao.getValor()));
		System.out.println("\n----Formato de moedas -----");
		System.out.println("Valor Br "+padrao.gerarMoedaBr(padrao.getValor()));
		System.out.println("Valor EUA "+padrao.gerarMoedaAmericana(padrao.getValor()));
	}

}
