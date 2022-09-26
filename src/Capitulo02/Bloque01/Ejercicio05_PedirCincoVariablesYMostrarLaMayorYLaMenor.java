package Capitulo02.Bloque01;

import java.util.Scanner;

/*
 * 5º.- Pedir al usuario cinco números, e imprimir posteriormente
 * el mayor valor introducido y el menor valor introducido.
*/

public class Ejercicio05_PedirCincoVariablesYMostrarLaMayorYLaMenor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número flotante: ");
		float num1 = sc.nextFloat();
		System.out.println("Introduzca otro número flotante: ");
		float num2 = sc.nextFloat();
		System.out.println("Introduzca otro número flotante: ");
		float num3 = sc.nextFloat();
		System.out.println("Introduzca otro número flotante: ");
		float num4 = sc.nextFloat();
		System.out.println("Introduzca otro número flotante: ");
		float num5 = sc.nextFloat();
		
		if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5)
			System.out.println("El número mayor es: " + num1);
		if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5)
			System.out.println("El número mayor es: " + num2);
		if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5)
			System.out.println("El número mayor es: " + num3);
		if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5)
			System.out.println("El número mayor es: " + num4);
		if (num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4)
			System.out.println("El número mayor es: " + num5);
		
		if (num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5)
			System.out.println("El número menor es: " + num1);
		if (num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5)
			System.out.println("El número menor es: " + num2);
		if (num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5)
			System.out.println("El número menor es: " + num3);
		if (num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5)
			System.out.println("El número menor es: " + num4);
		if (num5 < num1 && num5 < num2 && num5 < num3 && num5 < num4)
			System.out.println("El número menor es: " + num5);

	}

}
