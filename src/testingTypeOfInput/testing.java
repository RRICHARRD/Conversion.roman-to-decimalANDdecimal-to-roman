package testingTypeOfInput;

import java.util.Scanner;

public class testing {
	
	private static Scanner input = new Scanner(System.in);
	
	private static String[] knowsIfInputIsANumberOrString() {
		
		System.out.println("\n**PROGRAM TO CONVERT INTEGER NUMBER TO ROMAN ALGARISM LETTER, AND VICE VERSA**" );
		System.out.println("\n\n\nEnter an input, can be a roman letter or decimal letter,"
				         + "\n the convertion is make automatically");

		String firstInput = input.nextLine().trim();
		
		String[] returning = new String[2];
		
		if(firstInput.matches("^\\d+(\\.\\d+)?")) {
			returning[0] = "1";
			returning[1] = firstInput;
		} else {
			returning[0] = "2"; 
			returning[1] = firstInput;
		}
		
		return returning;
	}

	public static void main(String[] args) {
		
		String[] userInput = knowsIfInputIsANumberOrString();
		
		if(userInput[0].equals("1")) {
			//parte que gera o número romano a partir do número inteiro.
			System.err.println("GENERATING ROMAN NUMERAL...");
		} else {
			//partre que gera o número inteiro a partir do número romano.
			System.err.println("GENERATING ARABIC NUMBERAL...");
		}
	}

}
