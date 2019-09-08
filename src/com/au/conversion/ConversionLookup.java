package com.au.conversion;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;

public class ConversionLookup {
	
	private static HashMap<String, String> CONVERSION_MAP = new HashMap<String, String>();
	private static HashMap<String, BigDecimal> CURRENCY_RATES = new HashMap<String, BigDecimal>();
	
	static {
		
		CONVERSION_MAP.put("AUDAUD", "UNITY");
		CONVERSION_MAP.put("AUDCAD", "USD");
		CONVERSION_MAP.put("AUDCNY", "USD");
		CONVERSION_MAP.put("AUDCZK", "USD");
		CONVERSION_MAP.put("AUDDKK", "USD");
		CONVERSION_MAP.put("AUDEUR", "USD");
		CONVERSION_MAP.put("AUDGBP", "USD");
		CONVERSION_MAP.put("AUDJPY", "USD");
		CONVERSION_MAP.put("AUDNOK", "USD");
		CONVERSION_MAP.put("AUDNZD", "USD");
		CONVERSION_MAP.put("AUDUSD", "D");
		
		CONVERSION_MAP.put("CADAUD", "USD");
		CONVERSION_MAP.put("CADCAD", "UNITY");
		CONVERSION_MAP.put("CADCNY", "USD");
		CONVERSION_MAP.put("CADCZK", "USD");
		CONVERSION_MAP.put("CADDKK", "USD");
		CONVERSION_MAP.put("CADEUR", "USD");
		CONVERSION_MAP.put("CADGBP", "USD");
		CONVERSION_MAP.put("CADJPY", "USD");
		CONVERSION_MAP.put("CADNOK", "USD");
		CONVERSION_MAP.put("CADNZD", "USD");
		CONVERSION_MAP.put("CADUSD", "D");
		
		CONVERSION_MAP.put("CNYAUD", "USD");
		CONVERSION_MAP.put("CNYCAD", "USD");
		CONVERSION_MAP.put("CNYCNY", "UNITY");
		CONVERSION_MAP.put("CNYCZK", "USD");
		CONVERSION_MAP.put("CNYDKK", "USD");
		CONVERSION_MAP.put("CNYEUR", "USD");
		CONVERSION_MAP.put("CNYGBP", "USD");
		CONVERSION_MAP.put("CNYJPY", "USD");
		CONVERSION_MAP.put("CNYNOK", "USD");
		CONVERSION_MAP.put("CNYNZD", "USD");
		CONVERSION_MAP.put("CNYUSD", "D");
		
		CONVERSION_MAP.put("CZYAUD", "USD");
		CONVERSION_MAP.put("CZYCAD", "USD");
		CONVERSION_MAP.put("CZYCNY", "USD");
		CONVERSION_MAP.put("CZYCZK", "UNITY");
		CONVERSION_MAP.put("CZYDKK", "EUR");
		CONVERSION_MAP.put("CZYEUR", "INV");
		CONVERSION_MAP.put("CZYGBP", "USD");
		CONVERSION_MAP.put("CZYJPY", "USD");
		CONVERSION_MAP.put("CZYNOK", "EUR");
		CONVERSION_MAP.put("CZYNZD", "USD");
		CONVERSION_MAP.put("CZYUSD", "EUR");
		
		
		CONVERSION_MAP.put("DKKAUD", "USD");
		CONVERSION_MAP.put("DKKCAD", "USD");
		CONVERSION_MAP.put("DKKCNY", "USD");
		CONVERSION_MAP.put("DKKCZK", "EUR");
		CONVERSION_MAP.put("DKKDKK", "UNITY");
		CONVERSION_MAP.put("DKKEUR", "INV");
		CONVERSION_MAP.put("DKKGBP", "USD");
		CONVERSION_MAP.put("DKKJPY", "USD");
		CONVERSION_MAP.put("DKKNOK", "EUR");
		CONVERSION_MAP.put("DKKNZD", "USD");
		CONVERSION_MAP.put("DKKUSD", "EUR");
		
		CONVERSION_MAP.put("EURAUD", "USD");
		CONVERSION_MAP.put("EURCAD", "USD");
		CONVERSION_MAP.put("EURCNY", "USD");
		CONVERSION_MAP.put("EURCZK", "D");
		CONVERSION_MAP.put("EURDKK", "D");
		CONVERSION_MAP.put("EUREUR", "UNITY");
		CONVERSION_MAP.put("EURGBP", "USD");
		CONVERSION_MAP.put("EURJPY", "USD");
		CONVERSION_MAP.put("EURNOK", "D");
		CONVERSION_MAP.put("EURNZD", "USD");
		CONVERSION_MAP.put("EURUSD", "D");
		
		CONVERSION_MAP.put("GBPAUD", "USD");
		CONVERSION_MAP.put("GBPCAD", "USD");
		CONVERSION_MAP.put("GBPCNY", "USD");
		CONVERSION_MAP.put("GBPCZK", "USD");
		CONVERSION_MAP.put("GBPDKK", "USD");
		CONVERSION_MAP.put("GBPEUR", "USD");
		CONVERSION_MAP.put("GBPGBP", "UNITY");
		CONVERSION_MAP.put("GBPJPY", "USD");
		CONVERSION_MAP.put("GBPNOK", "USD");
		CONVERSION_MAP.put("GBPNZD", "USD");
		CONVERSION_MAP.put("GBPUSD", "D");
		
		CONVERSION_MAP.put("JPYAUD", "USD");
		CONVERSION_MAP.put("JPYCAD", "USD");
		CONVERSION_MAP.put("JPYCNY", "USD");
		CONVERSION_MAP.put("JPYCZK", "USD");
		CONVERSION_MAP.put("JPYDKK", "USD");
		CONVERSION_MAP.put("JPYEUR", "USD");
		CONVERSION_MAP.put("JPYGBP", "USD");
		CONVERSION_MAP.put("JPYJPY", "UNITY");
		CONVERSION_MAP.put("JPYNOK", "USD");
		CONVERSION_MAP.put("JPYNZD", "USD");
		CONVERSION_MAP.put("JPYUSD", "INV");
		
		CONVERSION_MAP.put("NOKAUD", "USD");
		CONVERSION_MAP.put("NOKCAD", "USD");
		CONVERSION_MAP.put("NOKCNY", "USD");
		CONVERSION_MAP.put("NOKCZK", "USD");
		CONVERSION_MAP.put("NOKDKK", "USD");
		CONVERSION_MAP.put("NOKEUR", "USD");
		CONVERSION_MAP.put("NOKGBP", "USD");
		CONVERSION_MAP.put("NOKJPY", "USD");
		CONVERSION_MAP.put("NOKNOK", "UNITY");
		CONVERSION_MAP.put("NOKNZD", "USD");
		CONVERSION_MAP.put("NOKUSD", "EUR");
		
		CONVERSION_MAP.put("NZDAUD", "USD");
		CONVERSION_MAP.put("NZDCAD", "USD");
		CONVERSION_MAP.put("NZDCNY", "USD");
		CONVERSION_MAP.put("NZDCZK", "USD");
		CONVERSION_MAP.put("NZDDKK", "USD");
		CONVERSION_MAP.put("NZDEUR", "USD");
		CONVERSION_MAP.put("NZDGBP", "USD");
		CONVERSION_MAP.put("NZDJPY", "USD");
		CONVERSION_MAP.put("NZDNOK", "USD");
		CONVERSION_MAP.put("NZDNZD", "UNITY");
		CONVERSION_MAP.put("NZDUSD", "D");
		
		CONVERSION_MAP.put("USDAUD", "INV");
		CONVERSION_MAP.put("USDCAD", "INV");
		CONVERSION_MAP.put("USDCNY", "INV");
		CONVERSION_MAP.put("USDCZK", "EUR");
		CONVERSION_MAP.put("USDDKK", "EUR");
		CONVERSION_MAP.put("USDEUR", "INV");
		CONVERSION_MAP.put("USDGBP", "INV");
		CONVERSION_MAP.put("USDJPY", "D");
		CONVERSION_MAP.put("USDNOK", "EUR");
		CONVERSION_MAP.put("USDUSD", "INV");
		CONVERSION_MAP.put("USDUSD", "UNITY");
		
		CURRENCY_RATES.put("AUDUSD", new BigDecimal(0.8371));
		CURRENCY_RATES.put("CADUSD", new BigDecimal(0.8711));
		CURRENCY_RATES.put("EURUSD", new BigDecimal(1.2315));
		CURRENCY_RATES.put("GBPUSD", new BigDecimal(1.5683));
		CURRENCY_RATES.put("NZDUSD", new BigDecimal(0.7750));
		CURRENCY_RATES.put("USDJPY", new BigDecimal(119.95));
		CURRENCY_RATES.put("EURCZK", new BigDecimal(27.6028));
		CURRENCY_RATES.put("EURDKK", new BigDecimal(7.4405));
		CURRENCY_RATES.put("EURNOK", new BigDecimal(8.6651));
		
	}
	
	public String getConversion(String text) {
		return CONVERSION_MAP.get(text);
	}
	
	public void saveToMap(String text){
		String[] values = text.split("=");
		CURRENCY_RATES.put(values[0], new BigDecimal(values[1]));
	}
	
	public BigDecimal lookupTable(String base, String term, String amountToBeConverted) {
		return (CONVERSION_MAP.containsKey(base+term)) ? getConversion(base, term, amountToBeConverted):null;
	}
	
	private BigDecimal getConversion(String base, String term, String amountToBeConverted){
		
		String key = base+term;
		BigDecimal result = BigDecimal.ZERO;
		
		switch(CrossVia.getMappingValue(getConversion(key))) {
		case D:
			result = CURRENCY_RATES.get(key).multiply(new BigDecimal(amountToBeConverted));
			break;
			
		case EUR:
			result = getCurrency(base, term, CrossVia.EUR.getCrossVia(), amountToBeConverted);
			break;
			
		case INV:
			BigDecimal invertedRate = BigDecimal.ONE.divide(CURRENCY_RATES.get(term+base), 5, RoundingMode.HALF_UP);
					result = invertedRate.multiply(new BigDecimal(amountToBeConverted));
			break;
			
		case UNITY:
			result = new BigDecimal(amountToBeConverted);
			break;
			
		case USD:
			result = getCurrency(base, term, CrossVia.USD.getCrossVia(), amountToBeConverted);
			break;
		}
		
		return result;
	}
	
	
	private BigDecimal getCurrency(String base, String term, String crossCurrency, String amountToBeConverted) {
		
		BigDecimal firstConversion = CURRENCY_RATES.get(base+crossCurrency).multiply(new BigDecimal(amountToBeConverted)).setScale(5, BigDecimal.ROUND_HALF_UP);
		BigDecimal result = BigDecimal.ZERO;
		if(CURRENCY_RATES.containsKey(term+crossCurrency)){
			result = CURRENCY_RATES.get(term+crossCurrency).multiply(firstConversion).setScale(5, BigDecimal.ROUND_HALF_UP);
		} else {
			String conversion = CONVERSION_MAP.get(term+crossCurrency);
			result = CURRENCY_RATES.get(conversion+term).multiply(firstConversion).setScale(5, BigDecimal.ROUND_HALF_UP);
		}
		return result;
		
	}

}
