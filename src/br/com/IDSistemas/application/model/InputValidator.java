package br.com.IDSistemas.application.model;

import java.util.Scanner;

public class InputValidator {
	
	private Scanner input = new Scanner(System.in);
	
	public String[] isDecimalOrString() {
		
		firstBanner();
		
		String firstInput = input.nextLine().trim();
		
		String[] returningFirstInput = new String[2];
		
		if(firstInput.matches("^-?\\d+(\\.\\d+)?")) {
			returningFirstInput[0] = "decimal";
			returningFirstInput[1] = firstInput;
		} else {
			returningFirstInput[0] = "string"; 
			returningFirstInput[1] = firstInput.toUpperCase();
		}
		
		return returningFirstInput;
	}
	
	public void firstBanner() {
		System.out.println("\n**PROGRAM TO CONVERT INTEGER NUMBER TO ROMAN ALGARISM LETTER, AND VICE VERSA**" );
		System.out.print("\n\n\nEnter an input, can be a roman letter "
						 + "\nor decimal letter, the convertion is make automatically !"
						 + "\n\n->");
	}

}
