package javaBasico.ManipulandoData;

import java.text.NumberFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class ManipulaDateandTimeAPI {

	public static void main(String[] args) {
		String dataMarcante = "01/02/2015 07:00";

		LocalDateTime data1 = LocalDateTime.parse(dataMarcante, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		LocalDateTime dataAtual = LocalDateTime.now();

		Duration duracao = Duration.between(data1, dataAtual);
		NumberFormat nf = NumberFormat.getNumberInstance();

		System.out.println("Horas de Namoro: " + nf.format(duracao.toHours()));
		System.out.println("Dias de namoro: " + nf.format(duracao.toDays()));

		// Meses

		// Transformo meu LocalDateTime em LocalDate (data1.toLocalDate()) para
		// deconsiderar os minutos

		Period meses = Period.between(data1.toLocalDate(), dataAtual.toLocalDate());
		System.out.println("Meses: " + meses.toTotalMonths());// Retorna a quantidade de meses meses.toTotalMonths()
		
		
		//Semanas 
		
		System.out.println("Semanas: "+ChronoUnit.WEEKS.between(data1, dataAtual));
		
		//Anos
		System.out.println("Anos: "+ChronoUnit.YEARS.between(data1, dataAtual));
		
		
		
	}

}
