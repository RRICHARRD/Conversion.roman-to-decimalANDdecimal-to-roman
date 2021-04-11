package br.com.IDSistemas.application.model;

public final class StatisticsOfUse {

	public void show(String numericalRomanLetters) {
		
		makeStatistics(numericalRomanLetters);
		getTimesUsedOfAllNumbers(numericalRomanLetters);
	}
	
	public String changingDecimalToRomanIfNecessary(String decimalNumber) {
		
		if(decimalNumber.matches("^\\d+(\\.\\d+)?")) {
			
			ConversorDecimalToRoman generateRoman = new ConversorDecimalToRoman();
			String romanNumber = generateRoman.generateRomanNumber(Integer.parseInt(decimalNumber));
		
			return romanNumber;
		} else {
			
			return decimalNumber;
		}
		
	}
	
	public void makeStatistics(String numericalRomanLetters) {
		
		numericalRomanLetters = changingDecimalToRomanIfNecessary(numericalRomanLetters);
		
		String[] arrayOfNumericalRomanLetters = numericalRomanLetters.split("");
		
		for (int i = 0; i < arrayOfNumericalRomanLetters.length; i++) {
			
			switch (arrayOfNumericalRomanLetters[i]) {

				case "I": 
					new NumberI(); 
					break;
				case "V":
					new NumberV();
					break;
				case "X":
					new NumberX();
					break;
				case "L":
					new NumberL();
					break;
				case "C":
					new NumberC();
					break;
				case "D":
					new NumberD();
					break;
				case "M":
					new NumberM();
					break;
				default:
					break;
			}
		}

	}
	
	private void getTimesUsedOfAllNumbers(String userNumeralRoman) {
		
		Integer I = NumberI.getTimesUsed();
		Integer V = NumberV.getTimesUsed();
		Integer X = NumberX.getTimesUsed();
		Integer L = NumberL.getTimesUsed();
		Integer C = NumberC.getTimesUsed();
		Integer D = NumberD.getTimesUsed();
		Integer M = NumberM.getTimesUsed();
		
		int[] allRomanNumbers = { I, V, X, L, C, D, M };
		
		showStatisticsInPrompt(allRomanNumbers, userNumeralRoman);
		
	}
	
	private void showStatisticsInPrompt(int[] allRomanNumbers, String userNumeralRoman) {
		
		System.out.println("\n***************************************");
		System.out.println("   - Times that each letter of "+ userNumeralRoman +" was used -   ");
		System.out.println("I: " + allRomanNumbers[0]);
		System.out.println("V: " + allRomanNumbers[1]);
		System.out.println("X: " + allRomanNumbers[2]);
		System.out.println("L: " + allRomanNumbers[3]);
		System.out.println("C: " + allRomanNumbers[4]);
		System.out.println("D: " + allRomanNumbers[5]);
		System.out.println("M: " + allRomanNumbers[6]);
		System.out.println("***************************************");
		
		setStaticsOfAllLettersToZero();
	}
	
	private void setStaticsOfAllLettersToZero() {
		
		NumberI.setTimesUsedToZero();
		NumberV.setTimesUsedToZero();
		NumberX.setTimesUsedToZero();
		NumberL.setTimesUsedToZero();
		NumberC.setTimesUsedToZero();
		NumberD.setTimesUsedTozero();
		NumberM.setTimesUsedToZero();
	}
	
}
