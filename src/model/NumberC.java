package model;

public final class NumberC extends RomanNumber {

	private static final int C = 100;
	private static int timesUsed = 0;
	
	public NumberC() {
		super(C);
		++timesUsed;
	}
	
	public static int getNumericalValueOfNumberC() {
		return C;
	}
	
	public static int getTimesUsed() {
		return timesUsed;
	}
	
}
