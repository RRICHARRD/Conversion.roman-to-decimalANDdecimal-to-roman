package br.com.IDSistemas.application.model;

public final class RomanLetterToHinduArabicNumeralSystem {

	private int valueOfLetterNumberCaracter(char romanCaracter) {
		
		switch(romanCaracter) {
		
			case 'I':
				return NumberI.getNumericalValueOfLetterI(); 
			case 'V':
				return NumberV.getNumericalValueOfLetterV();
			case 'X':
				return NumberX.getNumericalValueOfNumberX();
			case 'L':
				return NumberL.getNumericalValueOfLetterL();
			case 'C':
				return NumberC.getNumericalValueOfNumberC();
			case 'D':
				return NumberD.getNumericalValueOfLetterD();
			case 'M':
				return NumberM.getNumericalValueOfLetterM();
			default:
				return -1;
		}
	}		
		
	public int romanNumberToArabicNumber(String romanNumbers) {
		
		int finalResult = 0;

		for (int i = 0; i < romanNumbers.length(); i++) {
			
			int caracterOne = valueOfLetterNumberCaracter(romanNumbers.charAt(i));

			if (i + 1 < romanNumbers.length()) { 
				int caracterTwo = valueOfLetterNumberCaracter(romanNumbers.charAt(i + 1));

				if (caracterOne >= caracterTwo) {
					
					finalResult += + caracterOne;
				} else {
					
					finalResult += caracterTwo - caracterOne; 
					i++; 
				}
			} else {
				finalResult += caracterOne; 
			}
		}

		return finalResult;
	}

}
