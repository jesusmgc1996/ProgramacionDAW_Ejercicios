package Capitulo04.bloque06;

/*
 * 2.- Realiza un programa que dibuje en la pantalla una onda aleatoria de asteriscos.
 * Para resolver este problema utilizarás matrices de tipo char. En un tipo char
 * guardas un carácter. Por ejemplo, la línea "char variable = 'p';" crea una variable
 * de tipo char y le asigna la letra 'p' minúscula. Crea una matriz de 10 filas y 30
 * posiciones por fila, de tipo char, a continuación genera en cada fila un número
 * aleatorio de asteriscos, cuando acabes en cada fila de introducir asteriscos,
 * rellena el resto de la fila con espacios en blanco. Finalmente muestra la matriz
 * en consola.
*/

public class Ejercicio02_OndaAleatoria {

	public static void main(String[] args) {
		char matrix[][] = new char[10][30];
		fillMatrix(matrix);
		showMatrix(matrix);
		
	}
	
	public static void fillMatrix (char matrix[][]) {
		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < utils.Utils.obtenerNumeroAzar(1, matrix[i].length); j++)
				matrix[i][j] = '*';
		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < matrix[i].length; j++)
				if (matrix[i][j] != '*') matrix[i][j] = ' ';
	}
	
	public static void showMatrix (char matrix[][]) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++)
				System.out.print(matrix[i][j] + " ");
			System.out.println();
		}
	}

}
