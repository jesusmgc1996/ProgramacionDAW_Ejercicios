package Capitulo04.Bloque03;

/*
 * 2º.- Realiza un ejercicio que inicialice un array de 150 elementos
 * enteros al azar entre 0 y 1.000. Una vez que lo hayas conseguido
 * debes realizar implementar el algoritmo de ordenación llamado
 * "Inserción directa", con el objetivo de ordenar el array completamente.
*/

public class Ejercicio02_ArrayInsercionDirecta {

	public static void main(String[] args) {
		int numeros[] = new int[150];
		int num, j;
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) Math.round(Math.random() * 1000);
			System.out.print(numeros[i] + " ");
		}
		
		System.out.println();
		
		for (int i = 1; i < numeros.length; i++) {
			num = numeros[i];
			for (j = i; j > 0 && numeros[j - 1] > num; j--) {
				numeros[j] = numeros [j - 1];
			}
			numeros[j] = num;
		}
		
		for (int i = 0; i < numeros.length; i++)
			System.out.print(numeros[i] + " ");

	}

}
