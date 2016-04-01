package atm;

public class ATM {
	
	private int balance;
	
	public ATM(){
		balance = 0;
	}
	
	public void printMessage(String message){
		System.out.println(message);
	}
	
	public void printStarMessage(String message){
		String stars = "*****************************************\n";
		printMessage(stars + StringUtil.center(message, stars.length()) + stars);
	}
	
	public boolean selectFunction(int num){		
		switch (num){
			case 1: withdraw();
					break;
			case 2: deposit();
					break;
			case 3: inquire();
					break;
			case 4: quit();
					break;
			default: printErrorMess();
					break;
		}
		return true;
	}
	
	private void quit() {
		
	}

	private void printErrorMess() {
		
	}

	private void inquire() {
		// TODO Auto-generated method stub
		
	}

	private void deposit() {
		// TODO Auto-generated method stub
		
	}

	private void withdraw() {
		// TODO Auto-generated method stub
		
	}

	public void setBalance(int balance){
		this.balance = balance;
	}
	
	public int getBalance(){
		return balance;
	}
	
	
}
