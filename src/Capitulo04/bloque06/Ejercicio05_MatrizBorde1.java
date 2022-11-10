package Capitulo04.bloque06;

/*
 * 4º.- Realizar un programa que cree una matriz de tipo char, con 20 filas y 10
 * columnas. Los elementos que constituyen el borde de la matriz se deben rellenar,
 * mediant bucles, con un asterisco. En el interior de la matriz, no en los bordes,
 * debes crear un caracter '0' en una posición aleatoria. El resto de la matriz debe
 * tener espacios en blanco. Muestra la matriz por consola.
*/

public class Ejercicio05_MatrizBorde1 {

	public static void main(String[] args) {
		char matrix[][] = new char[20][10];
		fillBorder(matrix);
		fillMatrix(matrix);
		showMatrix(matrix);
	}
	
	public static void fillBorder (char matrix[][]) {
		for (int i = 0; i < matrix.length; i++) {
			matrix[i][0] = '*';
			matrix[i][9] = '*';
		}
		for (int i = 0; i < matrix[0].length; i++) {
			matrix[0][i] = '*';
			matrix[19][i] = '*';
		}
	}
	
	public static void fillMatrix (char matrix[][]) {
		for (int i = 1; i < matrix.length - 1; i++)
			for (int j = 1; j < matrix[i].length - 1; j++) {
				String num = Integer.toString(utils.Utils.obtenerNumeroAzar(0, 1));
				char numChar = num.charAt(0);
				matrix[i][j] = numChar;
			}
	}
	
	public static void showMatrix (char matrix[][]) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++)
				System.out.print(matrix[i][j] + " ");
			System.out.println();
		}
	}

}
