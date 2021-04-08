package program;

import java.util.Arrays;
import java.util.Scanner;

import model.NumberV;

public class Application {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
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

		Integer LetterToOrdinaryNumber_one = 0;
		Integer LetterToOrdinaryNumber_two = 0;
		Integer LetterToOrdinaryNumber_three = 0;
		Integer LetterToOrdinaryNumber_total = 0;

		for(int i = 0; i < letters.length; i++) {
			
			if(letters[i].equalsIgnoreCase("I")) {		
				LetterToOrdinaryNumber_total += 1;
			}
			
			if(letters[i].equalsIgnoreCase("V")) {		
				LetterToOrdinaryNumber_total += new NumberV().letterValue;
			}
			
			if(letters[i].equalsIgnoreCase("X")) {		
				LetterToOrdinaryNumber_total += 10;
			}
			
			if(letters[i].equalsIgnoreCase("L")) {		
				LetterToOrdinaryNumber_total += 50;
			}
			
			if(letters[i].equalsIgnoreCase("D")) {		
				LetterToOrdinaryNumber_total += 500;
			}
			
			if(letters[i].equalsIgnoreCase("M")) {		
				LetterToOrdinaryNumber_total += 1000;
			}
		}
		
		
		
		//System.out.print("Value is " + NumberV.numberValueOfV()); // mostrar o valor da letra números
		System.out.printf("Times used V -> %d", NumberV.timesUsed);
		System.out.printf("\nThe result is %d", LetterToOrdinaryNumber_total);
		
		/*
			I = 1
			V = 5
			X = 10
			L = 50
			C = 100
			D = 500
			M = 1000
		*/
		
		input.close();
	}

}
