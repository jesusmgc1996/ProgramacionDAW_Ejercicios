package Examenes.examen18102022;

/*
 * Crea una clase con un método “main” que cree 10 variables enteras.
 * Deben ser números enteros al azar comprendidos entre 0 y 100.
 * Muestra Todos los números en pantalla. Calcula la suma de
 * los múltiplos de 5 y la media de los números impares.
*/

public class Ejercicio_a {

	public static void main(String[] args) {
		int num, sumaMultiplos = 0, sumaImpar = 0, cont = 0;
		float media; // Se inicializan las variables.
		
		
		for (int i = 0; i < 10; i++) {
			num = (int) Math.round(Math.random() * 100); // Se generan los números.
			System.out.print(num + " "); // Se muestran por pantalla.
			if (num % 5 == 0)
				sumaMultiplos += num; // Se suman los múltiplos de 5.
			if (num % 2 != 0) {
				sumaImpar += num; // Se suman los números impares.
				cont++;
			}
		}
		
		media = sumaImpar / (float) cont; // Se calcula la media de los números impares.
		
		System.out.println("\nLa suma de los múltiplos de 5 es: " + sumaMultiplos
				+ "\nLa media de los números impares es: " + media );
		// Se muestra la suma de los múltiplos de 5 y la media de los impares.
		
	}

}
