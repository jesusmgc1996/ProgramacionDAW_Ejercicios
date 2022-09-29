package Capitulo02.Bloque03;

import javax.swing.JOptionPane;

public class Ejercicio03_CalculadoraGeometria {

	public static void main(String[] args) {
		String str;
		int opt, num1, num2;
		double hipot, superf, perim;
		
		str = JOptionPane.showInputDialog("Elija una opción:"
				+ "\n1.- Hipotenusa de un triángulo"
				+ "\n2.- Superficie de una circunferencia"
				+ "\n3.- Perímetro de una circunferencia"
				+ "\n4.- Área de un rectángulo"
				+ "\n5.- Área de un triángulo"
				+ "\n0.- Salir");
		opt = Integer.parseInt(str);
		
		switch(opt) {
			case 0:
				return;
			case 1: {
				str = JOptionPane.showInputDialog("Introduzca un cateto: ");
				num1 = Integer.parseInt(str);
				str = JOptionPane.showInputDialog("Introduzca otro cateto: ");
				num2 = Integer.parseInt(str);
				hipot = Math.sqrt(Math.pow(num1, 2)+Math.pow(num2, 2));
				System.out.println("La hipotenusa del triángulo vale: " + hipot);
				break;
			}
			case 2: {
				str = JOptionPane.showInputDialog("Introduzca el radio: ");
				num1 = Integer.parseInt(str);
				superf = Math.PI*Math.pow(num1, 2);
				System.out.println("La superficie de la circunferencia vale: " + superf);
				break;
			}
			case 3: {
				str = JOptionPane.showInputDialog("Introduzca el radio: ");
				num1 = Integer.parseInt(str);
				perim = 2*Math.PI*num1;
				System.out.println("El perímetro de la circunferencia vale: " + perim);
				break;
			}
			case 4: {
				str = JOptionPane.showInputDialog("Introduzca la base: ");
				num1 = Integer.parseInt(str);
				str = JOptionPane.showInputDialog("Introduzca la altura: ");
				num2 = Integer.parseInt(str);
				superf = num1 * num2;
				System.out.println("La superficie del rectángulo vale: " + superf);
				break;
			}
			case 5: {
				str = JOptionPane.showInputDialog("Introduzca la base: ");
				num1 = Integer.parseInt(str);
				str = JOptionPane.showInputDialog("Introduzca la altura: ");
				num2 = Integer.parseInt(str);
				superf = (num1 * num2)/2f;
				System.out.println("La superficie del triángulo vale: " + superf);
				break;
			}
			default:
				System.out.println("Opción incorrecta");
		
		}

	}

}
