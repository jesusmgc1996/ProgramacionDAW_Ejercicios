package Examenes.examenArrays;

public class EjercicioB {

	public static void main(String[] args) {
		int array[] = creaArrayNumerosAzar(5, 0, 100);
		mostrarArray(array);
		System.out.println();
		int array2[] = copiarArray(array);
		mostrarArray(array2);
	}
	
	public static int[] creaArrayNumerosAzar (int longitud, int limInf, int limSup) {
		int array[] = new int[longitud];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.round(Math.random() * (limSup - limInf)) + limInf);
		}
		return array;
	}
	
	public static void mostrarArray (int[] array) {
		System.out.println("Contenido del array:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public static int[] copiarArray (int array[]) {
		int array2[] = new int[5];
		for (int i = 0; i < array.length; i++)
			if (array2[i] == 0) array2[i] = array[(int) Math.round(Math.random() * 4)];
		return array2;
	}

}
