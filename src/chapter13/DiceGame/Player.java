package chapter13.DiceGame;

public class Player extends Thread {
	private String currentPlayer = null;
	private String otherPlayer = null;

	public Player(String thisPlayer) {
		currentPlayer = thisPlayer;
		// we've only two players; we remember them in
		// currentPlayer and otherPlater
		otherPlayer = thisPlayer.equals(Gamers.JOE) ? Gamers.JANE : Gamers.JOE;
	}

	public void run() {
		// each player rolls the dice 6 times in the game
		for (int i = 0; i < 6; i++) {
			// acquire the lock before proceeding
			synchronized (Dice.class) {
				// if its not currentPlayer's turn, then
				// wait for otherPlayer's notification
				while (!Dice.getTurn().equals(currentPlayer)) {
					try {
						Dice.class.wait(1000);
						System.out.println(currentPlayer + " was waiting for "
								+ otherPlayer);
					} catch (InterruptedException ie) {
						ie.printStackTrace();
					}
				}
			}
			System.out.println(Dice.getTurn() + " throws " + Dice.roll());
			Dice.setTurn(otherPlayer);
			Dice.class.notifyAll();
		}
	}
}
