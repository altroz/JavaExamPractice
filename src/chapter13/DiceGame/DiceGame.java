package chapter13.DiceGame;

public class DiceGame {
	public static void main(String[] args) {
		Player player1 = new Player(Gamers.JANE);
		Player player2 = new Player(Gamers.JOE);
		// don't forget to set who starts the game
		Dice.setWhoStarts(Gamers.JOE);
		player1.start();
		player2.start();
	}
}
