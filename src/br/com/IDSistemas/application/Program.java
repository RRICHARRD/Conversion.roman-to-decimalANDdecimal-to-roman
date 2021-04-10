package br.com.IDSistemas.application;

import java.util.Scanner;

import br.com.IDSistemas.application.model.CouterOfTimesForEachNumberWasUsed;
import br.com.IDSistemas.application.model.RomanLetterToHinduArabicNumeralSystem;
import br.com.IDSistemas.application.model.RomanNumberValidPatterns;
import converingInduArabicToRomanLetters.ConvertingInduArabicToRomanLetters;

public final class Program {

	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String response;
		
		do {
			CouterOfTimesForEachNumberWasUsed romanNumbersStatisticsOfUse = new CouterOfTimesForEachNumberWasUsed();
			romanNumbersStatisticsOfUse.allTimesEachNumberWasUsed();
			
			
			String romanNumeral = RomanNumberValidPatterns.inputValidRomanNumbers();
			
			ConvertingInduArabicToRomanLetters generatorOfRomanNumberFromDecimal = new ConvertingInduArabicToRomanLetters();
			
			@SuppressWarnings("unused")
			String arabicNumeral = generatorOfRomanNumberFromDecimal.inputDecimalNumberAndConverToRomanLetter();
			
			
			romanNumbersStatisticsOfUse.HowManyTimesEachNumberWasUsed(romanNumeral);
		
			RomanLetterToHinduArabicNumeralSystem romanNumeralsConverter = new RomanLetterToHinduArabicNumeralSystem();
			int arabicNumber = romanNumeralsConverter.romanNumberToArabicNumber(romanNumeral);
			
			System.out.printf("\n\n%s is %d in the Hindu-Arabic numeral system\n", romanNumeral, arabicNumber);
			
			romanNumbersStatisticsOfUse.allTimesEachNumberWasUsed();
			
			System.out.println("\n\nPress enter key if you want to convert another time \nor type \"stop\" to stop the program");
			response = input.nextLine().trim();
		} while(!response.equalsIgnoreCase("stop"));
		
		input.close();
	}

}
