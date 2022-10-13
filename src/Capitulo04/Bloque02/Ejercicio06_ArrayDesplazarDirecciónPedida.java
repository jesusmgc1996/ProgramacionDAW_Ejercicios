package Capitulo04.Bloque02;

import javax.swing.JOptionPane;

/*
 * 6º.- Realiza un ejercicio igual al anterior, en el que el
 * usuario también pueda determinar la dirección del movimiento.
*/

public class Ejercicio06_ArrayDesplazarDirecciónPedida {

	public static void main(String[] args) {
		int numeros[] = new int[5];
		int num, cantidad, direccion;
		
		cantidad = Integer.parseInt(JOptionPane.showInputDialog("Introduzca"
				+ " la cantidad de posiciones que quiere desplazar:"));
		
		direccion = Integer.parseInt(JOptionPane.showInputDialog("Introduzca 1"
				+ " si quiere desplazar a la derecha. \nIntroduzca 2 si quiere"
				+ " desplazar a la izquierda."));
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) Math.round(Math.random() * 100);
			System.out.print(numeros[i] + " ");
		}
		
		System.out.println();
		
		if (direccion == 1)
			for (int i = 0; i < cantidad; i++) {
				num = numeros[numeros.length - 1];
				for (int j = numeros.length - 1; j > 0; j--) {
					numeros[j] = numeros[j - 1];
				}
				numeros[0] = num;
			}
		if (direccion == 2)
			for (int i = 0; i < cantidad; i++) {
				num = numeros[0];
				for (int j = 0; j < numeros.length - 1; j++) {
					numeros[j] = numeros[j + 1];
				}
				numeros[numeros.length - 1] = num;
			}
			
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}

	}

}
