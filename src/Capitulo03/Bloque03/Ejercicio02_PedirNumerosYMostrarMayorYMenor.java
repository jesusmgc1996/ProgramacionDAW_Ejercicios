package Capitulo03.Bloque03;

import javax.swing.JOptionPane;

/*
 * 2º.- Realiza un ejercicio que pida números al usuario hasta que este
 * introduzca el 0 (cero). Al finalizar el ejercicio se debe imprimir en
 * pantalla el valor mayor y el menor introducido. El valor 0 (cero) no
 * debe tenerse en cuenta.
*/

public class Ejercicio02_PedirNumerosYMostrarMayorYMenor {

	public static void main(String[] args) {
		int num = 1, mayor = 0, menor = 0;

		for (int i = 0; num != 0; i++) {
			if (i == 0) {
				num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un"
						+ " número: \n(0 para salir)"));
				mayor = num;
				menor = num;
			}
			else {
				num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un"
						+ " número: \n(0 para salir)"));
				if (num > mayor && num != 0)
					mayor = num;
				if (num < menor && num != 0)
					menor = num;				
			}
			
		}
		
		JOptionPane.showMessageDialog(null, "El número mayor es " + mayor +
				" y el número menor es " + menor);

	}

}
