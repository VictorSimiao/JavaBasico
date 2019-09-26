package javaBasico.formatacaoNumero;

public class Numero {

	public static void main(String[] args) {
		Padrao padrao = new Padrao(2553.33);
		System.out.println("----Números decimais genéricos------");
		System.out.println("Número Brasileiro: "+padrao.gerarPadraoBR(padrao.getValor()));
		System.out.println("Número Americano: "+padrao.gerarPadraoEUA(padrao.getValor()));
		System.out.println("\n----Formato de moedas -----");
		System.out.println("Valor Br "+padrao.gerarMoedaBr(padrao.getValor()));
		System.out.println("Valor EUA "+padrao.gerarMoedaAmericana(padrao.getValor()));
	}

}
