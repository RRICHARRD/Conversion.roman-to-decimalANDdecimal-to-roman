package br.com.IDSistemas.application.custonExceptions;

public final class IlegalRomanPatternException extends Exception {

	private static final long serialVersionUID = 1L;

	public IlegalRomanPatternException(String errorMessage) {
		super(errorMessage);
	}
}
