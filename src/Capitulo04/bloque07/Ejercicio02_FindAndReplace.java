package Capitulo04.bloque07;

public class Ejercicio02_FindAndReplace {

	public static void main(String[] args) {
		int a[] = utils.UtilsArrays.creaArrayNumerosAzar(15, 0, 5);
		int wanted = 4;
		int replacement = 8;
		utils.UtilsArrays.mostrarArray(a);
		findAndReplace(a, wanted, replacement);
		utils.UtilsArrays.mostrarArrayConCambios(a);
	}
	
	public static void findAndReplace (int a[], int wanted, int replacement) {
		for (int i = 0; i < a.length; i++)
			if (a[i] == wanted) a[i] = replacement;
	}

}
