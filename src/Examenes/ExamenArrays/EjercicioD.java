package Examenes.ExamenArrays;

public class EjercicioD {

	public static void main(String[] args) {
		char frase[] = {'H','o','l','a',' ','M','u','n','d','o'};
		String str = minusculas(frase);
		System.out.println(str);
	}
	
	public static String minusculas (char frase[]) {
		String str = "";
		for (int i = 0; i < frase.length; i++) {
			if (frase[i] > 65 && frase[i] < 90) str += (char) (frase[i] + 32);
			else str += frase[i];
		}
		return str;
	}

}
