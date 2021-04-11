package br.com.IDSistemas.application.model;

import java.util.regex.Pattern;

import br.com.IDSistemas.application.custonExceptions.EnormousDecimalException;
import br.com.IDSistemas.application.custonExceptions.IlegalRomanPatternException;
import br.com.IDSistemas.application.custonExceptions.TinyDecimalException;
import br.com.IDSistemas.application.custonExceptions.ZeroInputException;

public final class ValidatorRomanPattern {
	
	public static String inputValidRomanNumbers(String letters) {
				
		letters = letters.toUpperCase();
		
		try {
			verifyingIfRomanPatternIsValid(letters);
		} catch(final IlegalRomanPatternException exception) {
			System.err.println(exception.getMessage());
		}
		
		System.out.printf("\n%s is a valid roman pattern !", letters);

		return letters;
	}
	
	public static boolean verifyingIfRomanPatternIsValid(String letters) throws IlegalRomanPatternException {
		 
		boolean verification = Pattern.matches("^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$", letters);
		
		if(!verification == true) {
			throw new IlegalRomanPatternException("The Possibles roman numerical letters is I, V, X, C, L, D, M."
										  + "\nJust use valid junction of roman characters, the greater than is in the right and the less than is in the left."
										  + "\nThe greater possible roman numerical is MMMDCCCLXXXVIII, because letters M, C, X and I can be used 3 times, and"
										  + "\nD, L, V only 1 time"
										  + "\n\nExample: Use IV to represent the arabic numeral 4, not IIII");
		} else {
			return true;
		}
	}
	
	public void decimalLimit(int decimalNumber) throws TinyDecimalException, ZeroInputException, EnormousDecimalException {
		
		if (decimalNumber > 3888) {
			throw new EnormousDecimalException("Please, do not use numbers greater than 3888!");
		} else if (decimalNumber < 0) {
			throw new TinyDecimalException("Please, do not use numbers less than 0!");
		} else if(decimalNumber == 0) {
			throw new ZeroInputException("The number 0 is represented by \"0\", \"none\" or \"nulla\" in roman numerical system."
								  + "\nFor this program, 0 is not a valid input.");
		}
	}
}
