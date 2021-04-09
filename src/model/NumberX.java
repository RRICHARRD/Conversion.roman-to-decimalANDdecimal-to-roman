package model;

public final class NumberX extends RomanNumber {

	private static final int X = 10;
	private static int timesUsed = 0;
	
	public NumberX() {
		super(X);
		++timesUsed;
	}
	
	public static int getNumericalValueOfNumberX() {
		return X;
	}
	
	public static int getTimesUsed() {
		return timesUsed;
	}
	

}
