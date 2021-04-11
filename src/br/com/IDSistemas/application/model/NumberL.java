package br.com.IDSistemas.application.model;

public final class NumberL {

	private static final int L = 50;
	private static int timesUsed = 0;
	
	public NumberL() {
		++timesUsed;
	}
	
	public static int getNumericalValueOfLetterL() {
		return L;
	}
	
	public static int getTimesUsed() {
		return timesUsed;
	}

	public static void setTimesUsedToZero() {
		timesUsed = 0;
	}
}
