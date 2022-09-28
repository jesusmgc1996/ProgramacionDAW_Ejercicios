package Capitulo02.Bloque02;

import java.util.Scanner;

/*
 * 2º.- Realiza un ejercicio igual al anterior, pero con las dos siguientes
 * diferencias: no existe la categoría de números negativos, por tanto si
 * el usuario introduce un negativo, el programa debe terminar; la otra
 * diferencia es que, al acabar, el programa no debe mostrar la suma de los
 * números, sino cuantos han entrado en cada categoría. A esto se llema contadores,
 * a diferencia del ejercicio anterior, que reciben el nombre de acumuladores.
*/

public class Ejercicio02_ContarCincoNumerosSegunCategoria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float num;
		int numB = 0, numM = 0, numG = 0;
		
		System.out.println("Introduzca un número flotante: ");
		num = sc.nextFloat();
		if (num < 0) {
			System.out.println("El número introducido es negativo y no es válido.");
			return;
		}
		if (num >= 0 && num <= 25)
			numB++;
		if (num >= 26 && num <= 250)
			numM++;
		if (num > 250)
			numG++;
		
		System.out.println("Introduzca otro número flotante: ");
		num = sc.nextFloat();
		if (num < 0) {
			System.out.println("El número introducido es negativo y no es válido.");
			return;
		}
		if (num >= 0 && num <= 25)
			numB++;
		if (num >= 26 && num <= 250)
			numM++;
		if (num > 250)
			numG++;
		
		System.out.println("Introduzca otro número flotante: ");
		num = sc.nextFloat();
		if (num < 0) {
			System.out.println("El número introducido es negativo y no es válido.");
			return;
		}
		if (num >= 0 && num <= 25)
			numB++;
		if (num >= 26 && num <= 250)
			numM++;
		if (num > 250)
			numG++;
		
		System.out.println("Introduzca otro número flotante: ");
		num = sc.nextFloat();
		if (num < 0) {
			System.out.println("El número introducido es negativo y no es válido.");
			return;
		}
		if (num >= 0 && num <= 25)
			numB++;
		if (num >= 26 && num <= 250)
			numM++;
		if (num > 250)
			numG++;
		
		System.out.println("Introduzca otro número flotante: ");
		num = sc.nextFloat();
		if (num < 0) {
			System.out.println("El número introducido es negativo y no es válido.");
			return;
		}
		if (num >= 0 && num <= 25)
			numB++;
		if (num >= 26 && num <= 250)
			numM++;
		if (num > 250)
			numG++;
		
		System.out.println("\nHa introducido " + numB + " números bajos." +
				"\nHa introducido " + numM + " números medios." +
				"\nHa introducido " + numG + " números grandes.");

	}

}
