package Capitulo04.bloque05;

import javax.swing.JOptionPane;

/*
 * 2º.- Crea un array de 20 números enteros generados al azar entre
 * 0 y 10. Analiza el array y calcula el porcentaje (con decimales)
 * de notas aprobadas ( >= 5 ) y de notas suspensas.
*/

public class Ejercicio02_ArrayPorcentajeNotas {

	public static void main(String[] args) {
		int array[] = utils.UtilsArrays.creaArrayNumerosAzar(20, 0, 10);
		utils.UtilsArrays.mostrarArray(array);
		float passedPercentage = getPassedPercentage(array);
		showResults(passedPercentage);
	}
	
	public static float getPassedPercentage (int array[]) {
		int passed = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= 5) passed++;
		}
		float passedPercentage = passed / (float) array.length;
		return passedPercentage;
	}
	
	public static void showResults (float num) {
		JOptionPane.showMessageDialog(null, "El porcentaje de notas aprobadas es: "
				+ num + "\nEl porcentaje de notas suspensas es: " + (1 - num));
	}

}
