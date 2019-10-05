package javaBasico.listaOrdenada.comComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aplicacao {

	public static void main(String[] args) {
		List<Produto> produtos = new ArrayList<Produto>();
		
		Produto p1 = new Produto("01", "Caderno", 4.50);
		Produto p2 = new Produto("02", "Cabo", 1.58);
		Produto p3 = new Produto("03", "Borracha", 0.50);
		Produto p4 = new Produto("04", "Alicate", 3.55);
		
		produtos.add(p1);
		produtos.add(p2);
		produtos.add(p3);
		produtos.add(p4);
		
		Collections.sort(produtos, new DescricaoComparator());
		
		for (Produto produto : produtos) {
			System.out.println(produto);
		}
		
		
		
		
		
		
		
		
	}

}
