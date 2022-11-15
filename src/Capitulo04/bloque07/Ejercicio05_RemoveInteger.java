package Capitulo04.bloque07;

public class Ejercicio05_RemoveInteger {

	public static void main(String[] args) {
		int a[] = utils.UtilsArrays.creaArrayNumerosAzar(25, 0, 20);
		int num = 10;
		utils.UtilsArrays.mostrarArray(a);
		int a2[] = removeInteger(a, num);
		utils.UtilsArrays.mostrarArrayConCambios(a2);		
	}
	
	public static int[] removeInteger (int a[], int num) {
		int count = countOcurrences(a, num);
		int a2[] = new int[a.length - count];
		int j = 0;
		for (int i = 0; i < a.length; i++)
			if (a[i] != num) {
				a2[j] = a[i];
				j++;
			}
		return a2;
	}
	
	public static int countOcurrences (int a[], int num) {
		int count = 0;
		for (int i = 0; i < a.length; i++)
			if (a[i] == num) count++;
		return count;
	}

}
