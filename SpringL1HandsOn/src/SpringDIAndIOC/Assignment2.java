package SpringDIAndIOC;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Assignment2 {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(PlayerGenerator.class);
		for (int i = 1; i <= 5; i++) {
			Player player = (Player) context.getBean("player" + i);
			System.out.println("Details of the player\t: ");
			System.out.println("Player Id\t: " + player.getPlayerId());
			System.out.println("Player Name\t: " + player.getPlayerName());
			System.out.println("Player Name\t: " + player.getCountry());
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the country name:");
		String country = sc.nextLine();
		int flag = 0;
		for (int i = 1; i <= 5; i++) {
			Player player = (Player) context.getBean("player" + i);
			if (player.getCountry().getCountryName().equalsIgnoreCase(country)) {
				System.out.println("Details of the player\t: ");
				System.out.println("Player Id\t: " + player.getPlayerId());
				System.out.println("Player Name\t: " + player.getPlayerName());
				System.out.println("Player Name\t: " + player.getCountry());
				flag++;
			}
		}
		if (flag == 0)
			System.out.println("No players from the given country");
		sc.close();
	}
}
