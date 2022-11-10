package Capitulo04.bloque05;

import javax.swing.JOptionPane;

public class Ejercicio04_ArrayBidimensional {

	public static void main(String[] args) {
		int matrix[][] = new int[5][5];
		fillMatrix(matrix);
		showMatrix(matrix);
		positiveMatrix(matrix);
		diagonalMatrix(matrix);
		upperTriangularMatrix(matrix);
		sparseMatrix(matrix);
		oneDimensionalArray(matrix);
		symmetricMatrix(matrix);
		transposedMatrix(matrix);
		oppositeMatrix(matrix);
		deleteRow(matrix);
	}
	
	public static void fillMatrix (int matrix[][]) {
		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < matrix[i].length; j++)
				matrix[i][j] = utils.Utils.obtenerNumeroAzar();
	}
	
	public static void showMatrix (int matrix[][]) {
		System.out.println("Contenido de la matriz:");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++)
				System.out.print(matrix[i][j] + "\t");
			System.out.println();
		}
		System.out.println();
	}
	
	public static boolean positiveMatrix (int matrix[][]) {
		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < matrix[i].length; j++)
				if (matrix[i][j] < 0) return false;
		return true;
	}
	
	public static boolean diagonalMatrix (int matrix[][]) {
		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < i; j++)
				if (matrix[i][j] != 0) return false;
		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j > i; j++)
				if (matrix[i][j] != 0) return false;
		return true;
	}
	
	public static boolean upperTriangularMatrix (int matrix[][]) {
		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < i; j++)
				if (matrix[i][j] != 0) return false;
		return true;
	}
	
	public static boolean sparseMatrix (int matrix[][]) {
		for (int i = 0; i < matrix.length; i++) {
			boolean zeroExists = false;
			for (int j = 0; j < matrix.length; j++)
				if (matrix[i][j] == 0) zeroExists = true;
			if (!zeroExists) return false;
		}
		for (int i = 0; i < matrix.length; i++) {
			boolean zeroExists = false;
			for (int j = 0; j < matrix.length; j++)
				if (matrix[j][i] == 0) zeroExists = true;
			if (!zeroExists) return false;
		}
		return true;
	}
	
	public static void oneDimensionalArray (int matrix[][]) {
		int array[] = new int[matrix.length * matrix[0].length];
		int k = 0;
		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < matrix[i].length; j++) {
				array[k] = matrix[i][j];
				k++;
			}
	}
	
	public static boolean symmetricMatrix (int matrix[][]) {
		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < matrix[i].length; j++)
				if (matrix[i][j] != matrix[j][i]) return false;
		return true;
	}
	
	public static void transposedMatrix (int matrix[][]) {
		int tMatrix[][] = new int[matrix[0].length][matrix.length];
		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < matrix[0].length; j++)
				tMatrix[i][j] = matrix[j][i];
	}
	
	public static void oppositeMatrix (int matrix[][]) {
		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < matrix[i].length; j++)
				matrix[i][j] *= -1;
	}
	
	public static void deleteRow (int matrix[][]) {
		int matrix2[][] = new int[matrix.length - 1][matrix[0].length];
		int row = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número"
				+ " de la fila que quiere eliminar:"));
		int k = 0;
		for (int i = 0; i < matrix.length; i++)
			if (i != (row - 1)) {
				for (int j = 0; j < matrix[i].length; j++)
					matrix2[k][j] = matrix[i][j];
				k++;
			}
	}

}
