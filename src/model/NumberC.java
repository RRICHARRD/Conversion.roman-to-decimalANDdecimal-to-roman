package model;

public class NumberC {

	public int letterValue;
	public static int timesUsed = 0;
	
	public NumberC() {
		++timesUsed;
		 letterValue = 100;
	}
	
	public static String numberValueOfC() {
		return "100";
	}
}
