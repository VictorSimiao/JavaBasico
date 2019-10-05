package javaBasico.enums;

public class Executavel {

	public static void main(String[] args) {
		DiaDaSemana segunda = DiaDaSemana.SEGUNDA;
		System.out.print(segunda);
		System.out.println(" "+segunda.getNum());

		DiaDaSemana terca = DiaDaSemana.TERCA;
		System.out.print(terca);
		System.out.println(" "+terca.getNum());
	}

}
