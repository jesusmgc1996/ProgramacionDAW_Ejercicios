package Capitulo01.Bloque01;

import java.util.Scanner;

/*
 * 2.- Realiza un programa igual al anterior, con la particularidad
 * de que ahora se debe mostrar cada número justo a continuación del
 * momento en que ha sido introducido.
*/

public class Ejercicio02_PedirTresNumerosYVariasLineasDeSalida {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Introduzca un número entero: ");
		int numEntero = sc.nextInt();
		System.out.println("El número entero es: " + numEntero);
			
		System.out.println("Introduzca un número flotante: ");
		float numFlotante = sc.nextFloat();
		System.out.println("El número flotante es: " + numFlotante);
			
		System.out.println("Introduzca un número doble: ");
		double numDoble = sc.nextDouble();
		System.out.println("El número doble es: " + numDoble);

	}

}
