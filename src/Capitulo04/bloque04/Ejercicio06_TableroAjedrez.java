package Capitulo04.bloque04;

import javax.swing.JOptionPane;

/*
 * 6.- Escribe un programa que, dada una posición en un tablero de ajedrez,
 * nos diga a qué casillas podría saltar un alfil que se encuentra en esa
 * posición. Como se indica en la figura, el alfil se mueve siempre en
 * diagonal. El tablero cuenta con 64 casillas. Las columnas se indican
 * con las letras de la “a” a la “h” y las filas se indican del 1 al 8.
*/

public class Ejercicio06_TableroAjedrez {

	public static void main(String[] args) {
		char matriz[][] = crearTablero(9,9);
		mostrarTablero(matriz);
		colocarAlfil(matriz);
		mostrarTablero(matriz);
	}
	
	public static char[][] crearTablero (int filas, int columnas) {
		char array[][] = new char[filas][columnas];
		for (int i = 1; i < array.length; i += 2) {
			for (int j = 0; j < array[i].length - 1; j += 2)
				array[i][j] = '□';
			for (int j = 1; j < array[i].length - 1; j += 2)
				array[i][j] = '■';
		}
		for (int i = 2; i < array.length; i += 2) {
			for (int j = 1; j < array[i].length - 1; j += 2)
				array[i][j] = '□';
			for (int j = 0; j < array[i].length - 1; j += 2)
				array[i][j] = '■';
		}
		array [0][0] = 'A';
		array [0][1] = 'B';
		array [0][2] = 'C';
		array [0][3] = 'D';
		array [0][4] = 'E';
		array [0][5] = 'F';
		array [0][6] = 'G';
		array [0][7] = 'H';
		array [1][8] = '1';
		array [2][8] = '2';
		array [3][8] = '3';
		array [4][8] = '4';
		array [5][8] = '5';
		array [6][8] = '6';
		array [7][8] = '7';
		array [8][8] = '8';
		array [0][8] = ' ';
		return array;
	}
	
	public static void mostrarTablero (char array[][]) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++)
				System.out.print(array[i][j] + "\t");
			System.out.println();
		}
		System.out.println();
	}
	
	public static void colocarAlfil (char array[][]) {
		int numColumna = 0;
		int fila = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la fila:"));
		String columna = JOptionPane.showInputDialog("Introduzca la columna:");
		char charColumna = columna.charAt(0);
		if (charColumna == 'A') numColumna = 0;
		if (charColumna == 'B') numColumna = 1;
		if (charColumna == 'C') numColumna = 2;
		if (charColumna == 'D') numColumna = 3;
		if (charColumna == 'E') numColumna = 4;
		if (charColumna == 'F') numColumna = 5;
		if (charColumna == 'G') numColumna = 6;
		if (charColumna == 'H') numColumna = 7;
		array [fila][numColumna] = '♗';
		for (int i = fila - 1, j = numColumna - 1; i > 0 && j >= 0; i--, j--)
			array [i][j] = 'X';
		for (int i = fila - 1, j = numColumna + 1; i > 0 && j < array[i].length - 1; i--, j++)
			array [i][j] = 'X';
		for (int i = fila + 1, j = numColumna - 1; i < array.length && j >= 0; i++, j--)
			array [i][j] = 'X';
		for (int i = fila + 1, j = numColumna + 1; i < array.length && j < array[i].length - 1; i++, j++)
			array [i][j] = 'X';
	}
	
}
