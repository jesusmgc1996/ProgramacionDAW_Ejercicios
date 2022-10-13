package Capitulo04.Bloque01;

import javax.swing.JOptionPane;

/*
 * 4º.- Realiza un ejercicio que inicialice un array de 150
 * elementos enteros al azar entre 0 y 100. A continuación
 * pedirás al usuario un valor y buscarás dicho valor en el
 * array. Si lo encuentras, debes indicar al usuario la posición
 * del array en que se encuentra. En caso de que no encuentres
 * el valor buscado, debes indicárselo también al usuario.
*/

public class Ejercicio04_ArrayPedirValorYBuscarlo {

	public static void main(String[] args) {
		int numeros[] = new int[150];
		int num, posicion = 0;
		boolean numExiste = false;
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) Math.round(Math.random() * 100);
			System.out.print(numeros[i] + " ");
		}
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número:"));
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == num && numExiste == false) {
				numExiste = true;
				posicion = i;
			}
		}

		if (numExiste == true) System.out.println("\nEl número se encuentra en"
													+ " la posición " + posicion);
		else System.out.println("\nEl número no se ha encontrado.");

	}

}
