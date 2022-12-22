package capitulo06.bloque01;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Ejercicio02_ListaTexto {

	public static void main(String[] args) {
		// Declaración de las listas de Strings
		List<String> textList = new ArrayList<String>();
		List<String> textListAux = new ArrayList<String>();
		int opt;
		
		// Bucle para ejecutar el programa
		do {
			opt = menu(textList, textListAux);
		} while (opt != 0);
		textList.clear();
	}
	
	// Método para mostrar y ejecutar el menú
	public static int menu(List<String> textList, List<String> textListAux) {
		int opt = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la opción deseada:\n0. Abandonar el programa.\n"
				+ "1. Agregar una línea al texto.\n2. Insertar una línea en cualquier posición del texto.\n"
				+ "3. Editar una línea (reescribir su contenido).\n4. Borrar una línea.\n5. Cortar un conjunto de líneas.\n"
				+ "6. Pegar un conjunto de líneas cortadas en una determinada posición.\n7. Imprimir el fichero."));
		if (opt == 1) addLine(textList);
		if (opt == 2) addLineInPosition(textList);
		if (opt == 3) overwriteLine(textList);
		if (opt == 4) deleteLine(textList);
		if (opt == 5) cutLines(textList, textListAux);
		if (opt == 6) pasteLines(textList, textListAux);
		if (opt == 7) {
			for (String t: textList)
				System.out.println(t.toString());
			System.out.println();
		}
		return opt;
	}
	
	// Método para agregar una línea al texto
	public static void addLine (List<String> textList) {
		String text = JOptionPane.showInputDialog("Introduzca el texto deseado:");
		textList.add(text);
	}
	
	// Método para insertar una línea en la posición pedida
	public static void addLineInPosition (List<String> textList) {
		int pos = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la posición en la que quiere añadir el texto:"));
		String text = JOptionPane.showInputDialog("Introduzca el texto deseado:");
		textList.add(pos - 1, text);
	}
	
	// Método para editar una línea
	public static void overwriteLine (List<String> textList) {
		int pos = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número de la línea que quiere sobreescribir:"));
		System.out.println(textList.get(pos - 1));
		String text = JOptionPane.showInputDialog("Introduzca el texto deseado:");
		textList.remove(pos - 1);
		textList.add(pos - 1, text);
	}
	
	// Método para borrar una línea
	public static void deleteLine (List<String> textList) {
		int pos = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número de la línea que quiere eliminar:"));
		textList.remove(pos - 1);
	}
	
	// Método para cortar un conjunto de líneas
	public static void cutLines (List<String> textList, List<String> textListAux) {
		int posI = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número de la primera línea que quiere eliminar:"));
		int posF = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número de la última línea que quiere eliminar:"));
		textListAux.clear();
		// Se copian y se borran las líneas deseadas en orden inverso
		for (int i = 0; i <= posF - posI; i++) {
			textListAux.add(i, textList.get(posF - 1 - i));
			textList.remove(posF - 1 - i);
		}
	}
	
	// Método para pegar un conjunto de líneas en la posición pedida
	public static void pasteLines (List<String> textList, List<String> textListAux) {
		int pos = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número de la línea en la que quiere insertar el texto"
				+ " cortado:"));
		// Se copian las líneas una por una en la posición deseada para que queden ordenadas
		for (String t: textListAux)
			textList.add(pos - 1, t);
	}

}
