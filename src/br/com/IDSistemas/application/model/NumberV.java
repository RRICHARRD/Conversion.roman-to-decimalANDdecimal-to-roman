package br.com.IDSistemas.application.model;

public final class NumberV {

	private static final int V = 5;
	private static int timesUsed = 0;
	
	public NumberV() {
		++timesUsed;
	}
	
	public static final int getNumericalValueOfLetterV() {
		return V;
	}
	
	public static int getTimesUsed() {
		return timesUsed;
	}
	
	public static void setTimesUsedToZero() {
		timesUsed = 0;
	}

}
