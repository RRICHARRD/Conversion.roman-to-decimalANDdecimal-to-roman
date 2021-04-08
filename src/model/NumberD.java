package model;

public class NumberD {

	public int letterValue;
	public static int timesUsed = 0;
	
	public NumberD() {
		++timesUsed;
		 letterValue = 500;
	}
	
	public static String numberValueOfD() {
		return "500";
	}
}
