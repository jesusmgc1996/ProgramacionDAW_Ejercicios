package Capitulo04.bloque05;

import javax.swing.JOptionPane;

/*
 * 3º.- Crea un array de 20 números decimales creados al azar entre
 * 0 y 100. Para crear el número decimal debes generar al azar la
 * parte entera y la parte decimal por separado para después unir
 * las dos partes. A continuación debes examinar la cantidad de
 * números cuya parte decimal está comprendida entre .00 y .49
*/

public class Ejercicio03_ArrayDecimal {

	public static void main(String[] args) {
		decimalArray(20);
	}
	
	public static void decimalArray (int longitud) {
		float array[] = new float[longitud];
		int integer, count = 0;
		float decimal;
		for (int i = 0; i < array.length; i++) {
			integer = utils.Utils.obtenerNumeroAzar();
			decimal = utils.Utils.obtenerNumeroAzar() / 100f;
			array[i] = integer + decimal;
			if (decimal >= 0.00 && decimal <= 0.49) count++;
		}
		showArray(array);
		JOptionPane.showMessageDialog(null, "Hay " + count + " números cuya parte"
				+ " decimal está comprendida entre .00 y .49");
	}
	
	public static void showArray (float array[]) {
		System.out.println("Contenido del array:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
