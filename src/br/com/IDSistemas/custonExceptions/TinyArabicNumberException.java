package br.com.IDSistemas.custonExceptions;

public final class TinyArabicNumberException extends Exception {

	private static final long serialVersionUID = 1L;

	public TinyArabicNumberException(String errorMessage) {
		super(errorMessage);
	}
}
