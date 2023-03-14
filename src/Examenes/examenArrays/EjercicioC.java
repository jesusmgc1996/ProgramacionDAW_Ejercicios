package Examenes.examenArrays;

public class EjercicioC {

	public static void main(String[] args) {
		float array[] = new float [10];
		for (int i = 0; i < array.length; i++) {
			if (i == 0) array[i] = 1;
			else if (i == 1) array[i] = 0 * array[i - 1] + array[i - 1]/2;
			else array[i] = array[i - 1] * array[i - 2] + array[i - 1]/2;
			System.out.print(array[i] + " ");
		}
	}

}
