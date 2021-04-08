package model;

public class CouterOfTimesForEachNumberUsed {

	public static void showAllTimesEachNumberWasUsed() {
		
		Integer I = NumberI.timesUsed;
		Integer V = NumberV.timesUsed;
		Integer X = NumberX.timesUsed;
		Integer L = NumberL.timesUsed;
		Integer C = NumberC.timesUsed;
		Integer D = NumberD.timesUsed;
		Integer M = NumberM.timesUsed;
		
		int[] timesEachLetterUsed = {I, V, X, L, C, D, M};
		
		showInPrompt(timesEachLetterUsed);
	}
	
	private static void showInPrompt(int[] timesEachLetterUsed) {
		
		System.out.println("** - Times of each letter was used - **");
		System.out.println("I: " + timesEachLetterUsed[0]);
		System.out.println("V: " + timesEachLetterUsed[1]);
		System.out.println("X: " + timesEachLetterUsed[2]);
		System.out.println("L: " + timesEachLetterUsed[3]);
		System.out.println("C: " + timesEachLetterUsed[4]);
		System.out.println("D: " + timesEachLetterUsed[5]);
		System.out.println("M: " + timesEachLetterUsed[6]);
		System.out.println("***************************************");
	}
	
}
