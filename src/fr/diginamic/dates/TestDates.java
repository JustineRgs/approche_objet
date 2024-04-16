package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat formattage = new SimpleDateFormat("dd/MM/yyyy");
		String formattedDate = formattage.format(date);
		System.out.println(formattedDate);

		Date date2 = new Date(116, 4, 19, 23, 59, 30);
		SimpleDateFormat formattage2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String formattedDate2 = formattage2.format(date2);
		System.out.println("Date du 19/05/2016 à 23:59:30 : " + formattedDate2);

		String formattedDate3 = formattage2.format(date);
		System.out.println("Date et heure actuelle : " + formattedDate3);

	}

}
