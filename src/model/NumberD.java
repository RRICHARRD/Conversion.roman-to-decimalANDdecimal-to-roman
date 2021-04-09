package model;

public final class NumberD extends RomanNumber {

	private static final int D = 500;
	private static int timesUsed = 0;
	
	public NumberD() {
		super(D);
		++timesUsed;
	}
	
	public static int getNumericalValueOfLetterD() {
		return D;
	}
	
	public static int getTimesUsed() {
		return timesUsed;
	}
	
}
