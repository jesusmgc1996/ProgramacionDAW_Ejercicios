package Capitulo03.Bloque02;

import javax.swing.JOptionPane;

/*
 * 4º.- Reforma el ejercicio anterior, para que el límite sea
 * también introducido por el usuario.
*/

public class Ejercicio04_PedirNumeroYLimiteYCalcularMultiplos {

	public static void main(String[] args) {
		String str;
		int num, limite;
		
		str = JOptionPane.showInputDialog("Introduzca un número:");
		num = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduzca el límite de los múltiplos: ");
		limite = Integer.parseInt(str);
		
		for (int i = 0; (i * num) < limite; i++)
			System.out.println(num + " x " + i + " = " +  i * num);

	}

}
