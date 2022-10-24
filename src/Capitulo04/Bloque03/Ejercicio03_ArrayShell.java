package Capitulo04.Bloque03;

/*
 * 3º.- Realiza un ejercicio que inicialice un array de 150 elementos
 * enteros al azar entre 0 y 1.000. Una vez que lo hayas conseguido
 * debes realizar implementar el algoritmo de ordenación llamado
 * "Shell", con el objetivo de ordenar el array completamente.
*/

public class Ejercicio03_ArrayShell {

	public static void main(String[] args) {
		int numeros[] = new int[150];
		int num;
		boolean permut;
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) Math.round(Math.random() * 1000);
			System.out.print(numeros[i] + " ");
		}
		
		System.out.println();
		
		for (int i = numeros.length / 2; i != 0; i /= 2) {
			permut = true;
			while (permut == true){
				permut = false;
				for (int j = i; j < numeros.length; j++) {
					if (numeros[j - i] > numeros[j]) {
						num = numeros[j];
						numeros[j] = numeros[j - i];
						numeros[j - i] = num;
						permut = true;
					}
				}
			}
		}
		
		for (int i = 0; i < numeros.length; i++)
			System.out.print(numeros[i] + " ");

	}

}
