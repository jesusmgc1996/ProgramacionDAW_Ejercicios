package Capitulo03.Bloque04;

/*
 * 3º.- Crea un ejercicio que imprima en pantalla todas las tablas
 * de multiplicar desde el 1 hasta el 15. Debes utilizar únicamente
 * bucles de tipo "do...while".
*/

public class Ejercicio03_MostrarTablasMultiplicar {

	public static void main(String[] args) {
		int cont = 1, i = 1;
		
		do {
			do {
				System.out.println(cont + " x " + i + " = " +  i * cont);
				i++;
			} while (i <= 10);
			i = 1;
			cont++;			
		} while (cont <= 15);

	}

}
