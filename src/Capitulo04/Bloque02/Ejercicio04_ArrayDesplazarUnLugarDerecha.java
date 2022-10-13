package Capitulo04.Bloque02;

/*
 * 4º.- Realiza un ejercicio en que inicialice un array de 5
 * elementos enteros al azar entre 0 y 100. Debes conseguir
 * que se desplacen los números un lugar a su derecha, de
 * manera que el desplazamiento sea circular, si un número
 * sale por la derecha volverá a entrar por la izquierda.
 * Ejemplo: 1 2 3 4 5 pasa a ser 5 1 2 3 4 que pasa a ser 4 5 1 2 3.
*/

public class Ejercicio04_ArrayDesplazarUnLugarDerecha {

	public static void main(String[] args) {
		int numeros[] = new int[5];
		int num;
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) Math.round(Math.random() * 100);
			System.out.print(numeros[i] + " ");
		}
		
		System.out.println();
		
		num = numeros[numeros.length - 1];
		for (int i = numeros.length - 1; i > 0; i--) {
			numeros[i] = numeros[i - 1];
		}
		numeros[0] = num;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}

	}

}
