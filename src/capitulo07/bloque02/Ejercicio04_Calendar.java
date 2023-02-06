package capitulo07.bloque02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

public class Ejercicio04_Calendar {

	private static Calendar calendar = Calendar.getInstance();
	private static Date parsedDate = null;

	public static void main(String[] args) {
		askForDate(); // Introducción de la fecha
		calendar.setTime(parsedDate); // Creación del Calendar
		showCalendarFields(); // Muestra de campos
		System.out.println();
		addDates(); // Obtención de nuevas fechas
	}
	
	/**
	 * Método para pedir la fecha
	 */
	public static void askForDate() {
		String date = JOptionPane.showInputDialog("Introduzca una fecha (dd/MM/yyyy):");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // Objeto para formatear la fecha
		try {
			parsedDate = sdf.parse(date); // Formateo de la fecha
		} catch (ParseException e) {
			System.out.println ("La fecha introducida no tiene el formato correcto (dd/MM/yyyy).");
		}
	}
	
	/**
	 * Método para mostrar los campos del Calendar
	 */
	public static void showCalendarFields() {
		System.out.println("Año:\t\t" + (parsedDate.getYear() + 1900) + "\t" + calendar.get(Calendar.YEAR));
		System.out.println("Mes:\t\t" + (parsedDate.getMonth() + 1) + "\t" + (calendar.get(Calendar.MONTH) + 1));
		System.out.println("Día:\t\t" + parsedDate.getDate() + "\t" + calendar.get(Calendar.DATE));
		System.out.println("Hora:\t\t" + parsedDate.getHours() + "\t" + calendar.get(Calendar.HOUR));
		System.out.println("Minuto:\t\t" + parsedDate.getMinutes() + "\t" + calendar.get(Calendar.MINUTE));
		System.out.println("Segundo:\t" + parsedDate.getSeconds() + "\t" + calendar.get(Calendar.SECOND));
	}
	
	/**
	 * Método para obtener nuevas fechas
	 */
	public static void addDates() {
		calendar.add(Calendar.DATE, 3);
		System.out.println("Tres días más: " + calendar.getTime());
		calendar.add(Calendar.WEEK_OF_MONTH, -2);
		System.out.println("Dos semanas menos: " + calendar.getTime());
		calendar.add(Calendar.DATE, 300);
		System.out.println("Trescientos días más: " + calendar.getTime());
		calendar.add(Calendar.YEAR, 4);
		System.out.println("Cuatro años más: " + calendar.getTime());
	}

}
