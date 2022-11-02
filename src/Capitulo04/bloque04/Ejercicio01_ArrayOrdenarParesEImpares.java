package Capitulo04.bloque04;

/* 1.- Escribe un programa que genere 20 números enteros aleatorios entre
 * 0 y 100 y que los almacene en un array. El programa debe ser capaz de
 * pasar todos los números pares a las primeras posiciones del array (del
 * 0 en adelante) y todos los números impares a las celdas restantes.
*/

public class Ejercicio01_ArrayOrdenarParesEImpares {

	public static void main(String[] args) {
		int numeros[] = utils.UtilsArrays.creaArrayNumerosAzar(20, 0, 100);
		utils.UtilsArrays.mostrarArray(numeros);
		ordenarPares(numeros);
		utils.UtilsArrays.mostrarArrayOrdenado(numeros);
	}
	
	public static void ordenarPares(int array[]) {
		int num, cont = 0;
		boolean permut = true;
		while (permut == true) {
			permut = false;
			cont++;
			for (int i = 0; i < array.length - cont; i++) {
				if (array[i] % 2 != 0) {
					num = array[i];
					array[i] = array[i + 1];
					array[i + 1] = num;
					permut = true;
				}
			}
		}
	}

}
