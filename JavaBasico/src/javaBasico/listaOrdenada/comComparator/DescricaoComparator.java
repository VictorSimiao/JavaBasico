package javaBasico.listaOrdenada.comComparator;

import java.util.Comparator;

public class DescricaoComparator implements Comparator<Produto> {

	@Override
	public int compare(Produto produto1, Produto produto2) {
		if (produto1.getDescricao().equals(produto2.getDescricao())) {
			return 0;
		}
		if (produto1.getDescricao().compareTo(produto2.getDescricao()) > 0) {
			return 1;
		}
		return -1;
	}

}
