import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Game implements ISubject
{
	private Player p1;
	private Player p2;
	private int winsRequired;
	public static Scanner scanner = new Scanner(System.in);
	private List<AbstractObserver> observers = new ArrayList<>();
	
	public Game(){
		this.p1 = getNewPlayer(1);
		this.p2 = getNewPlayer(2);
		this.winsRequired = 3;

		//If a statistics-Observer is created, it automatically registers itself
		//to the game it is created in.
		new StatisticObserver(this);
	}

	/* HERE IS MYYY COODEE  (also above) */
	private int draws = 0;

	@Override
	public void register(AbstractObserver observer)
	{
		if(!observers.contains(observer))
			observers.add(observer);
	}

	@Override
	public void unregister(AbstractObserver observer)
	{
		if(observers.contains(observer))
			observers.remove(observer);

		observer.remove();
	}

	@Override
	public void notifyObservers()
	{
		for(AbstractObserver observer : observers)
			observer.update();
	}

	public Player getPlayer(int playerNumber)
	{
		if(playerNumber == 1)
			return p1;
		else if (playerNumber == 2)
			return p2;
		else
			return null;
	}

	public int getDraws()
	{
		return draws;
	}

	/* HERE ENDS MYYY COODEE  (also above) */


	private int getPlayerType(int number){
		int choice = -1;
		while (choice < 1 || choice > 2) {
			try  {
				System.out.println("Enter Type for Player " + number+": ");
				System.out.println("\t1 - Human");
				System.out.println("\t2 - Computer");
				choice = scanner.nextInt();
			} catch (InputMismatchException | IllegalStateException e) {
				System.out.println("Please enter an integer");
			}
		}
		return choice;
	}
	
	public Player getNewPlayer(int number) {
		if (getPlayerType(number) == 1) {
			return new HumanPlayer(number);
		} else {
			return new ComputerPlayer(number);
		}
	}

	private boolean isGameFinished(){
		if (p1.getWins() == this.winsRequired){
			System.out.println("Player 1 wins the game!");
			return true;
		} else if (p2.getWins() == this.winsRequired){
			System.out.println("Player 2 wins the game!");
			return true;
		}
		return false;
	}
	
	public void run() {
		while(!isGameFinished()){
			Option o1 = p1.getChoice();
			Option o2 = p2.getChoice();
			System.out.println(o1.name() + " vs. " + o2.name());
			if (o1.beats(o2)){
				p1.addWin();
				System.out.println("Player 1 wins round!");
			} else if (o2.beats(o1)){
				p2.addWin();
				System.out.println("Player 2 wins round!");
			} else {
				draws++;
				System.out.println("Draw!");
			}
			System.out.println("-----");
			System.out.println();
			notifyObservers();
			System.out.println();
		}
	}

	public static void main(String args[]) {
		new Game().run();
	}
}
