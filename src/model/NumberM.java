package model;

public class NumberM {

	public int letterValue;
	public static int timesUsed = 0;
	
	public NumberM() {
		++timesUsed;
		 letterValue = 1000;
	}
	
	public static String numberValueOfM() {
		return "1000";
	}
}
