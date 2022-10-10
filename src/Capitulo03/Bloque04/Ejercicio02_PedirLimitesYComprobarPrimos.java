package Capitulo03.Bloque04;

import javax.swing.JOptionPane;

/*
 * 2º.- Crea un programa que compruebe si son primos o compuestos todos
 * los números entre un límite inferior y uno superior que debes pedir
 * al usuario. Tienes prohibido el uso del bucle "for".
*/

public class Ejercicio02_PedirLimitesYComprobarPrimos {

	public static void main(String[] args) {
		int limiteInf, limiteSup, cont = 2;
		boolean primo = true;
		
		limiteInf = Integer.parseInt(JOptionPane.showInputDialog("Introduzca"
				+ " el límite inferior:"));
		limiteSup = Integer.parseInt(JOptionPane.showInputDialog("Introduzca"
				+ " el límite superior:"));
		
		while (limiteInf <= limiteSup) {
			while (primo == true && cont != limiteInf) {
				if (limiteInf % cont == 0) {
					primo = false;
					break;
				}
				cont++;
			}
			limiteInf++;
			if (primo == true)
				System.out.println((limiteInf - 1) + " es primo");
			else
				System.out.println((limiteInf - 1) + " es compuesto");			
			cont = 2;
			primo = true;
		}
			
	}

}
