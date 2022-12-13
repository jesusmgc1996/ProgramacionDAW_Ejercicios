package Examenes.examenObjetos;

import java.util.Scanner;

public class Juego {

	public static void main(String[] args) {
		
		int LONGITUD_ARRAY = 20;
		Scanner sc = new Scanner(System.in);
		
		Ladrillo ladrillos[] = new Ladrillo[LONGITUD_ARRAY];
		Pelota pelota = new Pelota();
		Ladrillo arrayLadrillosEliminados[] = new Ladrillo[LONGITUD_ARRAY];
		
		boolean pelotaTocaLadrillo = false;
		int ladrillosEliminados = 0;
		
		// Se inicializan los ladrillos
		for (int i = 0; i < ladrillos.length; i++)
			ladrillos[i] = new Ladrillo();
		
		// Comienza la partida
		do {
			
			// Se asignan coordenadas a la pelota
			pelota.setX((int) Math.round(Math.random() * 900));
			pelota.setY((int) Math.round(Math.random() * 600));
			
			for (int i = 0; i < ladrillos.length; i++) {
				
				// Se comprueba si la pelota toca algún ladrillo
				if (ladrillos[i] != null && pelota.getX() > ladrillos[i].getX() &&
						pelota.getX() < (ladrillos[i].getX() + ladrillos[i].getAncho())
						&& pelota.getY() > ladrillos[i].getY() &&
						pelota.getY() < (ladrillos[i].getY() + ladrillos[i].getAlto()))
					pelotaTocaLadrillo = true;

				// Si una pelota toca un ladrillo, el ladrillo pierde un punto de vida
				if (ladrillos[i] != null && pelotaTocaLadrillo == true) {
					ladrillos[i].setPuntosVida(ladrillos[i].getPuntosVida() - 1);
					// Si el ladrillo pierde todos los puntos de vida, se elimina
					if (ladrillos[i].getPuntosVida() == 0) {
						arrayLadrillosEliminados[ladrillosEliminados] = ladrillos[i];
						ladrillosEliminados++;
						ladrillos[i] = null;
					}
				}
			}
			
			// Se imprime en consola el estado de los ladrillos no eliminados
			for (int i = 0; i < ladrillos.length; i++)
				if (ladrillos[i] != null) System.out.println(ladrillos[i].toString());
			
			if (ladrillosEliminados == LONGITUD_ARRAY) {
				// Al destruir todos los ladrillos, se muestran el primero y el último en ser eliminados
				System.out.println("\nEl primer ladrillo en ser eliminado fue:\n"
						+ arrayLadrillosEliminados[0].toString());
				System.out.println("\nEl último ladrillo en ser eliminado fue:\n"
						+ arrayLadrillosEliminados[LONGITUD_ARRAY - 1].toString());
				
				// Se muestran los ladrillos por orden de eliminación
				System.out.println("\nLos ladrillos fueron eliminados en el siguiente orden:");
				for (int i = 0; i < arrayLadrillosEliminados.length; i++)
					System.out.println(arrayLadrillosEliminados[i].toString());
				
				// Se pregunta al usuario si quiere volver a empezar el juego
				System.out.println("\nEl juego ha acabado. Elija la opción deseada:\n1. Salir\n2. Reiniciar");
				int opt = sc.nextInt();
				if (opt == 1) System.out.println("¡Gracias por jugar! ¡Adiós!");;
				if (opt == 2) {
					// Se vuelven a inicializar los ladrillos y otras variables para reiniciar el juego
					for (int i = 0; i < ladrillos.length; i++)
						ladrillos[i] = new Ladrillo();
					pelotaTocaLadrillo = false;
					ladrillosEliminados = 0;
				}
			}	
		} while (ladrillosEliminados < LONGITUD_ARRAY);
	}

}
