package Capitulo04.bloque04;

import javax.swing.JOptionPane;

/*
 * 2.- Realiza un programa que pida 10 números por teclado y que los almacene
 * en un array. A continuación se mostrará el contenido de ese array junto al
 * índice (0 – 9). Seguidamente el programa pedirá dos posiciones a las que
 * llamaremos “inicial” y “final”. Se debe comprobar que inicial es menor que
 * final y que ambos números están entre 0 y 9. El programa deberá desplazar
 * todos los elementos del array a la derecha una posición, pero dejando intacto
 * el intervalo interior. Al final se debe mostrar el array resultante.
*/

public class Ejercicio02_ArrayDesplazarIntervalo {

	public static void main(String[] args) {
		int numeros[] = utils.UtilsArrays.creaArrayNumerosUsuario(10);
		utils.UtilsArrays.mostrarArray(numeros);
		mostrarIndicesArray(numeros);
		int inicial = pedirPosicionInicial();
		int fin = pedirPosicionFinal(inicial);
		ordenarArrayIntervalo(numeros, inicial, fin);
		utils.UtilsArrays.mostrarArrayOrdenado(numeros);
	}
	
	public static void mostrarIndicesArray(int array[]) {
		System.out.println("Índices del array:");
		for (int i = 0; i < array.length; i++)
			System.out.print(i + " ");
		System.out.println();
	}
	
	public static int pedirPosicionInicial() {
		int inicial;
		do {
			inicial = Integer.parseInt(JOptionPane.showInputDialog("Introduzca "
					+ "la posición menor:\n(número entre 0 y 9)"));
		} while (inicial < 0 || inicial > 9);
		return inicial;
	}
	
	public static int pedirPosicionFinal(int inicial) {
		int fin;
		do {
			fin = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la posición"
					+ " mayor:\n(número entre 0 y 9)"));
		} while (inicial > fin || fin < 0 || fin > 9);
		return fin;
	}
	
	public static void ordenarArrayIntervalo(int array[], int inicial, int fin) {
		int num1 = array[inicial - 1];
		int num2 = array[array.length - 1];
		for (int i = array.length - 1; i > fin; i--)
			array[i] = array[i - 1];
		array[fin + 1] = num1;
		for (int i = inicial - 1; i > 0; i--)
			array[i] = array[i - 1];
		array[0] = num2;
	}

}
