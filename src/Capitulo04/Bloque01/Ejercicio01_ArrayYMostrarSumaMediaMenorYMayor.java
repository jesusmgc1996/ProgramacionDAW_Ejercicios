package Capitulo04.Bloque01;

/*
 * 1º.- Realiza un ejercicio que inicialice un array de 150
 * elementos enteros al azar entre 0 y 100. Debes mostrar el
 * array en pantalla y obtener la suma, la media, el menor y
 * el mayor de todos los números que aparecen en el array.
*/

public class Ejercicio01_ArrayYMostrarSumaMediaMenorYMayor {

	public static void main(String[] args) {
		int numeros[] = new int[150];
		int suma = 0, mayor = 0, menor = 0;
		float media;
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) Math.round(Math.random() * 100);
			System.out.print(numeros[i] + " ");
		}
		
		mayor = numeros[0];
		menor = numeros[0];
		
		for (int i = 0; i < numeros.length; i++) {
			suma += numeros[i];
			if (numeros[i] > mayor) mayor = numeros[i];
			if (numeros[i] < menor) menor = numeros[i];
		}
		
		media = suma / ((float) numeros.length);
		
		System.out.println("\nLa suma es: " + suma +
							"\nLa media es: " + media +
							"\nEl número mayor es: " + mayor +
							"\nEl número menor es: " + menor);

	}

}
