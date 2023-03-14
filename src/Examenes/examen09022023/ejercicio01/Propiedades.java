package Examenes.examen09022023.ejercicio01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

public class Propiedades {

	private static Properties propiedades = null;

	public static void main(String[] args) {
		HashMap<String, Object> hm = new HashMap<String, Object>();
		List<Integer> nums = new ArrayList<Integer>();
		for (int i = 0; i < 4; i++)
			hm.put("" + i, getIntProperty("NUM" + (i + 1)));
		for (int i = 4; i < 8; i++)
			hm.put("" + i, getProperty("STR" + (i - 4 + 1)));
		Iterator<Object> it = hm.values().iterator();
		while(it.hasNext()) {
			int count = 0;
			String siguiente = it.next().toString();
			char palabra[] = siguiente.toCharArray();
			for (int i = 0; i < palabra.length; i++)
				if (Character.isLetter(palabra[i])) count++;
			if (count == 0) nums.add(Integer.parseInt(siguiente));
		}
		for (Integer n: nums)
			System.out.print(n.toString() + " ");
	}

	/**
	 * 
	 */
	public Propiedades() {
		super();
	}
	
	/**
	 * @return
	 */
	private static Properties getProperties() {
		if (propiedades == null) {
			propiedades = new Properties();
			try {
				File file = new File("./src/Examenes/examen09022023/ejercicio01/properties");
				propiedades.load(new FileReader(file));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			 
		}
		return propiedades;
	}

	/**
	 * @param nombrePropiedad
	 * @return
	 */
	public static String getProperty(String nombrePropiedad) {
		return getProperties().getProperty(nombrePropiedad);
	}
	
	/**
	 * @param nombrePropiedad
	 * @return
	 */
	public static int getIntProperty(String nombrePropiedad) {
		return Integer.parseInt(getProperties().getProperty(nombrePropiedad));
	}

}
