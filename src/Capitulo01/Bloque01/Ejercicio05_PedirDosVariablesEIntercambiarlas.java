package Capitulo01.Bloque01;

import java.util.Scanner;

/*
 * 5.- Realiza un programa en Java que pida dos variables al usuario,
 * intercambie los valores de las dos variables y las muestre en pantalla
 * ANTES y DESPUÉS del intercambio de valores.
*/

public class Ejercicio05_PedirDosVariablesEIntercambiarlas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número flotante: ");
		float num1 = sc.nextFloat();		
		System.out.println("Introduzca otro número flotante: ");
		float num2 = sc.nextFloat();
		System.out.println("Los valores antes del intercambio son: "
		+ num1 + " y " + num2);
		
		float num = num1;
		num1 = num2;
		num2 = num;
		System.out.println("Los valores después del intercambio son: "
		+ num1 + " y " + num2);

	}

}
