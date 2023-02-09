package Examenes.examen09022023;

import javax.swing.JOptionPane;

public class Ejercicio03 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Introduzca una frase:");
		String palabras[] = str.split("[ ]{1,}");
		for (int i = 0; i < palabras.length; i++) {
			int mayus = 0, minus = 0, digits = 0, caract = 0;
			char palabra[] = palabras[i].toCharArray();
			for (int j = 0; j < palabra.length; j++) {
				if (Character.isUpperCase(palabra[j])) mayus++;
				if (Character.isLowerCase(palabra[j])) minus++;
				if (Character.isDigit(palabra[j])) digits++;
				if (!Character.isLetterOrDigit(palabra[j])) caract++;
			}
			if (mayus > 0 && minus > 1 && digits > 0 && caract > 0)
				System.out.println("Palabra " + (i + 1) + ": " + palabras[i]);
		}
	}

}
