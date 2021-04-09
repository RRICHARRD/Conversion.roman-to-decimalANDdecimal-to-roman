package model;

public final class CouterOfTimesForEachNumberWasUsed {

	public static void showAllTimesEachNumberWasUsed() {
		
		Integer I = NumberI.getTimesUsed();
		Integer V = NumberV.getTimesUsed();
		Integer X = NumberX.getTimesUsed();
		Integer L = NumberL.getTimesUsed();
		Integer C = NumberC.getTimesUsed();
		Integer D = NumberD.getTimesUsed();
		Integer M = NumberM.getTimesUsed();
		
		int[] timesEachLetterWasUsed = {I, V, X, L, C, D, M};
		
		showInPrompt(timesEachLetterWasUsed);
	}
	
	private static void showInPrompt(int[] timesEachLetterWasUsed) {
		
		System.out.println("***************************************");
		System.out.println("   - Times of each letter was used -   ");
		System.out.println("I: " + timesEachLetterWasUsed[0]);
		System.out.println("V: " + timesEachLetterWasUsed[1]);
		System.out.println("X: " + timesEachLetterWasUsed[2]);
		System.out.println("L: " + timesEachLetterWasUsed[3]);
		System.out.println("C: " + timesEachLetterWasUsed[4]);
		System.out.println("D: " + timesEachLetterWasUsed[5]);
		System.out.println("M: " + timesEachLetterWasUsed[6]);
		System.out.println("***************************************");
	}
	
}
