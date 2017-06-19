import java.util.NoSuchElementException;

public class HumanPlayer extends Player {

	public HumanPlayer(int playerNumber) {
		super(playerNumber);
	}

	@Override
	public Option getChoice() {
		Option[] values = Option.values();
		printOptions(values);
		int choice = getChoiceFromInput(values);
		return values[choice];
	}

	private void printOptions(Option[] values){
		System.out.println("Player " + this.getPlayerNumber() + ": please choose your option");
		for (int i = 0; i < values.length; i++) {
			System.out.println((i + 1) + ": " + values[i].name());
		}
	}
	
	private int getChoiceFromInput(Option[] values) {
		int choice = -1;
		do {
			try {
				choice = Game.scanner.nextInt();
			} catch (NoSuchElementException | IllegalStateException ex) {
				System.out.println("Illegal Input");
			}

		} while (choice < 0 || choice >= values.length);
		return choice;
	}

}
