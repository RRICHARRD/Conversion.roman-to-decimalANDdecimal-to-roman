package model;

public class NumberL {

	public int letterValue;
	public static int timesUsed = 0;
	
	public NumberL() {
		++timesUsed;
		 letterValue = 50;
	}
	
	public static String numberValueOfL() {
		return "50";
	}
}
