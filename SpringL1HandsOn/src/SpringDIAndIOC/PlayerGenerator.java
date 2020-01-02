package SpringDIAndIOC;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;

public class PlayerGenerator {
	@Bean(name = "india")
	public Country getIndia() {
		Country country = new Country();
		country.setCountryId("C001");
		country.setCountryName("India");
		/*
		 * ArrayList<Player> players = new ArrayList<Player>();
		 * players.add(getPlayer1()); players.add(getPlayer4());
		 * players.add(getPlayer5()); country.setPlayers(players);
		 */
		return country;
	}

	@Bean(name = "russia")
	public Country getRussia() {
		Country country = new Country();
		country.setCountryId("C002");
		country.setCountryName("Russia");
		return country;
	}

	@Bean(name = "player1")
	public Player getPlayer1() {
		Player player = new Player("P001", "Ronaldo", getIndia());
		return player;
	}

	@Bean(name = "player2")
	public Player getPlayer2() {
		Player player = new Player("P002", "Messi", getRussia());
		return player;
	}

	@Bean(name = "player3")
	public Player getPlayer3() {
		Player player = new Player("P003", "Suarez", getRussia());
		return player;
	}

	@Bean(name = "player4")
	public Player getPlayer4() {
		Player player = new Player("P004", "Neymar", getIndia());
		return player;
	}

	@Bean(name = "player5")
	public Player getPlayer5() {
		Player player = new Player("P005", "Beckham", getIndia());
		return player;
	}
}
