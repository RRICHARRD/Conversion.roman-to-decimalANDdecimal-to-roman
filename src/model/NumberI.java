package model;

public class NumberI {
	
	public int letterValue;
	public static int timesUsed = 0;
	
	public NumberI() {
		++timesUsed;
		 letterValue = 1;
	}
	
	public static String numberValueOfI() {
		return "1";
	}
}
