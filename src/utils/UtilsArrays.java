package utils;

/**
 * 
 * @author jesus
 *
 */
public class UtilsArrays {

	/**
	 * 
	 * @param array
	 */
	public static void mostrarArray (int[] array) {
		System.out.println("Contenido del array:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	/**
	 * 
	 * @param array
	 */
	public static void mostrarArrayOrdenado(int array[]) {
		System.out.println("Array ordenado:");
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
	}

	/**
	 * 
	 * @param longitud
	 * @param limInf
	 * @param limSup
	 * @return
	 */
	public static int[] creaArrayNumerosAzar (int longitud, int limInf, int limSup) {
		int array[] = new int[longitud];
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar(limInf, limSup);
		}
		return array;
	}

	/**
	 * 
	 * @param longitud
	 * @param limInf
	 * @param limSup
	 * @return
	 */
	public static int[] creaArrayNumerosUsuario (int longitud) {
		int array[] = new int[longitud];
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerEntero();
		}
		return array;
	}
	
	/**
	 * 
	 * @param array
	 */
	public static void ordenaArray (int array[]) {
		boolean hayIntercambios;
		do {
			hayIntercambios = false;
			// Empieza el algoritmo
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i+1] < array[i]) {
					// Entonces hago un intercambio
					int aux = array[i+1];
					array[i+1] = array[i];
					array[i] = aux;
					hayIntercambios = true;
				}
			}
		} while (hayIntercambios);
	}
	
	/**
	 * 
	 * @param filas
	 * @param columnas
	 * @param limInf
	 * @param limSup
	 * @return
	 */
	public static int[][] crearMatriz (int filas, int columnas, int limInf, int limSup){
		int array[][] = new int[filas][columnas];
		for (int i = 0; i < array.length; i++)
			for (int j = 0; j < array[i].length; j++)
				array[i][j] = utils.Utils.obtenerNumeroAzar(limInf, limSup);
		return array;
	}
	
	/**
	 * 
	 * @param array
	 */
	public static void mostrarMatriz (int array[][]) {
		System.out.println("Contenido de la matriz:");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++)
				System.out.print(array[i][j] + "\t");
			System.out.println();
		}
		System.out.println();
	}

}
