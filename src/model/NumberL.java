package model;

public final class NumberL extends RomanNumber {

	private static final int L = 50;
	private static int timesUsed = 0;
	
	public NumberL() {
		super(L);
		++timesUsed;
	}
	
	public static int getNumericalValueOfLetterL() {
		return L;
	}
	
	public static int getTimesUsed() {
		return timesUsed;
	}

}
