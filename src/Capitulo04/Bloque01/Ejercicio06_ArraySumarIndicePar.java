package Capitulo04.Bloque01;

/*
 * 6º.- Realiza un ejercicio que inicialice un array de 150
 * elementos enteros al azar entre 0 y 100. Debes mostrar al
 * usuario la suma de los elementos cuyo índice sea par.
*/

public class Ejercicio06_ArraySumarIndicePar {

	public static void main(String[] args) {
		int numeros[] = new int[150];
		int suma = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) Math.round(Math.random() * 100);
			System.out.print(numeros[i] + " ");
			if (i % 2 == 0) suma  += numeros[i];
		}
		
		System.out.println("\nLa suma es: " + suma);

	}

}
