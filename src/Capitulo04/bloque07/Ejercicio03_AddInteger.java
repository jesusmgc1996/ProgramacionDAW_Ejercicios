package Capitulo04.bloque07;

public class Ejercicio03_AddInteger {

	public static void main(String[] args) {
		int a[] = utils.UtilsArrays.creaArrayNumerosAzar(5, 0, 100);
		int num = 64;
		utils.UtilsArrays.mostrarArray(a);
		int a2[] = addInteger(a, num);
		utils.UtilsArrays.mostrarArrayConCambios(a2);
	}
	
	public static int[] addInteger (int a[], int num) {
		int a2[] = new int[a.length + 1];
		for (int i = 0; i < a.length; i++)
			a2[i] = a[i];
		a2[a.length] = num;
		return a2;
	}

}
