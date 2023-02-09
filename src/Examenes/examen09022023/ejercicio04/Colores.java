package Examenes.examen09022023.ejercicio04;

import javax.swing.JOptionPane;

public class Colores {

	public static void main(String[] args) {
		int rojo = pedirValor();
		int verde = pedirValor();
		int azul = pedirValor();
		System.out.println("El color es: " + Integer.toHexString(rojo)
			+ Integer.toHexString(verde) + Integer.toHexString(azul));
	}
	
	/**
	 * Método para pedir un valor
	 * @return
	 */
	public static int pedirValor() {
		String num = null;
		do {
			try {
				num = JOptionPane.showInputDialog("Introduzca un valor comprendido entre 0 y 255:");
				comprobarExcepciones(num);
				break;
			}
			catch(ValorIncorrectoException ex) {
				JOptionPane.showMessageDialog(null, "El valor introducido no es correcto.");
			}
			catch(NoNumeroException ex) {
				JOptionPane.showMessageDialog(null, "No has introducido un número.");
			}
		} while (true);
		return Integer.parseInt(num);
	}
	
	/**
	 * Método para comprobar las excepciones
	 * @param str
	 * @throws ValorIncorrectoException
	 */
	public static void comprobarExcepciones(String num) throws ValorIncorrectoException,
																NoNumeroException {
		char palabra[] = num.toCharArray();
		for (int i = 0; i < palabra.length; i++)
			if (!Character.isDigit(palabra[i])) throw new NoNumeroException();
		if (Integer.parseInt(num) < 0 || Integer.parseInt(num) > 255) throw new ValorIncorrectoException();
	}

}
