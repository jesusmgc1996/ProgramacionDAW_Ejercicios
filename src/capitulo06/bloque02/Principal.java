package capitulo06.bloque02;

import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class Principal {
	
	private static HashMap<String, Articulo> store = new HashMap<String, Articulo>();

	public static void main(String[] args) {
		int opt;
		
		// Bucle para ejecutar el programa
		do {
			opt = menu();
			if (opt == 1) itemsList();
			if (opt == 2) createItem();
			if (opt == 3) deleteItem();
			if (opt == 4) updateItem();
		} while (opt != 0);
	}
	
	// Método para mostrar el menú
	public static int menu() {
		int opt = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la opción deseada:\n0. Salir.\n1. Lista de artículos."
				+ "\n2. Crear un nuevo artículo.\n3. Eliminar un artículo.\n4. Actualizar un artículo."));
		return opt;
	}
	
	public static void itemsList() {
		Iterator<Articulo> items = store.values().iterator();
		System.out.println("\nArtículos:");
		while (items.hasNext())
			System.out.println(items.next());
	}
	
	public static void createItem() {
		String barcode = JOptionPane.showInputDialog("Introduzca el código de barras del artículo:");
		String name = JOptionPane.showInputDialog("Introduzca el nombre del artículo:");
		String shelfNum = JOptionPane.showInputDialog("Introduzca el número de estante del artículo:");
		int stock = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad disponible del artículo:"));
		store.put(barcode, new Articulo(barcode, name, shelfNum, stock));
	}
	
	public static void deleteItem() {
		String barcode = JOptionPane.showInputDialog("Introduzca el código de barras del artículo que quiere eliminar:");
		store.remove(barcode);
	}
	
	public static void updateItem() {
		String barcode = JOptionPane.showInputDialog("Introduzca el código de barras del artículo que quiere actualizar:");
		String name = JOptionPane.showInputDialog("Introduzca el nombre del artículo:");
		String shelfNum = JOptionPane.showInputDialog("Introduzca el nuevo número de estante del artículo:");
		int stock = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la nueva cantidad disponible del artículo:"));
		store.replace(barcode, new Articulo(barcode, name, shelfNum, stock));
	}

}
