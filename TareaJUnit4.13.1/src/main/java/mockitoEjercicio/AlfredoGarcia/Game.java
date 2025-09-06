package mockitoEjercicio.AlfredoGarcia;

// TAREA DE JOSÉ ALFREDO GARCIA RODRÍGUEZ 3490-24-13232

import java.util.Random;


import java.util.Scanner;

public class Game {

    private Scanner input = new Scanner(System.in);
    private Random random = new Random();

    public void play() {

        printGameRules();
        
        ScoreBoard scoreBoard = new ScoreBoard();
        String choice = input.nextLine().toUpperCase();
       
         

        while (!choice.equals("QUIT"))
        {
            GameOption choicenum = getChoiceNum(choice);
            
            
                while(choicenum == null)
                {
                    System.out.println("Sorry, it looks like you didn't enter a correct input. Try again.");
                    choice = input.nextLine().toUpperCase();
                      
                    choicenum = getChoiceNum(choice);
  
                }
            
            GameOption compnum = getChoiceComputer(); 

            chooseWinner(scoreBoard, choicenum, compnum);
            
            printResults(scoreBoard);
            
            choice = input.nextLine().toUpperCase();
        }
        
    }

	private void printResults(ScoreBoard scoreBoard) {
		System.out.println("wins:" + scoreBoard.getWins() + "\nloses:" + scoreBoard.getLoss() + "\nties:" + scoreBoard.getTies()); //print out number of wins, ties, and loses
		System.out.println("Let's play again! \n \n"); //start game again
		System.out.println("Say \"Rock\", \"Paper\", or \"Scissors\" to indicate your choice. Otherwise say \"Quit\" to quit.");
	}

	private void chooseWinner(ScoreBoard scoreBoard, GameOption choicenum, GameOption compnum) {
		if(choicenum == compnum) //tie cases
		{
		    ties(scoreBoard);
		}
		else if (choicenum == GameOption.ROCK && compnum == GameOption.SCISSORS 
				|| choicenum == GameOption.SCISSORS && compnum == GameOption.PAPER 
				|| choicenum == GameOption.PAPER && compnum == GameOption.ROCK )
		{
		    wins(scoreBoard);
		}
		
		    losses(scoreBoard);
	}

	private void losses(ScoreBoard scoreBoard) {
		System.out.println("you lose.");
		scoreBoard.incrementLoses();
	}

	private void ties(ScoreBoard scoreBoard) {
		System.out.println("It's a tie");
		scoreBoard.incrementTies();
	}

	private void wins(ScoreBoard scoreBoard) {
		System.out.println("you win!");
		scoreBoard.incrementWins();
	}

	private GameOption getChoiceNum(String choice) {
		
		GameOption selectedOption = null;
			
       if (choice.equals("QUIT"))
            System.exit(0); //quit program
		
       try {
           selectedOption = GameOption.valueOf(choice);

	} catch (Exception e) {
		return null;
	}   
       return selectedOption;
		
	}

	private GameOption getChoiceComputer() {
		
		GameOption option = GameOption.values()[random.nextInt(3)];
		
		System.out.println("Computer chose "+ option.toString().toLowerCase());
        
        return option;
        
	}

	private void printGameRules() {
		System.out.println("Let's play Rock, Paper, Scissors!");
        System.out.println("Say \"Rock\", \"Paper\", or \"Scissors\" to indicate your choice. Otherwise say \"Quit\" to quit.");
	}
}
