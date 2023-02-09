package Examenes.examen09022023;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Ejercicio05 {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH.mm.ss");
		Date fecha = null;
		Calendar calendar = Calendar.getInstance();
		try {
			fecha = sdf.parse("2023-02-09 10.30.27");
		} catch (ParseException e) {
			System.out.println ("La fecha introducida no tiene el formato correcto (yyyy-MM-dd HH.mm.ss).");
		}
		fecha.setDate(fecha.getDate() - 14);
		System.out.println("Fecha con dos semanas menos: " + fecha);
		calendar.set(Calendar.YEAR, (fecha.getYear() + 1900));
		calendar.set(Calendar.MONTH, fecha.getMonth());
		calendar.set(Calendar.DAY_OF_MONTH, fecha.getDate());
		calendar.set(Calendar.HOUR_OF_DAY, fecha.getHours());
		calendar.set(Calendar.MINUTE, fecha.getMinutes());
		calendar.set(Calendar.SECOND, fecha.getSeconds());
		Calendar horaGalapagos = Calendar.getInstance(TimeZone.getTimeZone("Pacific/Galapagos"));
		Calendar horaLisboa = Calendar.getInstance(TimeZone.getTimeZone("Europe/Lisbon"));
		int dif = Math.abs(horaGalapagos.get(Calendar.HOUR_OF_DAY) - horaLisboa.get(Calendar.HOUR_OF_DAY));
		System.out.println("\nLa diferencia horaria entre las islas Galapagos y Lisboa es: " + dif);
	}

}
