package capitulo06.bloque01;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Ejercicio01_ListaInteger {

	public static void main(String[] args) {
		// Declaración de la lista de Integers
		List<Integer> numbers = new ArrayList<Integer>();
		int opt;
		
		// Bucle para ejecutar el programa
		do {
			opt = menu();
			if (opt == 1) createList(numbers);
			if (opt == 2) calcs(numbers);
			if (opt == 3) addNumbers(numbers);
			if (opt == 4) deleteNumbers(numbers);
			if (opt == 5)
				for (Integer n: numbers)
					System.out.print(n.toString() + " ");
		} while (opt != 0);
	}
	
	// Método para mostrar el menú
	public static int menu() {
		int opt = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la opción deseada:\n0. Abandonar el programa.\n"
				+ "1. Crear aleatoriamente la lista de valores.\n2. Calcular suma, media, mayor y menor.\n"
				+ "3. Agregar una cantidad de valores nuevos.\n4. Eliminar elementos cuyo valor esté en un intervalo.\n"
				+ "5. Imprimir la lista."));
		return opt;
	}
	
	// Método para añadir números a la lista
	public static void createList (List<Integer> numbers) {
		int length = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la longitud de la lista:"));
		int min = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el valor mínimo:"));
		int max = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el valor máximo:"));
		numbers.clear();
		for (int i = 0; i < length; i++)
			numbers.add((int) Math.round(Math.random() * (max - min) + min));
	}
	
	// Método para realizar los cálculos
	public static void calcs (List<Integer> numbers) {
		int sum = 0;
		int min = numbers.get(0).intValue();
		int max = numbers.get(0).intValue();
		float mean;
		for (Integer n: numbers) {
			sum += n.intValue();
			if (n.intValue() < min) min = n.intValue();
			if (n.intValue() > max) max = n.intValue();
		}
		mean = (float) sum / numbers.size();
		System.out.println("\nLa suma es: " + sum + "\nLa media es: " + mean
				+ "\nEl número menor es: " + min + "\nEl número mayor es: " + max);
	}
	
	// Método para añadir más números a la lista
	public static void addNumbers (List<Integer> numbers) {
		int length = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad de números nuevos que quiere agregar:"));
		int pos = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la posición en la que quiere añadirlos:"));
		int min = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el valor mínimo:"));
		int max = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el valor máximo:"));
		for (int i = 0; i < length; i++)
			numbers.add(pos, (int) Math.round(Math.random() * (max - min) + min));
	}
	
	// Método para borrar números de la lista
	public static void deleteNumbers (List<Integer> numbers) {
		int count = 0;
		int min = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el valor mínimo:"));
		int max = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el valor máximo:"));
		for (int i = numbers.size() - 1; i >= 0; i--)
			if (numbers.get(i).intValue() >= min && numbers.get(i).intValue() <= max) {
				numbers.remove(i);
				count++;
			}
		System.out.println("\nLa cantidad de números eliminados es: " + count);
	}

}
