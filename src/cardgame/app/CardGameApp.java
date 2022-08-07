package cardgame.app;

import java.util.Scanner;

import cardgame.domain.Game;
import cardgame.format.message.strategy.MessageFormattingStrategyImpl;
import cardgame.strategy.BlackJackStrategyImpl;

public class CardGameApp {

	public static void main(String[] args) {
		Scanner playerActionScanner = new Scanner(System.in);
		int numberOfPlayers = 3;
		Game game = new Game(numberOfPlayers, new BlackJackStrategyImpl(new MessageFormattingStrategyImpl()), new MessageFormattingStrategyImpl());
		game.startGame();
		boolean end = true;
		while(end) {
			String input = playerActionScanner.next();
			String display = game.processPlayerAction(input);
			System.out.println(display);
		}
		playerActionScanner.close();
	}
	


}
