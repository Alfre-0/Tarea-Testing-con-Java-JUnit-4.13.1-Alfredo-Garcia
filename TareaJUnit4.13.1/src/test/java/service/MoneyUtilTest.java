package service;

import static org.junit.Assert.*;

import org.junit.Test;

//TAREA DE JOSÉ ALFREDO GARCIA RODRÍGUEZ 3490-24-13232

public class MoneyUtilTest {

	@Test
	public void moneyTest() {
		String money = MoneyUtil.format(1000.00);
		assertEquals("$1000.00", money);
	}
	
	@Test
	public void negativeMoneyTest() {
		String money = MoneyUtil.format(-1000.00);
		assertEquals("-$1000.00", money);
	}
	
	@Test
	public void euroMoneyTest() {
		
		String money = MoneyUtil.format(-1000.00, "€");
		assertEquals("-€1000.00", money);
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void notNullExceptionMoneyTest() {
		
		MoneyUtil.format(-1000.00, null);
		
		
	}
	
	

}
