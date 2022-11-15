package Capitulo04.bloque07;

public class Ejercicio04_CountOccurrences {

	public static void main(String[] args) {
		int a[] = utils.UtilsArrays.creaArrayNumerosAzar(20, 0, 10);
		int num = 5;
		utils.UtilsArrays.mostrarArray(a);
		int count = countOcurrences(a, num);
		System.out.println("El número " + num + " se ha encontrado "
				+ count	+ " veces en el array.");
	}
	
	public static int countOcurrences (int a[], int num) {
		int count = 0;
		for (int i = 0; i < a.length; i++)
			if (a[i] == num) count++;
		return count;
	}

}
