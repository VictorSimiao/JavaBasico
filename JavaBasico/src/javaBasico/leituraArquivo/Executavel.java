package javaBasico.leituraArquivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Executavel {

	public static void main(String[] args) throws IOException {
		String dados = lerPorBufferdReader();
		System.out.println("*****Lendo pelo Bufferd****");
		System.out.println(dados);
		System.out.println("\n****Lendo pelo Scanner ****");
		String texto = lerPorScanner();
		System.out.println(texto);

	}

	/**
	 * Método cridado para ler dados de um arquivo texto, Ultilizando
	 * BufferedReader. Os construtores FileReader sempre usam a codificação padrão
	 * da plataforma, que não é uma boa ideia (pode prejudicar a leitura).
	 * 
	 * @return String de dados obtido no arquivo.
	 * @throws IOException
	 */

	public static String lerPorBufferdReader() throws IOException {
		try (BufferedReader buffer = new BufferedReader(new FileReader("arquivo.txt"))) {
			String dados = "";
			String linha;
			while ((linha = buffer.readLine()) != null) {// readline retorna null caso não tenha mais nada para ler
				dados += linha + "\n";
			}
			return dados;
		}
	}

	/**
	 * Método cridado para ler dados de um arquivo texto, Ultilizando Scanner. Posso
	 * escolher qual codificação eu desejo ler.
	 * 
	 * @return
	 * @throws IOException
	 */

	public static String lerPorScanner() throws IOException {
		String dados = "";
		try (Scanner texto = new Scanner(new File("arquivo.txt"), "UTF-8")) {
			while (texto.hasNextLine()) {
				String linha = texto.nextLine();
				dados += linha + '\n';
			}
		}
		return dados;
	}

}
