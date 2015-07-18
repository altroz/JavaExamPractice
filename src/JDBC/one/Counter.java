package JDBC.one;

public class Counter implements Runnable {

	public void IncrementBallAtfterRun() {
		synchronized (Runs.class) {
			Runs.runs++;
			Balls.balls++;
		}
	}

	public void IncrementRunAfterBall() {
		synchronized (Balls.class) {
			synchronized (Runs.class) {
				Balls.balls++;
				Runs.runs++;
			}
		}
	}

	public void run() {
		IncrementBallAtfterRun();
		IncrementRunAfterBall();
	}
}
