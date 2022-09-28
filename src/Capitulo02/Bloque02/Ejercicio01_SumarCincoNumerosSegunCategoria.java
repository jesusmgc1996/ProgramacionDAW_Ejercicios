package Capitulo02.Bloque02;

import java.util.Scanner;

/*
 * 1º.- Realiza un ejercicio que acumule cinco números introducidos por el
 * usuario, es decir, que sume las cantidades introducidas, pero realizando
 * cuatro categorías: números negativos, números bajos (entre 0 y 25, ambos
 * inclusive), números medios (entre 26 y 250, ambos inclusie) y números grandes
 * (mayores de 250). Al finalizar el programa, se debe mostrar el total de las
 * sumas de los números introducidos en cada una de las categorías.
*/

public class Ejercicio01_SumarCincoNumerosSegunCategoria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float num, numN = 0, numB = 0, numM = 0, numG = 0;
		
		System.out.println("Introduzca un número flotante: ");
		num = sc.nextFloat();
		if (num < 0)
			numN = numN + num;
		if (num >= 0 && num <= 25)
			numB = numB + num;
		if (num >= 26 && num <= 250)
			numM = numM + num;
		if (num > 250)
			numG = numG + num;
		
		System.out.println("Introduzca otro número flotante: ");
		num = sc.nextFloat();
		if (num < 0)
			numN = numN + num;
		if (num >= 0 && num <= 25)
			numB = numB + num;
		if (num >= 26 && num <= 250)
			numM = numM + num;
		if (num > 250)
			numG = numG + num;
		
		System.out.println("Introduzca otro número flotante: ");
		num = sc.nextFloat();
		if (num < 0)
			numN = numN + num;
		if (num >= 0 && num <= 25)
			numB = numB + num;
		if (num >= 26 && num <= 250)
			numM = numM + num;
		if (num > 250)
			numG = numG + num;
		
		System.out.println("Introduzca otro número flotante: ");
		num = sc.nextFloat();
		if (num < 0)
			numN = numN + num;
		if (num >= 0 && num <= 25)
			numB = numB + num;
		if (num >= 26 && num <= 250)
			numM = numM + num;
		if (num > 250)
			numG = numG + num;
		
		System.out.println("Introduzca otro número flotante: ");
		num = sc.nextFloat();
		if (num < 0)
			numN = numN + num;
		if (num >= 0 && num <= 25)
			numB = numB + num;
		if (num >= 26 && num <= 250)
			numM = numM + num;
		if (num > 250)
			numG = numG + num;
		
		System.out.println("\nLa suma de los números negativos es: " + numN +
		"\nLa suma de los números bajos es: " + numB +
		"\nLa suma de los números medios es: " + numM +
		"\nLa suma de los números grandes es: " + numG);

	}

}
