package Capitulo01.Bloque01;

import java.util.Scanner;

/*
 * 4.- Realiza un programa que muestre la media de tres números introducidos.
*/

public class Ejercicio04_PedirTresNumerosYCalcularLaMedia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número entero: ");
		int numEntero = sc.nextInt();		
		System.out.println("Introduzca un número flotante: ");
		float numFlotante = sc.nextFloat();		
		System.out.println("Introduzca un número doble: ");
		double numDoble = sc.nextDouble();
		
		System.out.println("La media de los tres números es: "
		+ (numEntero + numFlotante + numDoble)/3);

	}

}
