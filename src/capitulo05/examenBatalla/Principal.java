package capitulo05.examenBatalla;

public class Principal {

	public static void main(String[] args) {
		
		CampoBatalla campo = new CampoBatalla();
		campo.setNombre("La Tierra");
		
		campo.mezclarMalvados();
		campo.mezclarHumanos();		
		campo.batalla();
		campo.humanosEliminados();
		campo.malvadosEliminados();
	}

}
