package chapter13.WaitnNotify;

public class Waiter extends Thread {
	public void getCoffee() {
		synchronized (CoffeeMachine.lock) {
			if (CoffeeMachine.coffeeMade == null) {
				try {
					// wait till the CoffeeMachine says(notifies) that
					// coffee is ready
					System.out
							.println("Waiter: Will get orders till Coffee machine notifies me");
					CoffeeMachine.lock.wait();
				} catch (InterruptedException ie) {
					// its okay to ignore this exception
					// since we're not using thread interrupt mechanism
					ie.printStackTrace();
				}
			}
			System.out
					.println("Waiter: Delivering " + CoffeeMachine.coffeeMade);
			CoffeeMachine.coffeeMade = null;
			// ask (notify) the coffee macine to prepare the next coffee
			CoffeeMachine.lock.notifyAll();
			System.out
					.println("Waiter: Notifying coffee machine to make another one");
		}
	}

	public void run() {
		// Keep going till the user presses crtl-C and terminates the program
		while (true) {
			getCoffee();
		}
	}
}
