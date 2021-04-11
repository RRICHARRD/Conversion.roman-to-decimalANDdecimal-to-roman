package br.com.IDSistemas.application.model;

public final class NumberI {
	
	private static final int I = 1;
	private static int timesUsed = 0;
	
	public NumberI() {
		++timesUsed;
	}
	
	public static int getNumericalValueOfLetterI() {
		return I;
	}
	
	public static int getTimesUsed() {
		return timesUsed;
	}
	
	public static void setTimesUsedToZero() {
		timesUsed = 0;
	}
}
