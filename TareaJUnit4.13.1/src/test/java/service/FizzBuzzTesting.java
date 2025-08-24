package service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

//TAREA DE JOSÉ ALFREDO GARCIA RODRÍGUEZ 3490-24-13232

public class FizzBuzzTesting {
	
	private static final String FIZZ_BUZZ = "FizzBuzz";
	private static final String BUZZ = "Buzz";
	private static final String FIZZ = "Fizz";
	private FizzBuzz game;
	
	@Before
	public void before() {
		game = new FizzBuzz();
	}
	
	@Test
	public void should_returnNumbers_whenNotMultipleOf30or5() {
		
		
		
		List<String> numbersList = game.getNumbers();
		assertEquals("1", numbersList.get(0));
		assertEquals("2", numbersList.get(1));
		assertEquals("8", numbersList.get(7));
		assertEquals("16", numbersList.get(15));
	}
	
	@Test
	public void should_returnFizz_whenAMultipleOf3() {
		
		
		List<String> numbersList = game.getNumbers();
		
		assertEquals(FIZZ, numbersList.get(2));
		assertEquals(FIZZ, numbersList.get(5));
		assertEquals(FIZZ, numbersList.get(8));
		assertEquals(FIZZ, numbersList.get(11));
	}
	
	@Test
	public void should_returnBuzz_whenAMultipleOf5() {
		
		
		List<String> numbersList = game.getNumbers();
		
		assertEquals(BUZZ, numbersList.get(4));
		assertEquals(BUZZ, numbersList.get(9));
		assertEquals(BUZZ, numbersList.get(19));
		assertEquals(BUZZ, numbersList.get(24));
	}
	
	@Test
	public void should_returnFizzBuzz_whenAMultipleOf3And5() {
		
		
		List<String> numbersList = game.getNumbers();
		
		assertEquals(FIZZ_BUZZ, numbersList.get(14));
		assertEquals(FIZZ_BUZZ, numbersList.get(29));
		assertEquals(FIZZ_BUZZ, numbersList.get(59));
		assertEquals(FIZZ_BUZZ, numbersList.get(89));
	}

}
