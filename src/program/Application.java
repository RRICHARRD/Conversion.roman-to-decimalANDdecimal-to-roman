package program;

import java.util.Scanner;

import model.CouterOfTimesForEachNumberWasUsed;
import model.NumberC;
import model.NumberD;
import model.NumberI;
import model.NumberL;
import model.NumberM;
import model.NumberV;
import model.NumberX;
import model.RomanNumberValidPatterns;

public final class Application {

	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String response;
		
		do {
			CouterOfTimesForEachNumberWasUsed.showAllTimesEachNumberWasUsed();
			
			String romanNumbers = RomanNumberValidPatterns.inputValidRomanNumbers();
			
			String[] letters = romanNumbers.split(""); 
			//System.out.println(Arrays.toString(letters));

			@SuppressWarnings("unused")
			Integer letterToOrdinaryNumber_one = 0;
			
			@SuppressWarnings("unused")
			Integer letterToOrdinaryNumber_two = 0;
			
			@SuppressWarnings("unused")
			Integer letterToOrdinaryNumber_three = 0;
			
			Integer letterToOrdinaryNumber_total = 0;

			for(int i = 0; i < letters.length; i++) {
				
				if(letters[i].equalsIgnoreCase("I")) {		
					new NumberI();
				} 
				
				if(letters[i].equalsIgnoreCase("V")) {		
					letterToOrdinaryNumber_total += new NumberV().letterNumberValue;
				}
				
				if(letters[i].equalsIgnoreCase("X")) {		
					letterToOrdinaryNumber_total += new NumberX().letterNumberValue;
				}
				
				if(letters[i].equalsIgnoreCase("L")) {		
					letterToOrdinaryNumber_total += new NumberL().letterNumberValue;
				}

				if(letters[i].equalsIgnoreCase("C")) {		
					letterToOrdinaryNumber_total += new NumberC().letterNumberValue;
				}
				
				if(letters[i].equalsIgnoreCase("D")) {		
					letterToOrdinaryNumber_total += new NumberD().letterNumberValue;
				}
				
				if(letters[i].equalsIgnoreCase("M")) {		
					letterToOrdinaryNumber_total += new NumberM().letterNumberValue;
				}
			}
			
			System.out.printf("\n\n%s roman numeral is %d in the Hindu-Arabic numeral system\n", romanNumbers, letterToOrdinaryNumber_total);
			
			CouterOfTimesForEachNumberWasUsed.showAllTimesEachNumberWasUsed();
			
			System.out.println("\nPress enter key if you want to convert another time or type \"stop\" to stop the program");
			response = input.nextLine().trim();
		} while(!response.equalsIgnoreCase("stop"));
		
		input.close();
	}

}
