package br.com.IDSistemas.application.custonExceptions;

public final class EnormousDecimalException extends Exception {

	private static final long serialVersionUID = 1L;

	public EnormousDecimalException(String errorMessage) {
		super(errorMessage);
	}
}
