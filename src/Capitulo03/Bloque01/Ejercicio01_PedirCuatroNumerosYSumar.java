package Capitulo03.Bloque01;

import javax.swing.JOptionPane;

/*
 * 1º.- Realiza un programa que pida al usuario cuatro números enteros,
 * y calcule la suma solo de aquellos números introducidos por el usuario,
 * que sean mayores de 10. Es decir, que si el usuario introduce el 5,
 * el 15, el 6 y el 25, el programa debe calcular la suma solo de 15 más 25,
 * ya que 5 y 6 son menores de 10.
*/

public class Ejercicio01_PedirCuatroNumerosYSumar {

	public static void main(String[] args) {
		String str;
		int num, suma = 0;
		
		for (int i = 0; i < 4; i++) {
			str = JOptionPane.showInputDialog("Introduzca un número:");
			num = Integer.parseInt(str);
			if (num > 10)
				suma += num;
		}
		
		JOptionPane.showMessageDialog(null, "La suma de los números es: " + suma);
		
	}

}
