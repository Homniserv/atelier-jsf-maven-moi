package exception;

public class AtelierException extends Exception {
	private static final long serialVersionUID = -2151515147355511072L;
	private String message = null;

	public AtelierException() {
		super();
	}

	public AtelierException(String message) {
		super(message);
		this.message = message;
	}

	public AtelierException(Throwable cause) {
		super(cause);
	}

	/** https://stackoverflow.com/questions/22116175/custom-exception-class-shows-unreachable-catch-block-everytime/22116233 */
	public void printStackTrace() {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return message;
	}

	@Override
	public String getMessage() {
		return message;
	}

}
