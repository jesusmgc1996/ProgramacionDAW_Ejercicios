package capitulo05.bloque01;

public class Persona {
	
	//Propiedades de la clase
	private String nombre;
	private String apellidos;
	private String dni;
	private String direccion;
	private String telefono;
	
	/**
	 * Método constructor por defecto
	 */
	public Persona() {
		
	}
	
	/**
	 * Método constructor
	 * @param name
	 * @param surname
	 * @param dni
	 * @param Adress
	 * @param phoneNumber
	 */
	public Persona (String nombre, String apellidos, String dni, String direccion, String telefono) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos (String apellidos) {
		this.apellidos = apellidos;
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setDni (String dni) {
		this.dni = dni;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion (String direccion) {
		this.direccion = direccion;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono (String telefono) {
		this.telefono = telefono;
	}
	
	public String toString() {
		return "\nNombre: " + nombre + " - Apellidos: " + apellidos + " - DNI: " + dni +
				" - Dirección: " + direccion + " - Teléfono: " + telefono;
	}

}
