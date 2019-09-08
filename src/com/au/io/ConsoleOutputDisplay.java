package com.au.io;

import java.math.BigDecimal;

public class ConsoleOutputDisplay {
	
	private String JPY_CURRENCY = "JPY";
	
	public void displayResultToConsole(String base, String value, String term, BigDecimal result) {
		String display = "";
		if(null == result){
			 display = "Unable to find rate for " +  base + "/" + term;
		} else if(term.equalsIgnoreCase(JPY_CURRENCY)){
			display = base + " " + value + " = " + term + " " + result.intValue(); 
		} else {
			BigDecimal dsplayResult = result.setScale(2, BigDecimal.ROUND_HALF_UP);
			display = base + " " + value + " = " + term + " " + dsplayResult; 
		}
		System.out.println(display);
	}

}
