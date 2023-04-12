package capitulo07.bloque04;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Main {
	
	private static List<CalculationListener> listeners = new ArrayList<CalculationListener>();

	public static void main(String[] args) {
		Calculation c = new Calculation();
		menu();
	}
	
	/**
	 * Método para ejecutar el menú
	 */
	public static void menu() {
		int opt;
		do {
			opt = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la opción deseada:\n1. Suma"
					+ "\n2. Resta\n3. Multiplicación\n4. División\n5. Raíz cuadrada\n0. Salir"));
			switch(opt) {
				case 1:
					sum();
					break;
				case 2:
					subt();
					break;
				case 3:
					mult();
					break;
				case 4:
					div();
					break;
				case 5:
					sqrt();
					break;
			}
		} while (opt > 0);
	}
	
	/**
	 * Método para realizar la suma
	 */
	public static void sum() {
		int sum1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el primer sumando:"));
		int sum2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el segundo sumando:"));
		if (sum1 + sum2 > 1000) {
			CalculationEvent e = new CalculationEvent();
			e.setResult(sum1 + sum2);
			fireResultOverThousand(e);
		}
		else {
			JOptionPane.showMessageDialog(null, "El resultado es: " + (sum1 + sum2));
		}
	}
	
	/**
	 * Método para realizar la resta
	 */
	public static void subt() {
		int min = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el minuendo:"));
		int sub = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el sustraendo:"));
		if (min - sub < 0) {
			CalculationEvent e = new CalculationEvent();
			e.setResult(min - sub);
			fireResultIsNegative(e);
		}
		else {
			JOptionPane.showMessageDialog(null, "El resultado es: " + (min - sub));
		}
	}
	
	/**
	 * Método para realizar la multiplicación
	 */
	public static void mult() {
		int mult1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el multiplicando:"));
		int mult2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el multiplicador:"));
		if (mult1 * mult2 > 1000) {
			CalculationEvent e = new CalculationEvent();
			e.setResult(mult1 * mult2);
			fireResultOverThousand(e);
		}
		else {
			JOptionPane.showMessageDialog(null, "El resultado es: " + (mult1 * mult2));
		}
	}
	
	/**
	 * Método para realizar la división
	 */
	public static void div() {
		float div1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el dividendo:"));
		float div2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el divisor:"));
		if (div2 == 0) {
			fireDividerIsZero();
		}
		else {
			JOptionPane.showMessageDialog(null, "El resultado es: " + (div1 / div2));
		}
	}
	
	/**
	 * Método para realizar la raíz cuadrada
	 */
	public static void sqrt() {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el radicando:"));
		if (num < 0) {
			CalculationEvent e = new CalculationEvent();
			e.setNum(num);
			fireNumIsNegative(e);
		}
		else {
			JOptionPane.showMessageDialog(null, "El resultado es: " + Math.sqrt(num));
		}
	}
	
	/**
	 * Método para añadir un listener
	 * @param l
	 */
	public static void addCalculationListener(CalculationListener l) {
		listeners.add(l);
	}
	
	/**
	 * Método para eliminar un listener
	 * @param l
	 */
	public static void removeCalculationListener(CalculationListener l) {
		listeners.remove(l);
	}
	
	/**
	 * Método para disparar un evento cuando el resultado es mayor que 1000
	 * @param e
	 */
	private static void fireResultOverThousand(CalculationEvent e) {
		for (CalculationListener l : listeners) {
			l.resultOverThousand(e);
		}
	}
	
	/**
	 * Método para disparar un evento cuando el resultado es negativo
	 * @param e
	 */
	private static void fireResultIsNegative(CalculationEvent e) {
		for (CalculationListener l : listeners) {
			l.resultIsNegative(e);
		}
	}
	
	/**
	 * Método para disparar un evento cuando el divisor es 0
	 */
	private static void fireDividerIsZero() {
		for (CalculationListener l : listeners) {
			l.dividerIsZero();
		}
	}
	
	/**
	 * Método para disparar un evento cuando el número introducido es negativo
	 * @param e
	 */
	private static void fireNumIsNegative(CalculationEvent e) {
		for (CalculationListener l : listeners) {
			l.numIsNegative(e);
		}
	}

}
