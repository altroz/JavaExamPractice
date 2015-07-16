package chapter13.Synchronization2;

public class Counter implements Runnable {
	// this method increments runs variable first ad then
	// increments the balls variable since these variables
	// are accessible from other threads, we nned to acquire
	// a lock before processing them.

	public void IncrementBallAfterRun() {
		// since we're updating runs variable first, lock the Runs.class
		// reference first
		synchronized (Runs.class) {
			// now acquire lock on Balls.class variable updating balls variable
			synchronized (Balls.class) {
				Runs.runs++;
				Balls.balls++;
			}
		}
	}

	public void IncrementRunAfterBall() {
		// since we're updating balls variable first, lock the Balls.class
		// reference first
		synchronized (Balls.class) {
			synchronized (Runs.class) {
				// now acquire lock on Runs.class variable before updating runs
				// variable
				Balls.balls++;
				Runs.runs++;
			}
		}
	}

	public void run() {
		// call these two methods which acquire locks in different order
		// depending on thread schduling and the order of lock acquision,
		// a deadlock may or may not arise.
		IncrementBallAfterRun();
		IncrementRunAfterBall();
	}
}
