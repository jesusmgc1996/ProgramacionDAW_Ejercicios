package Examenes.examen09022023.ejercicio04;

public class ValorIncorrectoException extends Exception {

	public ValorIncorrectoException() {
		super();
	}

	public ValorIncorrectoException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ValorIncorrectoException(String message, Throwable cause) {
		super(message, cause);
	}

	public ValorIncorrectoException(String message) {
		super(message);
	}

	public ValorIncorrectoException(Throwable cause) {
		super(cause);
	}

}
