package Capitulo03.Bloque02;

import javax.swing.JOptionPane;

/*
 * 2º.- Mayor y menor de una cantidad de números dada por el usuario.
 * El usuario introducirá una cantidad de números, tras lo cual se le
 * deben pedir tantos como este haya indicado. Al final se debe imprimir
 * el mayor y el menor de todos los introducidos.
*/

public class Ejercicio02_PedirVariosNumerosYMostrarMayorYMenor {

	public static void main(String[] args) {
		String str;
		int cantidad, num = 1, mayor = 0, menor = 0;
		
		str = JOptionPane.showInputDialog("¿Cuántos números quiere que se pidan?");
		cantidad = Integer.parseInt(str);
		
		for (int i = 0; i < cantidad; i++) {
			if (i == 0) {
				str = JOptionPane.showInputDialog("Introduzca un número:");
				mayor = Integer.parseInt(str);
				menor = mayor;
			}
			else {
				str = JOptionPane.showInputDialog("Introduzca un número:");
				num = Integer.parseInt(str);
				if (num > mayor)
					mayor = num;
				if (num < menor)
					menor = num;				
			}
			
		}
		
		JOptionPane.showMessageDialog(null, "El número mayor es " + mayor +
				" y el número menor es " + menor);

	}

}
