package errors;

public class QuadraticException extends RuntimeException {

//	@java.io.Serial
	private static final long serialVersionUID = 4L;

	/**
	* Constructs a {@code QuadraticException} with no detail message.
	*/
	public QuadraticException() {
		super();
	}

	/**
	* Constructs a {@code QuadraticException} with the specified
	* detail message.
	*
	* @param   s   the detail message.
	*/
	public QuadraticException(String s) {
		super(s);
	}
}
