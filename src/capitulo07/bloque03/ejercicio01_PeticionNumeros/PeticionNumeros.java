package capitulo07.bloque03.ejercicio01_PeticionNumeros;

import javax.swing.JOptionPane;

public class PeticionNumeros {

	public static void main(String[] args) {
		do {
			try {
				askPairNumber();
				System.out.println("El número es par.");
				break;
			}
			catch(NotPairException ex) {
				System.out.println(ex.getMessage());
			}
		} while (true);
	}
	
	public static void askPairNumber() throws NotPairException {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número par:"));
		if (num % 2 != 0) throw new NotPairException("El número es impar.");
	}

}
