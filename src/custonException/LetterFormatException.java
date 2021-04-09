package custonException;

public final class LetterFormatException extends Exception {

	private static final long serialVersionUID = 1L;

	public LetterFormatException(String errorMessage) {
		super(errorMessage);
	}
}
