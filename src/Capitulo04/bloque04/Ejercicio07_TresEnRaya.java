package Capitulo04.bloque04;

import javax.swing.JOptionPane;

/*
 * 7.- Programa el juego de las tres en raya.
*/

public class Ejercicio07_TresEnRaya {

	public static void main(String[] args) {
		char matriz[][] = crearTablero(4,4);
		mostrarTablero(matriz);
		turnos(matriz);
	}
	
	public static char[][] crearTablero (int filas, int columnas) {
		char array[][] = new char[filas][columnas];
		for (int i = 1; i < array.length; i++)
			for (int j = 0; j < array[i].length - 1; j++)
				array[i][j] = '□';
		array [0][0] = 'A';
		array [0][1] = 'B';
		array [0][2] = 'C';
		array [1][3] = '1';
		array [2][3] = '2';
		array [3][3] = '3';
		array [0][3] = ' ';
		return array;
	}
	
	public static void mostrarTablero (char array[][]) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++)
				System.out.print(array[i][j] + " ");
			System.out.println();
		}
		System.out.println();
	}
	
	public static void turnos (char array[][]) {
		int numColumna = 0, turno = 1;
		int fila;
		String columna;
		char charColumna;
		do {
			if (turno % 2 != 0) {
				do {
					fila = Integer.parseInt(JOptionPane.showInputDialog("Turno del"
							+ " jugador 1. Introduzca la fila:"));
					columna = JOptionPane.showInputDialog("Turno del jugador 1."
							+ " Introduzca la columna:");
					charColumna = columna.charAt(0);
					if (charColumna == 'A') numColumna = 0;
					if (charColumna == 'B') numColumna = 1;
					if (charColumna == 'C') numColumna = 2;
					if (array[fila][numColumna] != '□')
						JOptionPane.showMessageDialog(null, "Esa casilla está ocupada");
				} while (array[fila][numColumna] != '□');
				array [fila][numColumna] = 'O';
				mostrarTablero(array);
			}
			if (turno % 2 == 0) {
				do {
					fila = Integer.parseInt(JOptionPane.showInputDialog("Turno del"
							+ " jugador 2. Introduzca la fila:"));
					columna = JOptionPane.showInputDialog("Turno del jugador 2."
							+ " Introduzca la columna:");
					charColumna = columna.charAt(0);
					if (charColumna == 'A') numColumna = 0;
					if (charColumna == 'B') numColumna = 1;
					if (charColumna == 'C') numColumna = 2;
					if (array[fila][numColumna] != '□')
						JOptionPane.showMessageDialog(null, "Esa casilla está ocupada");
				} while (array[fila][numColumna] != '□');
				array [fila][numColumna] = 'X';
				mostrarTablero(array);
			}
			turno++;
		} while (!juegoTerminado(array) && turno < 10);
		if (!juegoTerminado(array) && turno == 10)
			JOptionPane.showMessageDialog(null, "El juego ha terminado. La partida"
					+ " ha acabado en tablas.");
		if (juegoTerminado(array) && turno % 2 == 0)
			JOptionPane.showMessageDialog(null, "El juego ha terminado. El ganador"
					+ " es el jugador 1.");
		if (juegoTerminado(array) && turno % 2 != 0)
			JOptionPane.showMessageDialog(null, "El juego ha terminado. El ganador"
					+ " es el jugador 2.");
	}
	
	public static boolean juegoTerminado (char array[][]) {
		if (array [1][0] == array [2][1] && array [2][1] == array [3][2]
				&& array [1][0] != '□') return true;
		if (array [1][2] == array [2][1] && array [2][1] == array [3][0]
				&& array [1][2] != '□') return true;
		if (array [1][0] == array [1][1] && array [1][1] == array [1][2]
				&& array [1][0] != '□') return true;
		if (array [2][0] == array [2][1] && array [2][1] == array [2][2]
				&& array [2][0] != '□') return true;
		if (array [3][0] == array [3][1] && array [3][1] == array [3][2]
				&& array [3][0] != '□') return true;
		if (array [1][0] == array [2][0] && array [2][0] == array [3][0]
				&& array [1][0] != '□') return true;
		if (array [1][1] == array [2][1] && array [2][1] == array [3][1]
				&& array [1][1] != '□') return true;
		if (array [1][2] == array [2][2] && array [2][2] == array [3][2]
				&& array [1][2] != '□') return true;
		return false;
	}

}
