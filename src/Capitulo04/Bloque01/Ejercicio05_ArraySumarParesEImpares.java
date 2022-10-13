package Capitulo04.Bloque01;

/*
 * 5º.- Realiza un ejercicio que inicialice un array de 150
 * elementos enteros al azar entre 0 y 100. Debes obtener la
 * suma de los números pares y los impares en variables separadas.
*/

public class Ejercicio05_ArraySumarParesEImpares {

	public static void main(String[] args) {
		int numeros[] = new int[150];
		int sumaPar = 0, sumaImpar = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) Math.round(Math.random() * 100);
			System.out.print(numeros[i] + " ");
			if (numeros[i] % 2 == 0) sumaPar += numeros[i];
			else sumaImpar += numeros[i];
		}
		
		System.out.println("\nLa suma de los pares es: " + sumaPar +
				"\nLa suma de los impares es: " + sumaImpar);

	}

}
