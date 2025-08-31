package ejercicioTDD.AlfredoGarcia;

import java.math.BigDecimal;
import java.math.RoundingMode;

//TAREA DE JOSÉ ALFREDO GARCIA RODRÍGUEZ 3490-24-13232

public class MoneyUtil {

	public static String format(Double money) {
		return format(money, "$");

	}

	public static String format(Double money, String symbol) {

		if (symbol == null) {
			throw new IllegalArgumentException();
		}
		
		if (money < 0) {
			symbol = "-" + symbol;
			money = money * (-1);
		}

		BigDecimal redondeado = BigDecimal.valueOf(money).setScale(2, BigDecimal.ROUND_HALF_UP);

		return symbol + redondeado;

	}

}
