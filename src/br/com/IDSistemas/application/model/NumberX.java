package br.com.IDSistemas.application.model;

public final class NumberX {

	private static final int X = 10;
	private static int timesUsed = 0;
	
	public NumberX() {
		++timesUsed;
	}
	
	public static int getNumericalValueOfNumberX() {
		return X;
	}
	
	public static int getTimesUsed() {
		return timesUsed;
	}
	

}
