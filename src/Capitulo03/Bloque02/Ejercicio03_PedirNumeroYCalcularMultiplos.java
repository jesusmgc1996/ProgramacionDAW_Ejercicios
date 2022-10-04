package Capitulo03.Bloque02;

import javax.swing.JOptionPane;

/*
 * 3º.- Ejercicio que obtenga todos los múltiplos de un número
 * introducido por el usuario. Se imprimirán todos los múltiplos
 * menores de 100, este será el límite.
*/

public class Ejercicio03_PedirNumeroYCalcularMultiplos {

	public static void main(String[] args) {
		String str;
		int num;
		
		str = JOptionPane.showInputDialog("Introduzca un número:");
		num = Integer.parseInt(str);
		
		for (int i = 0; (i * num) < 100; i++)
			System.out.println(num + " x " + i + " = " +  i * num);

	}

}
