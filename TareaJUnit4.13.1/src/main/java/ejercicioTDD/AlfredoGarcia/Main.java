package ejercicioTDD.AlfredoGarcia;

public class Main {

	// TAREA DE JOSÉ ALFREDO GARCIA RODRÍGUEZ 3490-24-13232
	
	public static void main(String[] args) {
		
		double salary = 1000;
		
		System.out.println(MoneyUtil.format(salary));
		
		FizzBuzz game = new FizzBuzz();
		
		System.out.println(game.getNumbers());

	}

}
