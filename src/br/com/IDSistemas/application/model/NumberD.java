package br.com.IDSistemas.application.model;

public final class NumberD {

	private static final int D = 500;
	private static int timesUsed = 0;
	
	public NumberD() {
		++timesUsed;
	}
	
	public static int getNumericalValueOfLetterD() {
		return D;
	}
	
	public static int getTimesUsed() {
		return timesUsed;
	}
	
	public static void setTimesUsedTozero() {
		timesUsed = 0;
	}
	
}
