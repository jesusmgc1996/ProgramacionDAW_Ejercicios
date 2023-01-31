package capitulo07.bloque01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Ejercicio04_Propiedades {

	private static Properties PROPERTIES = null;

	public static void main(String[] args) {
		String name = getProperty("NOMBRE");
		float note = getFloatProperty("NOTA");
		int age = getIntProperty("EDAD");
		boolean adult = getBooleanProperty("ADULTO");
		
		System.out.println("Nombre: " + name);
		System.out.println("Nota: " + note);
		System.out.println("Edad: "+ age);
		System.out.println("Mayor de edad: " + adult);
	}

	/**
	 * 
	 */
	public Ejercicio04_Propiedades () {
		super();
	}
	
	/**
	 * @return
	 */
	private static Properties getProperties() {
		if (PROPERTIES == null) {
			PROPERTIES = new Properties();
			try {
				File file = new File("./src/capitulo07/bloque01/properties");
				PROPERTIES.load(new FileReader(file));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			 
		}
		return PROPERTIES;
	}

	/**
	 * @param propertyName
	 * @return
	 */
	public static String getProperty(String propertyName) {
		return getProperties().getProperty(propertyName);
	}
	
	/**
	 * @param propertyName
	 * @return
	 */
	public static int getIntProperty(String propertyName) {
		return Integer.parseInt(getProperties().getProperty(propertyName));
	}
	
	/**
	 * @param propertyName
	 * @return
	 */
	public static Float getFloatProperty(String propertyName) {
		return Float.parseFloat(getProperties().getProperty(propertyName));
	}
	
	/**
	 * @param propertyName
	 * @return
	 */
	public static Boolean getBooleanProperty(String propertyName) {
		return Boolean.parseBoolean(getProperties().getProperty(propertyName));
	}

}
