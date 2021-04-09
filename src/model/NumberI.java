package model;

public final class NumberI extends RomanNumber {
	
	private static final int I = 1;
	private static int timesUsed = 0;
	
	public NumberI() {
		super(I);
		++timesUsed;
	}
	
	public static int getNumericalValueOfLetterI() {
		return I;
	}
	
	public static int getTimesUsed() {
		return timesUsed;
	}
	
}
