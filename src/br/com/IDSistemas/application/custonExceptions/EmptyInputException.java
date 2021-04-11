package br.com.IDSistemas.application.custonExceptions;

public final class EmptyInputException extends Exception {

	private static final long serialVersionUID = 1L;

	public EmptyInputException(String errorMessage) {
		super(errorMessage);
	}
}
