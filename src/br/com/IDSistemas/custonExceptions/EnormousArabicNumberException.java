package br.com.IDSistemas.custonExceptions;

public final class EnormousArabicNumberException extends Exception {

	private static final long serialVersionUID = 1L;

	public EnormousArabicNumberException(String errorMessage) {
		super(errorMessage);
	}
}
