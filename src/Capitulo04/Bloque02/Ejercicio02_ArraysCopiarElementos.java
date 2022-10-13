package Capitulo04.Bloque02;

/*
 * 2º.- Realiza un ejercicio que inicialice  arrays de 150
 * elementos enteros al azar entre 0 y 100. Debes crear un
 * tercer array, compuesto de la siguiente forma: en los
 * elementos de índice impar del tercer array debes copiar
 * los elementos de índice impar del primer array; en los
 * elementos de índice par del tercer array debes copiar
 * los elementos de índice par del segundo array.
*/

public class Ejercicio02_ArraysCopiarElementos {

	public static void main(String[] args) {
		int numeros[] = new int[150];
		int numeros2[] = new int[150];
		int numeros3[] = new int[150];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) Math.round(Math.random() * 100);
			System.out.print(numeros[i] + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < numeros2.length; i++) {
			numeros2[i] = (int) Math.round(Math.random() * 100);
			System.out.print(numeros2[i] + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < numeros3.length; i++) {
			if (i % 2 != 0) numeros3[i] = numeros[i];
			if (i % 2 == 0) numeros3[i] = numeros2[i];
			System.out.print(numeros3[i] + " ");
		}

	}

}
