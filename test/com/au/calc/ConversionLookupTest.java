package com.au.calc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.math.BigDecimal;

import org.junit.Test;

import com.au.conversion.ConversionLookup;

public class ConversionLookupTest {
	
	ConversionLookup lookup = new ConversionLookup();
	
	@Test
	public void testAUDtoUSD() {
		assertEquals(new BigDecimal(83.71).setScale(2, BigDecimal.ROUND_HALF_UP), lookup.lookupTable("AUD", "USD", "100.00").setScale(2, BigDecimal.ROUND_HALF_UP));
	}
	
	@Test
	public void testAUDtoAUD() {
		assertEquals(new BigDecimal(100.00).setScale(2, BigDecimal.ROUND_HALF_UP), lookup.lookupTable("AUD", "AUD", "100.00").setScale(2, BigDecimal.ROUND_HALF_UP));
	}
	
	@Test
	public void testAUDtoDKK() {
		assertEquals(new BigDecimal(622.84).setScale(2, BigDecimal.ROUND_HALF_UP), lookup.lookupTable("AUD", "DKK", "100.00").setScale(2, BigDecimal.ROUND_HALF_UP));
	}

	@Test
	public void testJYPtoUSD() {
		assertEquals(new BigDecimal(0.83).setScale(2, BigDecimal.ROUND_HALF_UP), lookup.lookupTable("JPY", "USD", "100.00").setScale(2, BigDecimal.ROUND_HALF_UP));
	}
	
	@Test
	public void testCannotConvert() {
		assertNull(lookup.lookupTable("KWR", "FJD", "1000.00"));
	}

}
