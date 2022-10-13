package Capitulo04.Bloque01;

/*
 * 3º.- Realiza un ejercicio que inicialice un array de 150
 * elementos enteros al azar entre 0 y 100. Después de su
 * inicialización debéis imprimir el array en orden inverso.
*/

public class Ejercicio03_ArrayInverso {

	public static void main(String[] args) {
		int numeros[] = new int[150];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) Math.round(Math.random() * 100);
			System.out.print(numeros[i] + " ");
		}
		
		System.out.println("");
		
		for (int i = numeros.length - 1; i >= 0; i--) {
			System.out.print(numeros[i] + " ");
		}

	}

}
