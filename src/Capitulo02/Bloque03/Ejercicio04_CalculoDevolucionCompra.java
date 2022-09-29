package Capitulo02.Bloque03;

import javax.swing.JOptionPane;

/*
 * 4º.- Escribe un programa que lea el importe de una compra y la cantidad
 * recibida y calcule el cambio a devolver, teniendo en cuenta que el número
 * de monedas que se devuelven debe ser mínimo. Suponer que el sistema monetario
 * utilizado consta de monedas de 100, 50, 25, 5, y 1 unidad. El precio viene
 * dado en unidades monetarias enteras.
 */

public class Ejercicio04_CalculoDevolucionCompra {

	public static void main(String[] args) {
		String str;
		int importe, pago, devol, cien, cincuenta, veinticinco, cinco;
		
		str = JOptionPane.showInputDialog("Introduzca el importe de la compra: ");
		importe = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduzca la cantidad pagada: ");
		pago = Integer.parseInt(str);
		
		devol = pago - importe;
		cien = devol / 100;
		devol = devol % 100;
		cincuenta = devol / 50;
		devol = devol % 50;
		veinticinco = devol / 25;
		devol = devol % 25;
		cinco = devol / 5;
		devol = devol % 5;
		
		System.out.println("El cambio a devolver es:\n" + cien + " moneda(s) de 100\n"
				+ cincuenta + " moneda(s) de 50\n" + veinticinco + " moneda(s) de 25\n"
				+ cinco + " moneda(s) de 5\n" + devol + " moneda(s) de 1");
		
	}

}
