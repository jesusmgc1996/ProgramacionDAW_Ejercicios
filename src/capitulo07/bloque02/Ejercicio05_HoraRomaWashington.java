package capitulo07.bloque02;

import java.util.Calendar;
import java.util.TimeZone;

public class Ejercicio05_HoraRomaWashington {

	public static void main(String[] args) {
		Calendar romeTime = Calendar.getInstance(TimeZone.getTimeZone("Europe/Rome"));
		Calendar washingtonTime = Calendar.getInstance(TimeZone.getTimeZone("America/New_York"));
		int dif = Math.abs(romeTime.get(Calendar.HOUR_OF_DAY) - washingtonTime.get(Calendar.HOUR_OF_DAY));
		System.out.println("La diferencia horaria entre Roma y Washington es: " + dif);
	}

}
