package capitulo07.bloque01;

import javax.swing.JOptionPane;

public class Ejercicio02_Contrasenia {

	public static void main(String[] args) {
		String password;
		char psw[];
		do {
			password = JOptionPane.showInputDialog("Introduzca una contraseña\n(debe contener al menos:\n- una letra mayúscula"
					+ "\n- una letra minúscula\n- un dígito\n- un carácter no alfanumérico):");
			psw = password.toCharArray();
		} while(!existsUpperLetter(psw) || !existsLowerLetter(psw) || !existsDigit(psw) || !existsNotAlphanum(psw));
	}
	
	public static boolean existsUpperLetter(char array[]) {
		for (int i = 0; i < array.length; i++)
			if (Character.isUpperCase(array[i])) return true;
		System.out.println("La contraseña no contiene letras mayúsculas.");
		return false;
	}
	
	public static boolean existsLowerLetter(char array[]) {
		for (int i = 0; i < array.length; i++)
			if (Character.isLowerCase(array[i])) return true;
		System.out.println("La contraseña no contiene letras minúsculas.");
		return false;
	}
	
	public static boolean existsDigit(char array[]) {
		for (int i = 0; i < array.length; i++)
			if (Character.isDigit(array[i])) return true;
		System.out.println("La contraseña no contiene dígitos.");
		return false;
	}
	
	public static boolean existsNotAlphanum(char array[]) {
		for (int i = 0; i < array.length; i++)
			if (!Character.isLetterOrDigit(array[i])) return true;
		System.out.println("La contraseña no contiene caracteres no alfanuméricos.");
		return false;
	}

}
