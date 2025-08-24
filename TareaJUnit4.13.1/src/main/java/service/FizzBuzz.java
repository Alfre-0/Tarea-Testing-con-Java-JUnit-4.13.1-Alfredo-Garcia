package service;

import java.util.ArrayList;
import java.util.List;

//TAREA DE JOSÉ ALFREDO GARCIA RODRÍGUEZ 3490-24-13232

public class FizzBuzz {

	private static final String BUZZ = "Buzz";
	private static final String FIZZ = "Fizz";
	private static final String FIZZ_BUZZ = "FizzBuzz";

	public List<String> getNumbers() {

		List<String> numbers = new ArrayList<String>();

		for (int i = 1; i <= 100; i++) {

			numbers.add(getNumber(i));

		}

		return numbers;
	}

	private String getNumber(int i) {
		if (isMultiple(i,3) & isMultiple(i,5)) {
			return FIZZ_BUZZ;
		} else if (isMultiple(i,3)) {
			return FIZZ;
		} else if (isMultiple(i,5)) {
			return BUZZ;
		}
		return "" + i;

	}

	private boolean isMultiple(int number, int multiple) {
		return number % multiple == 0;
	}

}
