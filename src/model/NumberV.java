package model;

public final class NumberV extends RomanNumber {

	private static final int V = 5;
	private static int timesUsed = 0;
	
	public NumberV() {
		super(V);
		++timesUsed;
	}
	
	public static final int getNumericalValueOfLetterV() {
		return V;
	}
	
	public static int getTimesUsed() {
		return timesUsed;
	}

}
