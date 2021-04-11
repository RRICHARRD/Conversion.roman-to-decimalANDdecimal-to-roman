package br.com.IDSistemas.application.model;

public final class ConversorRomanToDecimal {

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
		
	public int generateDecimal(String romanNumeral) {
		
		int finalResult = 0;

		for (int i = 0; i < romanNumeral.length(); i++) {
			
			int caracterOne = valueOfLetterNumberCaracter(romanNumeral.charAt(i));

			if (i + 1 < romanNumeral.length()) { 
				int caracterTwo = valueOfLetterNumberCaracter(romanNumeral.charAt(i + 1));

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
