package Capitulo04.bloque04;

import javax.swing.JOptionPane;

/*
 * 7.- Programa el juego de las tres en raya.
*/

public class Ejercicio07_TresEnRaya {

	public static void main(String[] args) {
		String nombres[] = pedirNombres(2);
		char matriz[][] = crearTablero(4,4);
		mostrarTablero(matriz);
		turnos(matriz, nombres);
	}
	
	public static String[] pedirNombres (int num) {
		String array[] = new String[num];
		for (int i = 0; i < array.length; i++)
			array[i] = JOptionPane.showInputDialog("Introduzca el "
					+ "nombre del / de la jugador/a " + (i + 1) + ":");
		return array;
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
	
	public static void turnos (char array[][], String nombres[]) {
		int numColumna = 0, fila, i = 0;
		for (i = 0; i < 9 && !juegoTerminado(array); i++) {
			do {
				fila = Integer.parseInt(JOptionPane.showInputDialog("Turno "
						+ "de " + nombres[i % 2] + ". Introduzca la fila:"));
				String columna = JOptionPane.showInputDialog("Turno de "
						+ nombres[i % 2] + ". Introduzca la columna:");
				char charColumna = columna.charAt(0);
				if (charColumna == 'A') numColumna = 0;
				if (charColumna == 'B') numColumna = 1;
				if (charColumna == 'C') numColumna = 2;
				if (array[fila][numColumna] != '□')
					JOptionPane.showMessageDialog(null, "Esa casilla está ocupada.");
			} while (array[fila][numColumna] != '□');
			if (i % 2 == 0) array [fila][numColumna] = 'O';
			if (i % 2 == 1) array [fila][numColumna] = 'X';
			mostrarTablero(array);
		}
		if (!juegoTerminado(array)) JOptionPane.showMessageDialog(null, "El"
				+ " juego ha terminado. La partida ha acabado en tablas.");
		else if (i % 2 == 1) JOptionPane.showMessageDialog(null, "El juego "
				+ "ha terminado. El / la ganador/a es " + nombres[0] + ".");
		else JOptionPane.showMessageDialog(null, "El juego ha terminado."
				+ " El / la ganador/a es " + nombres[1] + ".");
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
