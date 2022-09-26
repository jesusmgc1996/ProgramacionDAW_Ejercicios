package Capitulo02.Bloque01;

import java.util.Scanner;

/*
 * 6º.- Realizar un ejercicio en Java que pida un número al usuario
 * e indique en pantalla si se trata de un número par o impar.
*/

public class Ejercicio06_PedirUnNumeroYMostrarParOImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número entero: ");
		int num = sc.nextInt();
		
		if (num % 2 == 0)
			System.out.println("El número es par.");
		else
			System.out.println("El número es impar.");	

	}

}
