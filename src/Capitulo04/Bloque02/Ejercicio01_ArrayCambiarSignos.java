package Capitulo04.Bloque02;

/*
 * 1º.- Realiza un ejercicio que inicialice un array de 150
 * elementos enteros al azar entre -100 y 100. Debes conseguir
 * que todos los números pares del array cambien de signo, los
 * positivos deben pasar a negativos y viceversa.
*/

public class Ejercicio01_ArrayCambiarSignos {

	public static void main(String[] args) {
		int numeros[] = new int[150];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) Math.round(Math.random() * 200 - 100);
			System.out.print(numeros[i] + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) numeros[i] *= -1;
			System.out.print(numeros[i] + " ");
		}

	}

}
