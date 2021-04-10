package br.com.IDSistemas.application.model;

import java.util.Scanner;
import java.util.regex.Pattern;

import br.com.IDSistemas.custonExceptions.LetterFormatException;

public final class RomanNumberValidPatterns {
	
	public static String inputValidRomanNumbers() {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		String letters = null;
		boolean loop = true;
		
		do {
			try {
				
				System.out.print("Enter with a valid roman number\n->");
				letters = input.nextLine().toUpperCase();
				
				verifyingIfRomanPatternIsValid(letters);
				break;
			} catch(final LetterFormatException exception) {
				System.err.println(exception.getMessage());
			}
		} while(loop == true);
		
		System.out.printf("\n%s is a valid roman pattern !", letters);

		return letters;
	}
	
	public static boolean verifyingIfRomanPatternIsValid(String letters) throws LetterFormatException {
		 
		boolean verification = Pattern.matches("^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$", letters);
		
		if(!verification == true) {
			throw new LetterFormatException("The Possibles roman numerical letters is I, V, X, C, L, D, M."
										  + "\nJust use valid junction of roman characters, the greater than is in the right and the less than is in the left."
										  + "\nThe greater possible roman numerical is MMMDCCCLXXXVIII, because letters M, C, X and I can be used 3 times, and"
										  + "\nD, L, V only 1 time"
										  + "\n\nExample: Use IV to represent the arabic numeral 4, not IIII");
		} else {
			return true;
		}
	}
	
}
