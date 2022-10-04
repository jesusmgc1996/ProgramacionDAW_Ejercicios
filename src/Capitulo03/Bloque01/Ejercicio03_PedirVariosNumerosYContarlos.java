package Capitulo03.Bloque01;

import javax.swing.JOptionPane;

/*
 * 3º.- Realiza un ejercicio que pida números al usuario,
 * tantos como indique el usuario. al final debe aparecer
 * cuantos números positivos y negativos se han introducido.
*/

public class Ejercicio03_PedirVariosNumerosYContarlos {

	public static void main(String[] args) {
		String str;
		int num, cantidad, numN = 0, numP = 0;
		
		str = JOptionPane.showInputDialog("¿Cuántos números quiere que se pidan?");
		cantidad = Integer.parseInt(str);
		
		for (int i = 0; i < cantidad; i++) {
			str = JOptionPane.showInputDialog("Introduzca un número:");
			num = Integer.parseInt(str);
			if (num < 0)
				numN++;
			if (num > 0)
				numP++;
		}
		
		JOptionPane.showMessageDialog(null, "Se han introducido " + numP +
				" número(s) positivo(s) y " + numN + " número(s) negativo(s).");

	}

}
