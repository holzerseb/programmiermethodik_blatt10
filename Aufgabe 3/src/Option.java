public enum Option {

	STONE("SCISSORS", "LIZARD"), 
	SCISSORS("PAPER", "LIZARD"), 
	SPOCK("STONE", "SCISSORS"),
	LIZARD("PAPER", "SPOCK"),
	PAPER("STONE", "SPOCK");
	
	private String[] beatsOptions;
	
	Option(String ... beats){
		this.beatsOptions = beats;
	}
	
	public boolean beats(Option other){
		for (String b: beatsOptions){
			if (other.name().equals(b)){
				return true;
			}
		}
		return false;
	}
}
