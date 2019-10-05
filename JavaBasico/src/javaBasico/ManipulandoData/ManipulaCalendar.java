package javaBasico.ManipulandoData;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ManipulaCalendar {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();// Obtém a instancia do Calendar
		cal.set(2019, 8, 26);// ano, mes, dia

		System.out.println("Somando um ano: ");
		cal.add(Calendar.YEAR, 1);
		cal.add(Calendar.MINUTE, -45);// Subtraindo 45 minutos
		Date data = cal.getTime();// Transformando para data
		System.out.println(data);

		System.out.println("\nFormatando data(DateFormat)");
		System.out.println("Padrão Curto");
		DateFormat dt = DateFormat.getDateInstance(DateFormat.SHORT);
		String dataCurta = dt.format(data);// Recebe uma data e retorna uma String
		System.out.println(dataCurta);

		System.out.println("\nPadrão Médio");
		DateFormat dt2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		String dataCurta2 = dt2.format(data);// Recebe uma data e retorna uma String
		System.out.println(dataCurta2);

		System.out.println("\nPadrão Longo");
		DateFormat dt3 = DateFormat.getDateInstance(DateFormat.LONG);
		String dataCurta3 = dt3.format(data);// Recebe uma data e retorna uma String
		System.out.println(dataCurta3);

		System.out.println("\nFormatando do meu jeito");

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String datamodel = sdf.format(data);
		System.out.println(datamodel);

		System.out.println("De String para Data");
		String data1 = "2019-09-26";
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date dat = sdf1.parse(data1);
			System.out.println(dat);
		} catch (ParseException e) {

			e.printStackTrace();
		}

	}

}
