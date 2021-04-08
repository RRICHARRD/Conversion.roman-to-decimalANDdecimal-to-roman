package model;

/**
 * 
 * @author Richard Guilherme
 *
 */
public class NumberV {

	public int letterValue;
	public static int timesUsed = 0;
	
	public NumberV() {
		++timesUsed;
		 letterValue = 5;
	}
	
	public static String numberValueOfV() {
		return "5";
	}
	
	
}
