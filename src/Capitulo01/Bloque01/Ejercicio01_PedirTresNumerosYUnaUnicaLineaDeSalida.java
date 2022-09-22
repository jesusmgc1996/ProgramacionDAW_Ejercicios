package Capitulo01.Bloque01;

import java.util.Scanner;

/*
 * 1.- Realiza un programa que pida al usuario tres números: uno de tipo entero,
 * otro de tipo flotante y otro de tipo doble. A continuación se tienen que
 * mostrar en pantalla los tres números en una sola fila de la consola de salida.
*/

public class Ejercicio01_PedirTresNumerosYUnaUnicaLineaDeSalida {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número entero: ");
		int numEntero = sc.nextInt();		
		System.out.println("Introduzca un número flotante: ");
		float numFlotante = sc.nextFloat();		
		System.out.println("Introduzca un número doble: ");
		double numDoble = sc.nextDouble();
		
		System.out.println("El número entero es: " + numEntero +
		". El número flotante es: " + numFlotante +
		". El número doble es: " + numDoble);

	}

}
