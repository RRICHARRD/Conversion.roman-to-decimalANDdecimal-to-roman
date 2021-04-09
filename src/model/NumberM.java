package model;

public final class NumberM extends RomanNumber {

	private static final int M = 1000;
	private static int timesUsed = 0;
	
	public NumberM() {
		super(M);
		++timesUsed;
	}

	public static int getNumericalValueOfLetterM() {
		return M;
	}
	
	public static int getTimesUsed() {
		return timesUsed;
	}
	
}
