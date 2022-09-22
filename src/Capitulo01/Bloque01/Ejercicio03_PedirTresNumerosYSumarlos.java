package Capitulo01.Bloque01;

import java.util.Scanner;

/*
 * 3.- Realiza un programa que pida al usuario tres números
 * y calcule y muestre en pantalla la suma de los tres.
*/

public class Ejercicio03_PedirTresNumerosYSumarlos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número entero: ");
		int numEntero = sc.nextInt();		
		System.out.println("Introduzca un número flotante: ");
		float numFlotante = sc.nextFloat();		
		System.out.println("Introduzca un número doble: ");
		double numDoble = sc.nextDouble();
		
		System.out.println("La suma de los tres números es: "
		+ (numEntero + numFlotante + numDoble));

	}

}
