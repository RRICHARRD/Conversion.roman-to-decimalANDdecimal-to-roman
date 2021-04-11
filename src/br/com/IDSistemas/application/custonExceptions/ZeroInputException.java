package br.com.IDSistemas.application.custonExceptions;

public final class ZeroInputException extends Exception {

	private static final long serialVersionUID = 1L;

	public ZeroInputException(String errorMessage) {
		super(errorMessage);
	}
}
