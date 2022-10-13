package Capitulo04.Bloque02;

import javax.swing.JOptionPane;

/*
 * 3º.- Realiza un ejercicio que inicialice un array de 150
 * elementos enteros al azar entre 0 y 100. Debes conseguir
 * multiplicar cada uno de los elementos del array por un
 * número determinado, pedido al usuario.
*/

public class Ejercicio03_ArrayMultiplicar {

	public static void main(String[] args) {
		int numeros[] = new int[150];
		int num;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número:"));
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) Math.round(Math.random() * 100);
			System.out.print(numeros[i] + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] *= num;
			System.out.print(numeros[i] + " ");
		}

	}

}
