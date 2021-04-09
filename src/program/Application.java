package program;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

import custonException.LetterFormatException;

import model.CouterOfTimesForEachNumberUsed;
import model.NumberC;
import model.NumberD;
import model.NumberI;
import model.NumberL;
import model.NumberM;
import model.NumberV;
import model.NumberX;

public class Application {
///singnifica que é para continuar usando
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String response;
		
		do {
				
			System.err.println("Enter with three roman caracteres");
			
			/**
			 * Pega os três valores digitados pelo usuário,
			 * separa todas as letras e adiciona cada um em uma posição de um array.
			 * 
			 * Depois eu limito para três caracteres máximos de entrada na aplicação JavaFX.
			 * Além disso, adiciono a regra de não poder ter certos tipos de caracteres 
			 * em determinada posição, como LLL.
			 */
			
			String[] letters = input.nextLine().split(""); 
			System.out.println(Arrays.toString(letters)); //sai o array com as três letras

			Integer letterToOrdinaryNumber_one = 0;
			Integer letterToOrdinaryNumber_two = 0;
			Integer letterToOrdinaryNumber_three = 0;
			Integer letterToOrdinaryNumber_total = 0;

			for(int i = 0; i < letters.length; i++) {
				
				if(letters[i].equalsIgnoreCase("I")) {		
					letterToOrdinaryNumber_total += new NumberI().letterValue;
				}
				
				if(letters[i].equalsIgnoreCase("V")) {		
					letterToOrdinaryNumber_total += new NumberV().letterValue;
				}
				
				if(letters[i].equalsIgnoreCase("X")) {		
					letterToOrdinaryNumber_total += new NumberX().letterValue;
				}
				
				if(letters[i].equalsIgnoreCase("L")) {		
					letterToOrdinaryNumber_total += new NumberL().letterValue;
				}

				if(letters[i].equalsIgnoreCase("C")) {		
					letterToOrdinaryNumber_total += new NumberC().letterValue;
				}
				
				if(letters[i].equalsIgnoreCase("D")) {		
					letterToOrdinaryNumber_total += new NumberD().letterValue;
				}
				
				if(letters[i].equalsIgnoreCase("M")) {		
					letterToOrdinaryNumber_total += new NumberM().letterValue;
				}
			}
			
			System.out.printf("\nThe result is %d\n", letterToOrdinaryNumber_total);
			
			CouterOfTimesForEachNumberUsed.showAllTimesEachNumberWasUsed();
			
			System.out.println("Press any key letter if you want to try another time or \"stop\" case don't know");
			response = input.nextLine();
		} while(!response.equalsIgnoreCase("stop"));
		
		System.err.println("The application was terminated");

		input.close();
	}

}
