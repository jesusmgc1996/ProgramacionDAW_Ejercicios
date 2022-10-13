package Capitulo04.Bloque01;

import javax.swing.JOptionPane;

/*
 * 2º.- Realiza un ejercicio que inicialice un array de 150
 * elementos enteros al azar entre un límite inferior y uno
 * superior que debe especificar el usuario. Debes mostrar
 * el array en pantalla para comprobar el funcionamiento.
*/

public class Ejercicio02_ArrayEntreLimites {

	public static void main(String[] args) {
		int numeros[] = new int[150];
		int limiteSup, limiteInf;
		String str;
		
		str = JOptionPane.showInputDialog("Introduzca el límite inferior:");
		limiteInf = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduzca el límite superior:");
		limiteSup = Integer.parseInt(str);
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) Math.round(Math.random() * (limiteSup - limiteInf)
							+ limiteInf);
			System.out.print(numeros[i] + " ");
		}

	}

}
