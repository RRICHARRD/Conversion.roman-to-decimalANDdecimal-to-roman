package br.com.IDSistemas.application;

import java.util.Scanner;

import br.com.IDSistemas.application.custonExceptions.EmptyInputException;
import br.com.IDSistemas.application.custonExceptions.EnormousDecimalException;
import br.com.IDSistemas.application.custonExceptions.IlegalRomanPatternException;
import br.com.IDSistemas.application.custonExceptions.TinyDecimalException;
import br.com.IDSistemas.application.custonExceptions.ZeroInputException;
import br.com.IDSistemas.application.model.ConversorDecimalToRoman;
import br.com.IDSistemas.application.model.ConversorRomanToDecimal;
import br.com.IDSistemas.application.model.InputValidator;
import br.com.IDSistemas.application.model.StatisticsOfUse;
import br.com.IDSistemas.application.model.ValidatorRomanPattern;

public final class Program {
	
	public static void start() {
		
		Scanner input = new Scanner(System.in);
		InputValidator typeTester = new InputValidator();
		String response;
		
		do {
			
			try {
				String[] userInput = typeTester.isDecimalOrString();
				
				@SuppressWarnings("unused")
				Program conversorProgram = new Program(userInput);
			
			} catch (final NumberFormatException | TinyDecimalException exception) {
				System.err.println(exception.getMessage());
			} catch(final ZeroInputException | EnormousDecimalException exception) {
				System.err.println(exception.getMessage());
			} catch (final IlegalRomanPatternException exception) {
				System.err.println(exception.getMessage());
			} catch (final EmptyInputException exception) {
				System.err.println(exception.getMessage());
			}
		
			System.out.print("\n\nPress enter key if you want to convert another time \nor type \"stop\" to stop the program\n->");
			response = input.nextLine().trim();
		} while(!response.equalsIgnoreCase("stop"));
		
		input.close();
	}
	
	private Program(String[] userInput) throws IlegalRomanPatternException, NumberFormatException, TinyDecimalException, ZeroInputException, EnormousDecimalException {
		
		switch(userInput[0]) {
			case "string": programRomanToDecimal(userInput);
				break;
			case "decimal": programDecimalToRoman(userInput);
				break;
		}
	}
	
	private void programRomanToDecimal(String[] userInput) throws IlegalRomanPatternException {
			
			ValidatorRomanPattern validator = new ValidatorRomanPattern();
			validator.validNumeralRoman(userInput[1]);
			
			ConversorRomanToDecimal decimalGenerator = new ConversorRomanToDecimal();
			int decimalNumber = decimalGenerator.generateDecimal(userInput[1]);
			
			System.out.printf("\n%s is %d in hindu-arabic numeral system.", userInput[1], decimalNumber);
			
			StatisticsOfUse statistics = new StatisticsOfUse();
			statistics.show(Integer.toString(decimalNumber));	
	}
	
	private void programDecimalToRoman(String[] userInput) throws NumberFormatException, TinyDecimalException, ZeroInputException, EnormousDecimalException {
			
			ValidatorRomanPattern validator = new ValidatorRomanPattern();
			validator.decimalLimit(Integer.parseInt(userInput[1]));
			
			ConversorDecimalToRoman romanGenerator = new ConversorDecimalToRoman();
			String romanNumber = romanGenerator.generateRomanNumber(Integer.parseInt(userInput[1]));
			
			System.out.printf("\n%s is %s in roman numeral system.", userInput[1], romanNumber);
			
			StatisticsOfUse statistics = new StatisticsOfUse();
			statistics.show(romanNumber);
	}
}
