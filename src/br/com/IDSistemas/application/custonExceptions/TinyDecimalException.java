package br.com.IDSistemas.application.custonExceptions;

public final class TinyDecimalException extends Exception {

	private static final long serialVersionUID = 1L;

	public TinyDecimalException(String errorMessage) {
		super(errorMessage);
	}
}
