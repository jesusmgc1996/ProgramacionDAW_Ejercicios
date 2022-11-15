package Capitulo04.bloque07;

/*
 * 1.- Un método llamado "stringFromArray", que reciba un array de números enteros
 * y devuelva una cadena de caracteres. El método debe recorrer el array, de la misma
 * forma en la que harías para mostrarlo en consola, pero en lugar de imprimir en
 * consola debes construir un objeto String. Finalmente debes devolver el String e
 * imprimirlo en el método "main".
*/

public class Ejercicio01_StringFromArray {

	public static void main(String[] args) {
		int a[] = utils.UtilsArrays.creaArrayNumerosAzar(10, 65, 90);
		utils.UtilsArrays.mostrarArray(a);
		String str = StringFromArray(a);
		System.out.println("\nLa cadena de caracteres es: " + str);
	}
	
	public static String StringFromArray (int a[]) {
		String str = "";
		for (int i = 0; i < a.length; i++)
			str += (char) a[i];
		return str;
	}

}
