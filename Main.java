package atm;

public class Main {
	public static void main(String[] args) {
		ATM atm = new ATM();
		try {
			atm.run();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
