package Capitulo04.bloque04;

import javax.swing.JOptionPane;

/*
 * 3.- Calcula la letra de un DNI, pediremos el DNI por teclado y nos devolverá
 * el DNI completo. Para calcular la letra, cogeremos el resto de dividir nuestro
 * dni entre 23, el resultado debe estar entre 0 y 22. Haz un método donde según
 * el resultado de la anterior formula busque en un array de caracteres la posición
 * que corresponda a la letra. El orden de los caracteres del array es: T, R, W, A,
 * G, M, Y, F, P, D, X, B, N, J, Z, S, Q, V, H, L, C, K, E.Por ejemplo, si introduzco
 * 70588387, el resultado sera de 7 que corresponde a ‘F’.
*/

public class Ejercicio03_ArrayDNI {

	public static void main(String[] args) {
		char letras[] = new char [] {'T','R','W','A','G','M','Y','F','P','D','X','B',
				'N','J','Z','S','Q','V','H','L','C','K','E'};
		int dni;
		
		dni = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la parte"
				+ " numérica de su DNI:"));
		
		JOptionPane.showMessageDialog(null, "Su DNI es: " + dni + letras[dni % 23]);
		
	}

}
