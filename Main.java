package atm;

public class Main {
	public static void main(String[] args) {
		Bank bank = new Bank();
		GUI gui = new GUI();
		try {
			bank.run();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
