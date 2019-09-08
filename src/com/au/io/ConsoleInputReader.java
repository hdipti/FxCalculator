package com.au.io;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.au.conversion.ConversionLookup;

public class ConsoleInputReader {
	
	ConversionLookup lookup = new ConversionLookup();
	ConsoleOutputDisplay display = new ConsoleOutputDisplay();
	
	public void getInputfromConsoleAndConvertAmount() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("To exit the calculator, enter 'exit', else enter elements :  ");
		String input = "" ;
		do{
			input = scanner.nextLine();
			processInput(input);
		}while(!input.equalsIgnoreCase("exit"));
		
		System.out.println("Program over.");
		scanner.close();
	}

	private boolean processInput(String next) {
		
		if(next.length()== 1 && next.contains("=")) {
			lookup.saveToMap(next);
		} else {
			StringTokenizer tokenizer = new StringTokenizer(next);
			String base = tokenizer.nextToken();
			String value = tokenizer.nextToken();
			tokenizer.nextToken();
			String term = tokenizer.nextToken();
			BigDecimal result = lookup.lookupTable(base, term, value);
			display.displayResultToConsole(base, value, term, result);
		}
		
		return false;
	}
	
}
