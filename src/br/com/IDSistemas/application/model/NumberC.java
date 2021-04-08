package br.com.IDSistemas.application.model;

public final class NumberC {

	private static final int C = 100;
	private static int timesUsed = 0;
	
	public NumberC() {
		++timesUsed;
	}
	
	public static int getNumericalValueOfNumberC() {
		return C;
	}
	
	public static int getTimesUsed() {
		return timesUsed;
	}
	
}
