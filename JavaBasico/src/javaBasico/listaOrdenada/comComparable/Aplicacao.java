package javaBasico.listaOrdenada.comComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aplicacao {

	public static void main(String[] args) {
		List<Aluno> alunos = new ArrayList<Aluno>();

		Aluno a1 = new Aluno("Manoel", "Brasileiro", 18, "01");
		Aluno a2 = new Aluno("Maria", "Brasileiro", 22, "02");
		Aluno a3 = new Aluno("João", "Brasileiro", 27, "03");
		Aluno a4 = new Aluno("Eduardo", "Brasileiro", 25, "04");
		Aluno a5 = new Aluno("Fernanda", "Brasileiro", 18, "05");
		Aluno a6 = new Aluno("Cris", "Brasileiro", 18, "05");

		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4);
		alunos.add(a5);
		alunos.add(a6);
		
		Collections.sort(alunos);
		
		for (Aluno aluno : alunos) {
			System.out.println(aluno);
		}
	}

}
