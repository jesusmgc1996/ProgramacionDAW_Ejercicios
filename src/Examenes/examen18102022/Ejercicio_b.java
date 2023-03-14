package Examenes.examen18102022;

import javax.swing.JOptionPane;

/*
 * Crea una clase con un método “main” que cree 10 variables enteras.
 * Los valores deben ser números enteros al azar comprendidos entre
 * dos límites, que deben ser preguntados al usuario. El límite
 * inferior debe ser negativo y el superior debe ser positivo. Si el
 * usuario introduce los valores de forma incorrecta debemos volver
 * a pedirle que los introduzca.
*/

public class Ejercicio_b {

	public static void main(String[] args) {
		int num, limiteSup, limiteInf; 
		String str; // Se inicializan las variables.
		
		do {
			str = JOptionPane.showInputDialog("Introduzca el límite inferior:"
					+ "\n(debe ser negativo)");
			limiteInf = Integer.parseInt(str);
			// Se pide por pantalla un número negativo para el límite inferior.
			if (limiteInf >= 0)
				JOptionPane.showMessageDialog(null, "El número introducido no "
						+ "es correcto."); // Error si el número es positivo o 0.
		} while (limiteInf >= 0);
		// Se repite el bucle mientras el número es positivo o 0.
		
		do {
			str = JOptionPane.showInputDialog("Introduzca el límite superior:"
					+ "\n(debe ser positivo)");
			limiteSup = Integer.parseInt(str);
			// Se pide por pantalla un número positivo para el límite superior.
			if (limiteSup <= 0)
				JOptionPane.showMessageDialog(null, "El número introducido no "
						+ "es correcto."); // Error si el número es negativo o 0.
		} while (limiteSup <= 0);
		// Se repite el bucle mientras el número es negativo o 0.
		
		for (int i = 0; i < 10; i++) {
			num = (int) Math.round(Math.random() * (limiteSup - limiteInf)
					+ limiteInf); // Se generan los números.
			System.out.print(num + " "); // Se muestran por pantalla.
		}
		
	}

}
