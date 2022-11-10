package Capitulo04.bloque06;

/*
 * 1.- Realiza un programa que genere una apuesta aleatoria de la lotería primitiva.
 * Consiste en generar seis números y otro complementario entre 1 y 49 que no se
 * repitan. Ejemplo: Combinación: 2 14 20 37 39 41 complementario: 13. Utiliza un
 * array, en el ejemplo expuesto sería un array de 7 posiciones correspondiendo la
 * séptima posición al "complementario" de la loteria.
*/

public class Ejercicio01_LoteríaPrimitiva {

	public static void main(String[] args) {
		int array[] = nonRepeteableArray(7, 1, 49);
		sortArray(array);
		showArray(array);
	}
	
	public static int[] nonRepeteableArray (int length, int lowerLim, int upperLim) {
		int array[] = new int[length];
		for (int i = 0; i < array.length; i++) {
			int num;
			do {
				num = utils.Utils.obtenerNumeroAzar(lowerLim, upperLim);
			} while (checkRepetition(array, num));
			array[i] = num;
		}
		return array;
	}
	
	public static boolean checkRepetition (int array[], int num) {
		for (int i = 0; i < array.length; i++)
			if (array[i] == num) return true;
		return false;
	}
	
	public static void sortArray (int array[]) {
		boolean permut;
		do {
			permut = false;
			for (int i = 0; i < array.length - 2; i++)
				if (array[i+1] < array[i]) {
					int aux = array[i+1];
					array[i+1] = array[i];
					array[i] = aux;
					permut = true;
				}
		} while (permut);
	}
	
	public static void showArray (int array[]) {
		System.out.print("Combinación: ");
		for (int i = 0; i < array.length - 1; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\nComplementario: " + array[6]);
	}

}
