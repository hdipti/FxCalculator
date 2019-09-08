package com.au.conversion;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum CrossVia {
    D("D"),
    INV("INV"),
    UNITY("UNITY"),
    USD("USD"),
    EUR("EUR");
	
	private static final Map<String, CrossVia> crossVia = new HashMap<String, CrossVia>();

	private final String crossValue;
	
	static {
		for(CrossVia enumMember : EnumSet.allOf(CrossVia.class)){
			crossVia.put(enumMember.getCrossVia(), enumMember);
		}
	}
	
	CrossVia(String word) {
		this.crossValue = word;
	}

	public String getCrossVia(){
		return this.crossValue;
	}
	
	public static CrossVia getMappingValue(String text) {
		return crossVia.get(text);
	}
	
	public static boolean isCurrency(String currency){
		return crossVia.containsKey(currency) && 
				(CrossVia.EUR.crossValue.equalsIgnoreCase(currency) 
				|| CrossVia.USD.crossValue.equalsIgnoreCase(currency));
	}
	
}
