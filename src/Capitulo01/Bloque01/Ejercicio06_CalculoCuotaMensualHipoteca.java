package Capitulo01.Bloque01;

import java.util.Scanner;

/*
 * 6º.- Realiza un ejercicio en C para el cálculo de la
 * cuota mensual de una hipóteca (tema tan importante hoy día ;-)).
 * Se deben pedir al usuario los datos de Euribor (float), Diferencial (float),
 * Capital (float) y Número de plazos mensuales para pagar la hipoteca (int).
 * A partir de esos datos se debe calcular y mostrar al usuario el importe de
 * la cuota mensual.
*/

public class Ejercicio06_CalculoCuotaMensualHipoteca {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el valor del Euribor: ");
		float E = sc.nextFloat(); // E = Euribor
		System.out.println("Introduzca el valor del Diferencial: ");
		float D = sc.nextFloat(); // D = Diferencial
		System.out.println("Introduzca el valor del Capital: ");
		float C = sc.nextFloat(); // C = Capital
		System.out.println("Introduzca el número de plazos mensuales: ");
		int N = sc.nextInt(); // N = Número de cuotas mensuales
		
		float IA = E + D; // IA = Interés Anual
		double IM = IA / 12 / 100; // IM = Interés Mensual
		double CM = C * (IM * Math.pow(1 + IM, N))/(Math.pow(1 + IM, N) - 1);
		// CM = Cuota Mensual
		
		System.out.println("El importe de la cuota mensual es: " + CM);

	}

}
