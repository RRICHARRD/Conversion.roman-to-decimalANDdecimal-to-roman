package br.com.IDSistemas.custonExceptions;

public final class ZeroException extends Exception {

	private static final long serialVersionUID = 1L;

	public ZeroException(String errorMessage) {
		super(errorMessage);
	}
}
