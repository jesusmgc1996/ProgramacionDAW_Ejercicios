package Capitulo04.Bloque03;

/*
 * 1º.- Realiza un ejercicio que inicialice un array de 150 elementos
 * enteros al azar entre 0 y 1.000. Una vez que lo hayas conseguido
 * debes realizar implementar el algoritmo de ordenación llamado
 * "Burbuja", con el objetivo de ordenar el array completamente.
*/

public class Ejercicio01_ArrayBurbuja {

	public static void main(String[] args) {
		int numeros[] = new int[150];
		int num, cont = 0;
		boolean permut = true;
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) Math.round(Math.random() * 1000);
			System.out.print(numeros[i] + " ");
		}
		
		System.out.println();
		
		while (permut == true) {
			permut = false;
			cont++;
			for (int i = 0; i < numeros.length - cont; i++) {
				if (numeros[i] > numeros[i + 1]) {
					num = numeros[i];
					numeros[i] = numeros[i + 1];
					numeros[i + 1] = num;
					permut = true;
				}
			}
		}
		
		for (int i = 0; i < numeros.length; i++)
			System.out.print(numeros[i] + " ");

	}

}
