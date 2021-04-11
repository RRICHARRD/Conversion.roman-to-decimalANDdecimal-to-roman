package br.com.IDSistemas.application.model;

public final class ConversorDecimalToRoman {

	public String generateRomanNumber(int decimalNumber) {
		
		String M[] = { "", "M", "MM", "MMM" };
		String C[] = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
		String X[] = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
		String I[] = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };

		String thousands = M[decimalNumber / 1000];
		String hundereds = C[(decimalNumber % 1000) / 100];
		String tens = X[(decimalNumber % 100) / 10];
		String ones = I[decimalNumber % 10];

		String convertion = thousands + hundereds + tens + ones;

		return convertion;
	}
	
}
