package Capitulo02.Bloque01;

import java.util.Scanner;

/*
 * 1º.- Realiza un ejercicio que pida dos variables al usuario, tras lo
 * cual, muestre en pantalla el número mayor de los dos introducidos.
*/

public class Ejercicio01_PedirDosVariablesYMostrarLaMayor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número flotante: ");
		float num1 = sc.nextFloat();		
		System.out.println("Introduzca otro número flotante: ");
		float num2 = sc.nextFloat();
		
		if (num1 > num2)
			System.out.println("El número mayor es: " + num1);
		if (num1 < num2)
			System.out.println("El número mayor es: " + num2);
		if (num1 == num2)
			System.out.println("Los números son iguales.");
		
	}

}
