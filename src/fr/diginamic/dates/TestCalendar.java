package fr.diginamic.dates;

import java.util.Date;
import java.util.Locale;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TestCalendar {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, 2016);
		calendar.set(Calendar.MONTH, Calendar.MAY);
		calendar.set(Calendar.DAY_OF_MONTH, 19);
		calendar.set(Calendar.HOUR_OF_DAY, 23);
		calendar.set(Calendar.MINUTE, 59);
		calendar.set(Calendar.SECOND, 30);

		Date date = calendar.getTime();

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String formattedDate = sdf.format(date);
		System.out.println("Date au 19 mai 2016 à 23:59:30 : " + formattedDate);

		sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		formattedDate = sdf.format(date);
		System.out.println("Date du jour (format par défaut) : " + formattedDate);

		sdf = new SimpleDateFormat("EEEE, d MMMM yyyy HH:mm:ss", Locale.FRENCH);
		formattedDate = sdf.format(date);
		System.out.println("Date du jour (en français) : " + formattedDate);

		sdf = new SimpleDateFormat("EEEE, d MMMM yyyy HH:mm:ss", new Locale("ru", "RU"));
		formattedDate = sdf.format(date);
		System.out.println("Date du jour (en russe) : " + formattedDate);

		sdf = new SimpleDateFormat("EEEE, d MMMM yyyy HH:mm:ss", Locale.CHINESE);
		formattedDate = sdf.format(date);
		System.out.println("Date du jour (en chinois) : " + formattedDate);

		sdf = new SimpleDateFormat("EEEE, d MMMM yyyy HH:mm:ss", Locale.GERMAN);
		formattedDate = sdf.format(date);
		System.out.println("Date du jour (en allemand) : " + formattedDate);

	}
}
