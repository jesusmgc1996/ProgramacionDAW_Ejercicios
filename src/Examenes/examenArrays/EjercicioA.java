package Examenes.examenArrays;

public class EjercicioA {

	public static void main(String[] args) {
		int matriz[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		System.out.println("¿La matriz está ordenada? " + matrizEstaOrdenada(matriz));
	}
	
	public static boolean matrizEstaOrdenada (int matriz[][]) {
		for (int i = 0; i < matriz.length; i++)
			for (int j = 1; j < matriz[i].length; j++) {
				if (i > 0 && matriz[i][0] < matriz[i - 1][3]) return false;
				if (matriz[i][j] < matriz[i][j - 1]) return false;
			}
		return true;
	}

}
