package Capitulo03.Bloque03;

import javax.swing.JOptionPane;

/*
 * 3º.- Realiza un ejercicio que pida números al usuario, hasta que uno
 * de ellos sea 0 (cero). Para cada número introducido se debe mostrar
 * en pantalla su tabla de multiplicar, desde el 0 (cero) hasta el 10.
*/

public class Ejercicio03_PedirNumerosYMostrarTablaDeMultiplicar {

	public static void main(String[] args) {
		int num = 1;
		
		for (int i = 0; num != 0; i++) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un"
					+ " número: \n(0 para salir)"));
			if (num != 0)
				for (int j = 1; j <= 10; j++)
					System.out.println(num + " x " + j + " = " +  j * num);
		}

	}

}
