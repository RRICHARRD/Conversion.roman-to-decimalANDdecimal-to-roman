package converingInduArabicToRomanLetters;

import java.util.Scanner;

import br.com.IDSistemas.application.model.RomanNumberValidPatterns;
import br.com.IDSistemas.custonExceptions.EnormousArabicNumberException;
import br.com.IDSistemas.custonExceptions.TinyArabicNumberException;
import br.com.IDSistemas.custonExceptions.ZeroException;

public final class ConveringInduArabicToRomanLetters {

	public static String generateNumeralRomanFromHinduArabicNumeral(int num) {
		
		String M[] = { "", "M", "MM", "MMM" };
		String C[] = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
		String X[] = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
		String I[] = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };

		String thousands = M[num / 1000];
		String hundereds = C[(num % 1000) / 100];
		String tens = X[(num % 100) / 10];
		String ones = I[num % 10];

		String convertion = thousands + hundereds + tens + ones;

		return convertion;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int arabicNumeralNumbers = 0;
		boolean loop = true;
		String romanNumeral;
		boolean romanPattern = true;

		do {
			do {
				try {
					System.out.print("Enter with an integer number\n->");
					arabicNumeralNumbers = Integer.parseInt(input.nextLine());
					if (arabicNumeralNumbers > 3888) {
						throw new EnormousArabicNumberException("Please, do not use numbers greater than 3888!");
					} else if (arabicNumeralNumbers < 0) {
						throw new TinyArabicNumberException("Please, do not use numbers less than 0!");
					} else if(arabicNumeralNumbers == 0) {
						throw new ZeroException("The number 0 is represented by \"0\", \"none\" or \"nulla\" in roman numerical system."
											  + "\nFor this program, 0 is not a valid input.");
					}
					break;
				} catch (final NumberFormatException exception) {
					System.err.println("Please, utilize just an integer number.");
				} catch (final EnormousArabicNumberException | TinyArabicNumberException exception) {
					System.err.println(exception.getMessage());
				} catch (final ZeroException exception) {
					System.err.println(exception.getMessage());
				}

			} while (loop == true);

			romanNumeral = generateNumeralRomanFromHinduArabicNumeral(arabicNumeralNumbers);
			System.out.println(romanNumeral);

			
			try {
				romanPattern = RomanNumberValidPatterns.verifyingIfRomanPatternIsCorrect(romanNumeral);
				if(romanPattern == false) {
					throw new Exception("The roman pattern " + romanPattern +" generate is incorrect, there are logic problem\n with method generateNumeralRomanFromHinduArabicNumeral().");
				}
				break;
			} catch (final Exception exception) {
				System.err.println(exception.getMessage());
			}
		} while (loop == true);

		input.close();
	}
}
