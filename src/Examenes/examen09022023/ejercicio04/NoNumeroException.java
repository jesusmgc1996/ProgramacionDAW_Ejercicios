package Examenes.examen09022023.ejercicio04;

public class NoNumeroException extends Exception {

	public NoNumeroException() {
		super();
	}

	public NoNumeroException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public NoNumeroException(String message, Throwable cause) {
		super(message, cause);
	}

	public NoNumeroException(String message) {
		super(message);
	}

	public NoNumeroException(Throwable cause) {
		super(cause);
	}
	
}
