package capitulo05.bloque01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int opcion;
		Scanner sc = new Scanner(System.in);
		Persona p[] = new Persona[3];
		do {
			System.out.println("\n0- Salir"
					+ "\n1- Introducir datos"
					+ "\n2- Ver datos"
					+ "\n\nIntroduzca su opción: ");
			
			opcion = Integer.parseInt(sc.nextLine());
			
			switch (opcion) {
			case 1:
				for (int i = 0; i < p.length; i++) {
					p[i] = new Persona();
					System.out.println("\nIntroduzca el nombre de la persona " + (i + 1) + ": ");
					p[i].setNombre(sc.nextLine());
					System.out.println("Introduzca los apellidos de la persona " + (i + 1) + ": ");
					p[i].setApellidos(sc.nextLine());
					System.out.println("Introduzca el DNI de la persona " + (i + 1) + ": ");
					p[i].setDni(sc.nextLine());
					System.out.println("Introduzca la dirección de la persona " + (i + 1) + ": ");
					p[i].setDireccion(sc.nextLine());
					System.out.println("Introduzca el teléfono de la persona " + (i + 1) + ": ");
					p[i].setTelefono(sc.nextLine());
				}
				break;
			case 2:
				for (int i = 0; i < p.length; i++)
					System.out.println(p[i].toString());
			}
			
		} while (opcion != 0);
		
	}

}
