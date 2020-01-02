package SpringDIAndIOC;

public class Player {
	private String playerId;
	private String playerName;
	private Country country;

	public Player(String playerId, String playerName, Country country) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.country = country;
	}

	public String getPlayerId() {
		return playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public Country getCountry() {
		return country;
	}
}
