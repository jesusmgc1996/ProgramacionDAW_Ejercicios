package Capitulo04.bloque05;

import javax.swing.JOptionPane;

/*
 * 1º.- Crea un programa que reciba un array de números enteros creados al
 * azar entre 0 y 100. Se debe examinar la longitud del array, comprobar
 * que la longitud es un valor impar y devolver el valor que se encuentre
 * en la posición media. En caso de que la longitud del array sea un número
 * par se debe devolver un valor -1.
*/

public class Ejercicio01_ArrayComprobarLongitud {

	public static void main(String[] args) {
		int array[] = utils.UtilsArrays.creaArrayNumerosAzar
				(utils.Utils.obtenerNumeroAzar(10,20), 0, 100);
		utils.UtilsArrays.mostrarArray(array);
		int num = getMiddleItem(array);
		showResults(num);
	}
	
	public static int getMiddleItem (int array[]) {
		if (array.length % 2 != 0) return array[array.length / 2];
		return -1;
	}
	
	public static void showResults (int num) {
		if (num != -1) JOptionPane.showMessageDialog(null, "La longitud del "
				+ "array es impar.\nEl valor de la posición media es: " + num);
		else JOptionPane.showMessageDialog(null, "La longitud del array es par.");
	}

}
