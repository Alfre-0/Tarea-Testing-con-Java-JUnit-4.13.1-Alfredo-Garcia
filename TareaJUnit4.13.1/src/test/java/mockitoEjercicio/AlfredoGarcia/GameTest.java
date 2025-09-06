package mockitoEjercicio.AlfredoGarcia;
// TAREA DE JOSÉ ALFREDO GARCIA RODRÍGUEZ

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GameTest {

	private static final int OPTION_SCISSORS = 2;

	private static final int OPTION_PAPER = 1;

	private static final int OPTION_ROCK = 0;

	private ByteArrayOutputStream out;

	@Before
	public void setUp() {
		out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
	}

	@InjectMocks
	private Game game;

	@Mock
	Scanner scanner;

	@Mock
	Random random;

	@Test
	public void when_writeQuite_then_exitGame() {

		when(scanner.nextLine()).thenReturn("Quit");

		game.play();

		assertTrue(out.toString().contains("Let's play Rock"));

	}

	@Test
	public void when_ChooseRock_then_beatsScissors() {

		when(scanner.nextLine()).thenReturn("Rock").thenReturn("Quit");
		when(random.nextInt(3)).thenReturn(OPTION_SCISSORS);

		game.play();

		assertTrue(out.toString().contains("Computer chose scissors"));
		assertTrue(out.toString().contains("wins:1"));

	}

	@Test
	public void when_ChooseScissors_then_beatsPaper() {

		when(scanner.nextLine()).thenReturn("Scissors").thenReturn("Quit");
		when(random.nextInt(3)).thenReturn(OPTION_PAPER);

		game.play();

		assertTrue(out.toString().contains("Computer chose paper"));
		assertTrue(out.toString().contains("wins:1"));

	}

	@Test
	public void when_ChoosePaper_then_beatsRock() {

		when(scanner.nextLine()).thenReturn("Paper").thenReturn("Quit");
		when(random.nextInt(3)).thenReturn(OPTION_ROCK);

		game.play();

		assertTrue(out.toString().contains("Computer chose rock"));
		assertTrue(out.toString().contains("wins:1"));

	}

	@Test
	public void when_bothChooseRock_then_tie() {

		when(scanner.nextLine()).thenReturn("Rock").thenReturn("Quit");
		when(random.nextInt(3)).thenReturn(OPTION_ROCK);

		game.play();

		assertTrue(out.toString().contains("Computer chose rock"));
		assertTrue(out.toString().contains("ties:1"));
	}

	@Test
	public void when_chooseRockAndComputerChoosePaper_then_loose() {

		when(scanner.nextLine()).thenReturn("Rock").thenReturn("Quit");
		when(random.nextInt(3)).thenReturn(OPTION_PAPER);

		game.play();

		assertTrue(out.toString().contains("Computer chose paper"));
		assertTrue(out.toString().contains("loses:1"));
	}

}
