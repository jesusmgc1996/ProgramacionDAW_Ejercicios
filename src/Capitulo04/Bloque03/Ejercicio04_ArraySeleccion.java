package Capitulo04.Bloque03;

/*
 * 4º.- Realiza un ejercicio que inicialice un array de 150 elementos
 * enteros al azar entre 0 y 1.000. Una vez que lo hayas conseguido
 * debes realizar implementar el algoritmo de ordenación llamado
 * "Selección", con el objetivo de ordenar el array completamente.
*/

public class Ejercicio04_ArraySeleccion {

	public static void main(String[] args) {
		int numeros[] = new int[150];
		int num, aux;
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) Math.round(Math.random() * 1000);
			System.out.print(numeros[i] + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < numeros.length - 1; i++) {
			aux = i;
			for (int j = i + 1; j < numeros.length; j++)
				if (numeros[j] < numeros[aux]) aux = j;
			num = numeros[i];
			numeros[i] = numeros[aux];
			numeros[aux] = num;
		}
		
		for (int i = 0; i < numeros.length; i++)
			System.out.print(numeros[i] + " ");

	}

}
