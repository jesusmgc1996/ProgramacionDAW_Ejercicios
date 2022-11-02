package Capitulo04.bloque04;

/*
 * 4.- Realiza un programa que rellene un array de 6 filas por 10 columnas
 * con números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos).
 * A continuación, el programa deberá dar la posición tanto del máximo como
 * del mínimo. Los números dentro de la matriz no pueden repetirse.
*/

public class Ejercicio04_ArrayMatriz {

	public static void main(String[] args) {
		int matriz[][] = crearMatrizSinRepetir(6, 10, 0, 1000);
		mostrarMatriz(matriz);
		calcularPosicion(matriz);
	}
	
	public static int[][] crearMatrizSinRepetir
	(int filas, int columnas, int limInf, int limSup) {
		int array[][] = new int[filas][columnas];
		for (int i = 0; i < array.length; i++)
			for (int j = 0; j < array[i].length; j++) {
				int num;
				do {
					num = utils.Utils.obtenerNumeroAzar(limInf, limSup);
				} while (comprobarRepeticion(array, num));
				array[i][j] = num;
			}
		return array;
	}
	
	public static boolean comprobarRepeticion (int array[][], int num) {
		for (int i = 0; i < array.length; i++)
			for (int j = 0; j < array[i].length; j++)
				if (array[i][j] == num) return true;
		return false;
	}
 	
	public static void mostrarMatriz (int array[][]) {
		System.out.println("Contenido de la matriz:");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++)
				System.out.print(array[i][j] + "\t");
			System.out.println("\n");
		}
	}
	
	public static void calcularPosicion (int array[][]) {
		int minFila = 0, minColumna = 0, maxFila = 0, maxColumna = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] < array[minFila][minColumna]) {
					minFila = i;
					minColumna = j;
				}
				if (array[i][j] > array[maxFila][maxColumna]) {
					maxFila = i;
					maxColumna = j;
				}
			}
		}
		System.out.println("La posición del número máximo " + array[maxFila][maxColumna]
				+ " es la fila " + (maxFila + 1) + " y la columna " + (maxColumna + 1)
				+ "\nLa posición del número mínimo " + array[minFila][minColumna]
				+ " es la fila " + (minFila + 1) + " y la columna " + (minColumna + 1));
	}

}
