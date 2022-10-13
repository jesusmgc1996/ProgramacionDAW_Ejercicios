package Capitulo04.Bloque02;

import javax.swing.JOptionPane;

/*
 * 5º.- Realiza un ejercicio igual al anterior, pero en el que el usuario
 * pueda indicar la cantidad de posiciones que deseamos desplazar.
*/

public class Ejercicio05_ArrayDesplazarCantidadPedida {

	public static void main(String[] args) {
		int numeros[] = new int[5];
		int num, cantidad;
		
		cantidad = Integer.parseInt(JOptionPane.showInputDialog("Introduzca"
				+ " la cantidad de posiciones que quiere desplazar:"));
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) Math.round(Math.random() * 100);
			System.out.print(numeros[i] + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < cantidad; i++) {
			num = numeros[numeros.length - 1];
			for (int j = numeros.length - 1; j > 0; j--) {
				numeros[j] = numeros[j - 1];
			}
			numeros[0] = num;
		}
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}

	}

}
