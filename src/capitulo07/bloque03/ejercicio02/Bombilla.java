package capitulo07.bloque03.ejercicio02;

import javax.swing.JOptionPane;

public class Bombilla {

	public static void main(String[] args) {
		do {
			try {
				String str = JOptionPane.showInputDialog("Introduzca una frase con la palabra bombilla:");
				notWords(str);
				notThreeWords(str);
				notBombilla(str);
				offensiveWord(str);
				System.out.println(str);
				break;
			}
			catch(NotWordsException ex) {
				System.out.println(ex.getMessage());
			}
			catch(NotThreeWordsException ex) {
				System.out.println(ex.getMessage());
			}
			catch(NotBombillaException ex) {
				System.out.println(ex.getMessage());
			}
			catch(OffensiveWordException ex) {
				System.out.println(ex.getMessage());
			}
		} while (true);
	}
	
	public static void notWords(String str) throws NotWordsException {
		if (str.isBlank()) throw new NotWordsException("La frase no contiene palabras.");
	}
	
	public static void notThreeWords(String str) throws NotThreeWordsException {
		String words[] = str.split("[ ]{1,}");
		if (words.length < 3) throw new NotThreeWordsException("La frase contiene menos de tres palabras.");
	}
	
	public static void notBombilla(String str) throws NotBombillaException {
		if (!str.contains("bombilla")) throw new NotBombillaException("La frase no contiene la palabra bombilla.");
	}
	
	public static void offensiveWord(String str) throws OffensiveWordException {
		if (str.contains("tonto")) throw new OffensiveWordException("La frase contiene la siguiente palabra ofensiva: tonto.");
		if (str.contains("tonta")) throw new OffensiveWordException("La frase contiene la siguiente palabra ofensiva: tonta.");
		if (str.contains("idiota")) throw new OffensiveWordException("La frase contiene la siguiente palabra ofensiva: idiota.");
	}

}
