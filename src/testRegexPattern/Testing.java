package testRegexPattern;

import java.util.Scanner;
import java.util.regex.Pattern;

import custonException.LetterFormatException;

public class Testing {
	
	public static boolean verifyingIfRomanPatterIsCorrect(Boolean romanPattern) throws LetterFormatException {
	
		if(romanPattern.equals(false)) {
			throw new LetterFormatException("Please, use only letters of this group -> I V X C L D M.");
		} else {
			return false;
		}
	}

	public static void main(String[] args) throws LetterFormatException {
		
		Scanner input = new Scanner(System.in);
		
		String letters = null;
		boolean switchLever = true;
		
		do {
			try {
				
				System.out.println("Enter with a valid roman number");
				letters = input.nextLine().toUpperCase();
				
				boolean romanPattern = Pattern.matches("^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$", letters);
				
				switchLever = verifyingIfRomanPatterIsCorrect(romanPattern);
				
			} catch(final LetterFormatException exception) {
				System.err.println(exception.getMessage());
			}
		} while(switchLever == true);
		
		System.err.printf("%s is valid roman number", letters);

		input.close();
	}

}
