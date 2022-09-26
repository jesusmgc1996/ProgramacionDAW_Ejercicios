package Capitulo02.Bloque01;

import java.util.Scanner;

/*
 * 7º.- Utiliza la operación AND y el operador "if", para tratar de
 * averiguar si un número introducido por el usuario es par o impar.
*/

public class Ejercicio07_MostrarParOImparUsandoAnd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número entero: ");
		int num = sc.nextInt();
		
		if ((num & 1) == 0)
			System.out.println("El número es par.");
		else
			System.out.println("El número es impar.");	

	}

}
