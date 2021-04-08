package model;

public class NumberX {

	public int letterValue;
	public static int timesUsed = 0;
	
	public NumberX() {
		++timesUsed;
		 letterValue = 10;
	}
	
	public static String numberValueOfX() {
		return "10";
	}
}
