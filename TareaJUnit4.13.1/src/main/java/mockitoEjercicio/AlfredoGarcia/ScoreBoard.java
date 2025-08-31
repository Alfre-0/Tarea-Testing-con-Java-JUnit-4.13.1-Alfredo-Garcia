package mockitoEjercicio.AlfredoGarcia;

public class ScoreBoard {
	
	//initialize variables
    private Integer ties;
    private Integer wins;
    private Integer losses;
    
    
	public ScoreBoard() {
		ties = 0;
		wins = 0;
		losses = 0;
	}

	public ScoreBoard(Integer ties, Integer wins, Integer losses) {
		super();
		this.ties = ties;
		this.wins = wins;
		this.losses = losses;
	}

	public Integer getTies() {
		return ties;
	}
	
	public void incrementTies() {
		ties++;
	}
	
	public Integer getWins() {
		return wins;
	}
	
	public void incrementWins() {
		wins++;
	}
	
	public Integer getLoss() {
		return losses;
	}
	
	public void incrementLoses() {
		losses++;
	}
    
    
    
    

}
