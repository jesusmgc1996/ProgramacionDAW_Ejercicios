package Capitulo02.Bloque03;

import javax.swing.JOptionPane;

/*
 * 2º.- Realiza una calculadora avanzada, pero con la particularidad de que
 * las operaciones deben ser raices, potencias y el módulo de la división.
*/

public class Ejercicio02_CalculadoraAvanzada {

	public static void main(String[] args) {
		String str;
		int opt, num1, num2;
		
		str = JOptionPane.showInputDialog("Elija una operación: \n1.- Raíz"
				+ "\n2.- Potencia \n3.- Módulo de la división");
		opt = Integer.parseInt(str);
		
		switch(opt) {
			case 1: {
				str = JOptionPane.showInputDialog("Introduzca el radical: ");
				num1 = Integer.parseInt(str);
				str = JOptionPane.showInputDialog("Introduzca el índice: ");
				num2 = Integer.parseInt(str);
				System.out.println("La raíz vale: " + Math.pow(num1, 1f/num2));
				break;
			}
			case 2: {
				str = JOptionPane.showInputDialog("Introduzca la base: ");
				num1 = Integer.parseInt(str);
				str = JOptionPane.showInputDialog("Introduzca el exponente: ");
				num2 = Integer.parseInt(str);
				System.out.println("La potencia vale: " + Math.pow(num1, num2));
				break;
			}
			case 3: {
				str = JOptionPane.showInputDialog("Introduzca el dividendo: ");
				num1 = Integer.parseInt(str);
				str = JOptionPane.showInputDialog("Introduzca el divisor: ");
				num2 = Integer.parseInt(str);
				System.out.println("El módulo vale: " + (num1 % num2));
				break;
			}
			
		}

	}

}
