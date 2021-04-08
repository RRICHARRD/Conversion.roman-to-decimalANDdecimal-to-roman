package br.com.IDSistemas.application.model;

public final class NumberM {

	private static final int M = 1000;
	private static int timesUsed = 0;
	
	public NumberM() {
		++timesUsed;
	}

	public static int getNumericalValueOfLetterM() {
		return M;
	}
	
	public static int getTimesUsed() {
		return timesUsed;
	}
	
}
