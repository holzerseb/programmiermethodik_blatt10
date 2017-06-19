import java.util.Random;

public class ComputerPlayer extends Player {

	public ComputerPlayer(int playerNumber) {
		super(playerNumber);
	}

	@Override
	public Option getChoice() {
		Option[] values = Option.values();
		Random random = new Random();
		int index = random.nextInt(values.length);
		return values[index];
	}
}
