package javaBasico.formatacaoNumero;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;


public class MascaraNumero {

	public static void main(String[] args) {
	System.out.println("Quatro casas para números inteiros e três para decimais"); 
	DecimalFormat df = new DecimalFormat("0000.000");
	String result  = df.format(222.3);
	System.out.println(result);
	
	System.out.println("Adicionado estilo(Separador) a minha formatação");
	DecimalFormat dfMod = new DecimalFormat("00000.000");
	DecimalFormatSymbols dfs = new DecimalFormatSymbols();
	dfs.setDecimalSeparator('-');
	dfMod.setDecimalFormatSymbols(dfs);
	String resultado = dfMod.format(29708.120);
	System.out.println("Exemplo Cep: "+resultado);
	}

}
