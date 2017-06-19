public abstract class Player {
	
	private int playerNumber;
	private int wins; // # of wins
	
	public Player(int playerNumber){
		this.playerNumber = playerNumber;
	}
	
	public int getPlayerNumber() {
		return playerNumber;
	}
	
	public abstract Option getChoice();
	
	public void addWin() {
		this.wins += 1;
	}

	public int getWins() {
		return (wins);
	}
}
