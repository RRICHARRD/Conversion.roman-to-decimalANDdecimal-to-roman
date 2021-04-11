package br.com.IDSistemas.application;

import java.util.Scanner;

import br.com.IDSistemas.application.custonExceptions.EnormousDecimalException;
import br.com.IDSistemas.application.custonExceptions.IlegalRomanPatternException;
import br.com.IDSistemas.application.custonExceptions.TinyDecimalException;
import br.com.IDSistemas.application.custonExceptions.ZeroInputException;
import br.com.IDSistemas.application.model.ConversorDecimalToRoman;
import br.com.IDSistemas.application.model.StatisticsOfUse;
import br.com.IDSistemas.application.model.InputTester;
import br.com.IDSistemas.application.model.ValidatorRomanPattern;

public final class Program {

	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) throws IlegalRomanPatternException, NumberFormatException, TinyDecimalException, ZeroInputException, EnormousDecimalException {
		
		String response;
		
		do {
			
			InputTester typeTester = new InputTester();
			String[] userInput = typeTester.isDecimalOrString();
			
			if(userInput[0].equals("decimal")) {
				
				ValidatorRomanPattern validator = new ValidatorRomanPattern();
				validator.decimalLimit(Integer.parseInt(userInput[1]));
				
				ConversorDecimalToRoman romanGenerator = new ConversorDecimalToRoman();
				String romanNumber = romanGenerator.generateRomanNumber(Integer.parseInt(userInput[1]));
				
				System.out.printf("\n%s is %s in roman numeral system.", userInput[1], romanNumber);
				
				StatisticsOfUse statistics = new StatisticsOfUse();
				statistics.xxx(romanNumber);
			} 
			
			
			if(userInput[0].equals("string")) {
				
			}
					
		
			System.out.print("\n\nPress enter key if you want to convert another time \nor type \"stop\" to stop the program\n->");
			response = input.nextLine().trim();
		} while(!response.equalsIgnoreCase("stop"));
		
		input.close();
	}

}
